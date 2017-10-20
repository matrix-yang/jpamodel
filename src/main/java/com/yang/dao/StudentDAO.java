package com.yang.dao;

import com.yang.entity.StudentEntity;
import com.yang.util.HibernateSessionFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentDAO {
    public void save(StudentEntity studentEntity) {
        EntityManager entityManager = HibernateSessionFactory.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(studentEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<StudentEntity> findAll() {
        EntityManager entityManager = HibernateSessionFactory.getEntityManager();
        entityManager.getTransaction().begin();
        List<StudentEntity> result = entityManager.createQuery("select p " +
                "from StudentEntity p ").getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
    }

}
