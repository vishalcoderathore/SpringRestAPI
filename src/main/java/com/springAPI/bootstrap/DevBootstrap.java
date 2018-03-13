package com.springAPI.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springAPI.model.RestaurantOrder;
import com.springAPI.repository.RestaurantOrderRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	private RestaurantOrderRepository restaurantRepository;
	
	public DevBootstrap(RestaurantOrderRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
		
	}
	
	//Sample JSON Data 
	private void initData() {
		//Deliveries for Monday
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
		restaurantRepository.save(rest);
		
		RestaurantOrder rest2 = new RestaurantOrder();
		rest2.setRestaurantName("Jersey Mike's Subs");
		rest2.setLogoUrl("https://www.placehold.it/300X200");
		rest2.setCutoff("10:30:00");
		rest2.setDropOff("11:15:00");
		rest2.setSoldOut(false);
		rest2.setSellingOut(false);
		rest2.setIsPastCutoff(false);
		rest2.setIsOrderPlaced(false);
		rest2.setDeliveryId(25L);
		rest2.setDay("Monday");
		rest2.setStoreId(2L);
		restaurantRepository.save(rest2);
		
		RestaurantOrder rest3 = new RestaurantOrder();
		rest3.setRestaurantName("Mort's Delicatessen");
		rest3.setLogoUrl("https://www.placehold.it/300X200");
		rest3.setCutoff("09:30:00");
		rest3.setDropOff("11:35:00");
		rest3.setSoldOut(false);
		rest3.setSellingOut(true);
		rest3.setIsPastCutoff(false);
		rest3.setIsOrderPlaced(false);
		rest3.setDeliveryId(34L);
		rest3.setDay("Monday");
		rest3.setStoreId(3L);
		restaurantRepository.save(rest3);
		
		RestaurantOrder rest4 = new RestaurantOrder();
		rest4.setRestaurantName("Ham's Sandwich Shop");
		rest4.setLogoUrl("https://www.placehold.it/300X200");
		rest4.setCutoff("10:30:00");
		rest4.setDropOff("12:00:00");
		rest4.setSoldOut(true);
		rest4.setSellingOut(true);
		rest4.setIsPastCutoff(true);
		rest4.setIsOrderPlaced(false);
		rest4.setDeliveryId(87L);
		rest4.setDay("Monday");
		rest4.setStoreId(4L);
		restaurantRepository.save(rest4);
		
		//Deliveries on Tuesday
		RestaurantOrder rest5 = new RestaurantOrder();
		rest5.setRestaurantName("Firehouse Subs");
		rest5.setLogoUrl("https://www.placehold.it/300X200");
		rest5.setCutoff("10:30:00");
		rest5.setDropOff("11:20:00");
		rest5.setSoldOut(false);
		rest5.setSellingOut(false);
		rest5.setIsPastCutoff(true);
		rest5.setIsOrderPlaced(false);
		rest5.setDeliveryId(68L);
		rest5.setDay("Tuesday");
		rest5.setStoreId(5L);
		restaurantRepository.save(rest5);
		
		RestaurantOrder rest6 = new RestaurantOrder();
		rest6.setRestaurantName("Which Wich");
		rest6.setLogoUrl("https://www.placehold.it/300X200");
		rest6.setCutoff("10:30:00");
		rest6.setDropOff("11:50:00");
		rest6.setSoldOut(false);
		rest6.setSellingOut(false);
		rest6.setIsPastCutoff(true);
		rest6.setIsOrderPlaced(false);
		rest6.setDeliveryId(55L);
		rest6.setDay("Tuesday");
		rest6.setStoreId(6L);
		restaurantRepository.save(rest6);
		
		RestaurantOrder rest7 = new RestaurantOrder();
		rest7.setRestaurantName("Gion Restaurant");
		rest7.setLogoUrl("https://www.placehold.it/300X200");
		rest7.setCutoff("10:30:00");
		rest7.setDropOff("12:00:00");
		rest7.setSoldOut(false);
		rest7.setSellingOut(false);
		rest7.setIsPastCutoff(true);
		rest7.setIsOrderPlaced(false);
		rest7.setDeliveryId(22L);
		rest7.setDay("Tuesday");
		rest7.setStoreId(7L);
		restaurantRepository.save(rest7);
		
		RestaurantOrder rest8 = new RestaurantOrder();
		rest8.setRestaurantName("Living Waters Market & Cafe");
		rest8.setLogoUrl("https://www.placehold.it/300X200");
		rest8.setCutoff("10:15:00");
		rest8.setDropOff("12:20:00");
		rest8.setSoldOut(false);
		rest8.setSellingOut(false);
		rest8.setIsPastCutoff(true);
		rest8.setIsOrderPlaced(false);
		rest8.setDeliveryId(62L);
		rest8.setDay("Tuesday");
		rest8.setStoreId(8L);
		restaurantRepository.save(rest8);
		
		//Deliveries on Thursday
		RestaurantOrder rest9 = new RestaurantOrder();
		rest9.setRestaurantName("Jersey Mike's Subs");
		rest9.setLogoUrl("https://www.placehold.it/300X200");
		rest9.setCutoff("10:30:00");
		rest9.setDropOff("11:15:00");
		rest9.setSoldOut(false);
		rest9.setSellingOut(false);
		rest9.setIsPastCutoff(true);
		rest9.setIsOrderPlaced(false);
		rest9.setDeliveryId(28L);
		rest9.setDay("Thursday");
		rest9.setStoreId(2L);
		restaurantRepository.save(rest9);
		
		RestaurantOrder rest10 = new RestaurantOrder();
		rest10.setRestaurantName("Leeann Chin");
		rest10.setLogoUrl("https://www.placehold.it/300X200");
		rest10.setCutoff("10:15:00");
		rest10.setDropOff("11:35:00");
		rest10.setSoldOut(false);
		rest10.setSellingOut(false);
		rest10.setIsPastCutoff(true);
		rest10.setIsOrderPlaced(false);
		rest10.setDeliveryId(9L);
		rest10.setDay("Thursday");
		rest10.setStoreId(9L);
		restaurantRepository.save(rest10);
		
		RestaurantOrder rest11 = new RestaurantOrder();
		rest11.setRestaurantName("Erbert & Gerbert's Sandwich Shop");
		rest11.setLogoUrl("https://www.placehold.it/300X200");
		rest11.setCutoff("10:00:00");
		rest11.setDropOff("11:55:00");
		rest11.setSoldOut(false);
		rest11.setSellingOut(false);
		rest11.setIsPastCutoff(true);
		rest11.setIsOrderPlaced(false);
		rest11.setDeliveryId(13L);
		rest11.setDay("Thursday");
		rest11.setStoreId(10L);
		restaurantRepository.save(rest11);
	
		//Deliveries on Friday
		RestaurantOrder rest12 = new RestaurantOrder();
		rest12.setRestaurantName("Granite City");
		rest12.setLogoUrl("https://www.placehold.it/300X200");
		rest12.setCutoff("10:15:00");
		rest12.setDropOff("11:30:00");
		rest12.setSoldOut(false);
		rest12.setSellingOut(false);
		rest12.setIsPastCutoff(true);
		rest12.setIsOrderPlaced(false);
		rest12.setDeliveryId(15L);
		rest12.setDay("Friday");
		rest12.setStoreId(11L);
		restaurantRepository.save(rest12);
		
		RestaurantOrder rest13 = new RestaurantOrder();
		rest13.setRestaurantName("Chili's Grill & Bar");
		rest13.setLogoUrl("https://www.placehold.it/300X200");
		rest13.setCutoff("10:00:00");
		rest13.setDropOff("11:55:00");
		rest13.setSoldOut(false);
		rest13.setSellingOut(false);
		rest13.setIsPastCutoff(true);
		rest13.setIsOrderPlaced(false);
		rest13.setDeliveryId(97L);
		rest13.setDay("Friday");
		rest13.setStoreId(12L);
		restaurantRepository.save(rest13);
		
		RestaurantOrder rest14 = new RestaurantOrder();
		rest14.setRestaurantName("Godfather's Pizza");
		rest14.setLogoUrl("https://www.placehold.it/300X200");
		rest14.setCutoff("10:15:00");
		rest14.setDropOff("11:55:00");
		rest14.setSoldOut(false);
		rest14.setSellingOut(false);
		rest14.setIsPastCutoff(true);
		rest14.setIsOrderPlaced(false);
		rest14.setDeliveryId(37L);
		rest14.setDay("Friday");
		rest14.setStoreId(13L);
		restaurantRepository.save(rest14);
		
		RestaurantOrder rest15 = new RestaurantOrder();
		rest15.setRestaurantName("Eddington's");
		rest15.setLogoUrl("https://www.placehold.it/300X200");
		rest15.setCutoff("10:00:00");
		rest15.setDropOff("12:00:00");
		rest15.setSoldOut(false);
		rest15.setSellingOut(false);
		rest15.setIsPastCutoff(true);
		rest15.setIsOrderPlaced(false);
		rest15.setDeliveryId(36L);
		rest15.setDay("Friday");
		rest15.setStoreId(14L);
		restaurantRepository.save(rest15);
		
		RestaurantOrder rest16 = new RestaurantOrder();
		rest16.setRestaurantName("Quiznos");
		rest16.setLogoUrl("https://www.placehold.it/300X200");
		rest16.setCutoff("10:30:00");
		rest16.setDropOff("12:00:00");
		rest16.setSoldOut(false);
		rest16.setSellingOut(false);
		rest16.setIsPastCutoff(true);
		rest16.setIsOrderPlaced(false);
		rest16.setDeliveryId(99L);
		rest16.setDay("Friday");
		rest16.setStoreId(15L);
		restaurantRepository.save(rest16);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// TODO Auto-generated method stub
		initData();
	}
}
