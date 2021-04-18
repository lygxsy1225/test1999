package com.bjpowernode.test;

import com.bjpowernode.Dao.StudentDao;
import com.bjpowernode.Util.ServiceFactory;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        StudentService ss = (StudentService) ServiceFactory.getServce(new StudentServiceImpl());

        List<HashMap<String,Object>> list = ss.sele();
        for (HashMap<String,Object> i:list){
            Set<String> set = i.keySet();
            for (String key:set){
                System.out.println(key);
                System.out.println(i.get(key));
            }
        }
    }
}
