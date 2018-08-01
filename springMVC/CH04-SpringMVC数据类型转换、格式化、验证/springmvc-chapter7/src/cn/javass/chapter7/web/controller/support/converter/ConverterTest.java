package cn.javass.chapter7.web.controller.support.converter;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.core.convert.support.DefaultConversionService;

import cn.javass.chapter7.model.PhoneNumberModel;

public class ConverterTest {
	
	@Test
	public void testStringToPhoneNumberConvert() {
		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new StringToPhoneNumberConverter());
		
		String phoneNumberStr = "010-12345678";
		PhoneNumberModel phoneNumber = conversionService.convert(phoneNumberStr, PhoneNumberModel.class);
		
		Assert.assertEquals("010", phoneNumber.getAreaCode());
	}

	@Test
	public void testOtherConvert() {
		DefaultConversionService conversionService = new DefaultConversionService();
		
		//"1"--->true
		Assert.assertEquals(Boolean.valueOf(true), conversionService.convert("1", Boolean.class));
		
		//"1,2,3,4"--->List
		Assert.assertEquals(4, conversionService.convert("1,2,3,4", List.class).size());
	}
}
