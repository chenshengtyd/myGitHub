package com.yeahsir.service;

import com.yeahsir.entity.Pet;

/**
 * Created by Yegz on 2017/9/14.
 */
public interface IPetService {

    Pet selectByPrimaryKey(Integer id);
}
