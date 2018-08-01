package com.yeahsir.convertor;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义时间格式类型转换器
 * Created by Yegz on 2017/9/12.
 */
public class MyDateFormaterConverter implements Converter<String, Date> {

    private DateFormat[] formats = new SimpleDateFormat[]{
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyy.MM.dd"),
            new SimpleDateFormat("yyyy/MM/dd"),
            new SimpleDateFormat("yyyy年MM月dd"),
            new SimpleDateFormat("yyyy年MM月dd日"),
            new SimpleDateFormat("yyyy MM dd"),
    };

    @Override
    public Date convert(String source) {
        if("".equals(source.trim()) || source == null){
            return null;
        }else{
            Date date = null;
            for (DateFormat dateFormat: formats) {
                try {
                    date = dateFormat.parse(source);
                } catch (ParseException e) {
                    continue;//都进行尝试
                }
            }
            return date;
        }
    }
}
