package com.whcs.dao.impl;

import com.whcs.dao.IPersonDao;
import org.springframework.stereotype.Repository;

/**
 * Created by Yegz on 2017/9/4.
 */
@Repository("personDao")
public class PersonDao implements IPersonDao {
    @Override
    public void getPersonInfo() {
        System.out.println("我是Dao包下面的personDao实现类");
    }
}
