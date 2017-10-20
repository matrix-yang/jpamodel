package com.yang.test;


import com.yang.entity.StudentEntity;
import com.yang.dao.StudentDAO;

public class StartMain {
    public static void  main(String[] args){
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setName("yang");
        StudentDAO studentDAO=new StudentDAO();
        studentDAO.save(studentEntity);
    }
}
