package org.example.demoss12maven.repository;

import org.example.demoss12maven.entity.Medicine;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MedicineRepository {
    @Autowired
    private SessionFactory sessionFactory;
    public List<Medicine> findExpired() {
        String hql = "FROM Medicine m WHERE m.expiryDate < :now";
        return sessionFactory.getCurrentSession()
                .createQuery(hql, Medicine.class)
                .setParameter("now", new java.util.Date())
                .getResultList();
    }
}