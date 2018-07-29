package com.whcs.test;

import com.whcs.dao.StudentMapper;
import com.whcs.dao.TeacherMapper;
import com.whcs.entity.Student;
import com.whcs.entity.Teacher;
import com.whcs.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by Yegz on 2017/8/23.
 */
public class TeacherTest {

    @Test
    public void queryStudent() {
        SqlSession session = null;
        try {
            session = MybatisUtil.createSqlSession();
            Teacher teacher = session.getMapper(TeacherMapper.class).queryTeacher();
            System.out.println("老师：" + teacher.getTname());
            System.out.println("学生信息如下：");
            teacher.getStudents().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSqlSession(session);
        }
    }
}
