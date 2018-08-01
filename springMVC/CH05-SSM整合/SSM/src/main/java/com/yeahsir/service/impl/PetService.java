package com.yeahsir.service.impl;

import com.yeahsir.dao.PetMapper;
import com.yeahsir.entity.Pet;
import com.yeahsir.service.IPetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Yegz on 2017/9/14.
 */
@Service("petService")
public class PetService implements IPetService {

    @Resource
    PetMapper petMapper;

    @Override
    public Pet selectByPrimaryKey(Integer id) {
        return petMapper.selectByPrimaryKey(id);
    }
}
