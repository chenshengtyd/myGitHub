package com.whcs.dao;

import com.whcs.entity.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Student queryStudent();

    List<Student> queryStudentLike(List<Integer> list);
}