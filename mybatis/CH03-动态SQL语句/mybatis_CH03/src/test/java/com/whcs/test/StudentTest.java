package com.whcs.test;

import com.whcs.dao.StudentMapper;
import com.whcs.entity.Student;
import com.whcs.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yegz on 2017/8/23.
 */
public class StudentTest {

    @Test
    public void queryStudent() {
        SqlSession session = null;
        try {
            session = MybatisUtil.createSqlSession();
            List<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(5);
            list.add(6);

            List<Student> students = session.getMapper(StudentMapper.class).queryStudentLike(list);
            students.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSqlSession(session);
        }
    }
}
