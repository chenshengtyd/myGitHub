package cn.javass.chapter7.web.controller.support.converter;

import org.springframework.core.convert.converter.Converter;

import cn.javass.chapter7.model.PhoneNumberModel;

//PhoneNumberModel------>String
public class PhoneNumberToStringConverter implements Converter<PhoneNumberModel, String> {

	@Override
	public String convert(PhoneNumberModel source) {
		
		if(source == null) {
			return "";
		}
		
		return new StringBuilder()
					.append(source.getAreaCode()).append("-")
					.append(source.getPhoneNumber()).toString();

	}

}
