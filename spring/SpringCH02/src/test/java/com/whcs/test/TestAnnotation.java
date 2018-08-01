package com.whcs.test;

import com.whcs.service.IPersonService;
import com.whcs.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Yegz on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:Spring-Config.xml"})
public class TestAnnotation {

    @Autowired
    private IPersonService personService;

    @Test
    public void method1(){
        personService.getPersonInfo();
    }
}
