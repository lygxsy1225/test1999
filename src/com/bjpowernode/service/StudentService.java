package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.HashMap;
import java.util.List;

public interface StudentService {
    public Student getById(String id);
    public void save(Student student);

    List<Student> getAll();

    List<Student> select2(HashMap<String, Object> map);

    List<Student> guoguo(String a);

    List<HashMap<String, Object>> sele();
}
