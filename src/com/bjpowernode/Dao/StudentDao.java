package com.bjpowernode.Dao;

import com.bjpowernode.domain.Student;

import java.util.HashMap;
import java.util.List;

public interface StudentDao {




    public Student getById(String id);
    public void save(Student student);

    List<Student> getAll();

    List<Student> select2(HashMap<String, Object> map);
    List<Student> guoguo(String a);


    List<HashMap<String, Object>> sele();
}
