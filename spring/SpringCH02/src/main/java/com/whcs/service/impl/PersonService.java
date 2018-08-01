package com.whcs.service.impl;

import com.whcs.dao.IPersonDao;
import com.whcs.dao.IUserDao;
import com.whcs.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Yegz on 2017/9/4.
 */
@Service("personService")
public class PersonService implements IPersonService {

    @Autowired
    private IPersonDao personDao;

    @Override
    public void getPersonInfo() {
        personDao.getPersonInfo();
    }
}
