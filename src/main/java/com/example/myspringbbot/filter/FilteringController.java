package com.example.myspringbbot.filter;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	// name, age
	@GetMapping("/filtering")
	public MappingJacksonValue retrieveMyBean() {
		MyBean myBean = new MyBean("Dowon", "10", "SEOUL");
		
		SimpleBeanPropertyFilter filter = 
				SimpleBeanPropertyFilter.filterOutAllExcept("name", "age");
		
		FilterProvider filters = new SimpleFilterProvider()
				.addFilter("MyBeanFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(myBean);
		mapping.setFilters(filters);
		
		return mapping;
	}
	
	// age, address
	@GetMapping("/filtering-list")
	public MappingJacksonValue retrieveListOfMyBeans() {
		List<MyBean> list = Arrays.asList(
				new MyBean("Dowon", "10", "SEOUL"),
				new MyBean("KT", "20", "SUWON"),
				new MyBean("KTDS", "30", "BUSAN"));
		
		SimpleBeanPropertyFilter filter = 
				SimpleBeanPropertyFilter.filterOutAllExcept("age", "address");
		
		FilterProvider filters = new SimpleFilterProvider()
				.addFilter("MyBeanFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(list);
		mapping.setFilters(filters);
		
		return mapping;
	}
}









