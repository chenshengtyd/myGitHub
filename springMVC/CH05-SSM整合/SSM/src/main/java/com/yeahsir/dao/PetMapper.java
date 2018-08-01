package com.yeahsir.dao;

import com.yeahsir.entity.Pet;

public interface PetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pet record);

    int insertSelective(Pet record);

    Pet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pet record);

    int updateByPrimaryKey(Pet record);
}