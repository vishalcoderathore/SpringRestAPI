package com.springAPI.controller;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.springAPI.RestaurantApiApplication;
import com.springAPI.Utils.TestUtils;
import com.springAPI.model.DayWithRestaurantOrder;
import com.springAPI.model.DropOff;
import com.springAPI.model.RestaurantOrder;
import com.springAPI.service.RestaurantDeliveryServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RestaurantApiApplication.class)
@WebAppConfiguration
public class RestaurantOrderControllerTest {

	private MockMvc mockMvc;

	@Mock
	private RestaurantDeliveryServiceImpl restaurantDeliveryServiceImplMock;

	@InjectMocks
	private RestaurantOrderController obj;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(obj).build();
	}
	
	@Test
	public void DropOff_ShouldReturnDeliveries () throws Exception {
		
		//Create Mock Result
		RestaurantOrder rest = new RestaurantOrder();
		rest.setRestaurantName("Nacho's Mexican Grill");
		rest.setLogoUrl("https://www.placehold.it/300X200");
		rest.setCutoff("10:00:00");
		rest.setDropOff("11:15:00");
		rest.setSoldOut(false);
		rest.setSellingOut(false);
		rest.setIsPastCutoff(false);
		rest.setIsOrderPlaced(false);
		rest.setDeliveryId(47L);
		rest.setDay("Monday");
		rest.setStoreId(1L);
		
		 DayWithRestaurantOrder dayWithRestaurantOder = new DayWithRestaurantOrder();
		 List<RestaurantOrder> allOrders = new ArrayList<>();
		 allOrders.add(rest);
		 dayWithRestaurantOder.setDay("Monday");
		 dayWithRestaurantOder.setDeliveries(allOrders);
		
		List<DayWithRestaurantOrder> dayWithRestaurantOders = new ArrayList<>();
		dayWithRestaurantOders.add(dayWithRestaurantOder);
		DropOff dropOff = new DropOff();
		dropOff.setDayWithRestaurantOder(dayWithRestaurantOders);
		
		//Render mocked result
		when(restaurantDeliveryServiceImplMock.findDeliveries()).thenReturn(dropOff);
		
		//Test rendered result
		 mockMvc.perform(get("/deliveries"))
         .andExpect(status().isOk())
         .andExpect(content().contentType(TestUtils.APPLICATION_JSON_UTF8))
         .andExpect(jsonPath("$.*", hasSize(1)))
		 .andExpect(jsonPath("dropoffs.[0].day", is("Monday")))
         .andExpect(jsonPath("dropoffs.[0].deliveries.[0].restaurantName", is("Nacho's Mexican Grill")))
         .andExpect(jsonPath("dropoffs.[0].deliveries.[0].logoUrl", is("https://www.placehold.it/300X200")))
         .andExpect(jsonPath("dropoffs.[0].deliveries.[0].cutoff", is("10:00:00")))
         .andExpect(jsonPath("dropoffs.[0].deliveries.[0].dropOff", is("11:15:00")))
         .andExpect(jsonPath("dropoffs.[0].deliveries.[0].soldOut", is(false)))         
         .andExpect(jsonPath("dropoffs.[0].deliveries.[0].sellingOut", is(false)))
         .andExpect(jsonPath("dropoffs.[0].deliveries.[0].isPastCutoff", is(false)))
         .andExpect(jsonPath("dropoffs.[0].deliveries.[0].isOrderPlaced", is(false)))
         .andExpect(jsonPath("dropoffs.[0].deliveries.[0].storeId", is(1)))
         .andExpect(jsonPath("dropoffs.[0].deliveries.[0].deliveryId", is(47)));
	}
}
