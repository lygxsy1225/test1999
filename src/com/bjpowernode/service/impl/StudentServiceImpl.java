package com.bjpowernode.service.impl;

import com.bjpowernode.Dao.StudentDao;
import com.bjpowernode.Util.SqlSessionUtil;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;

import java.util.HashMap;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
    @Override
    public Student getById(String id) {
        Student student = studentDao.getById(id);
        return student;
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = studentDao.getAll();
        return students;
    }

    @Override
    public List<Student> select2(HashMap<String, Object> map) {
        List<Student> list = studentDao.select2(map);
        return list;
    }

    @Override
    public List<Student> guoguo(String a) {
        List<Student> students2 = studentDao.guoguo(a);
        return students2;
    }

    @Override
    public List<HashMap<String, Object>> sele() {
        List<HashMap<String, Object>> list = studentDao.sele();
        return list;
    }


}
