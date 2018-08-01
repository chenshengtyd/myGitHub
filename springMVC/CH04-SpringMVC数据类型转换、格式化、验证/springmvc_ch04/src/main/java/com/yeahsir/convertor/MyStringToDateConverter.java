package com.yeahsir.convertor;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.IllegalFormatException;

/**
 * Created by Yegz on 2017/9/13.
 */
public class MyStringToDateConverter implements Converter<String, Date> {

    private DateFormat[] formats = new SimpleDateFormat[]{
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyy/MM/dd"),
            new SimpleDateFormat("yyyy.MM.dd"),
            new SimpleDateFormat("yyyy MM dd"),
            new SimpleDateFormat("yyyy年MM月dd日"),
            new SimpleDateFormat("yyyy年MM月dd")
    };

    @Override
    public Date convert(String source) {
        if("".equals(source.trim()) || source == null){
            return null;
        }else{
            Date date = null;
            for (DateFormat dateFormat: formats) {
                try {
                    date= dateFormat.parse(source);//转换类型匹配
                } catch (ParseException e) {
                    continue;
                }
            }
            /*if(date == null){
                //③转化失败
                throw new IllegalArgumentException(String.format("类型转换失败，需要格式%s，但格式是[%s]", "yyyy-MM-dd",source));
            }*/
            return date;
        }

    }
}
