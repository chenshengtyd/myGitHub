package cn.javass.chapter7.web.controller.support.converter;

import org.springframework.core.convert.converter.Converter;

public class StringToIntegerConverter implements Converter<String, Integer> {

	@Override
	public Integer convert(String source) {
		return Integer.valueOf(source);
	}

}
