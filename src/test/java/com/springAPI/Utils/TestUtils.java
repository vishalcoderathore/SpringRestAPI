package com.springAPI.Utils;

import java.nio.charset.Charset;

import org.springframework.http.MediaType;

public class TestUtils {
	 
    public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(),
                                                                        MediaType.APPLICATION_JSON.getSubtype(),                        
                                                                        Charset.forName("utf8")                     
                                                                        );
}
