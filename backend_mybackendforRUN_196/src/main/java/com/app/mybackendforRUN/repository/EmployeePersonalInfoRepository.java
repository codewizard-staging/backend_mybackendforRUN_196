package com.app.mybackendforRUN.repository;

import com.app.mybackendforRUN.model.EmployeePersonalInfo;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class EmployeePersonalInfoRepository extends SimpleJpaRepository<EmployeePersonalInfo, String> {
    private final EntityManager em;
    public EmployeePersonalInfoRepository(EntityManager em) {
        super(EmployeePersonalInfo.class, em);
        this.em = em;
    }
    @Override
    public List<EmployeePersonalInfo> findAll() {
        return em.createNativeQuery("Select * from \"mybackendforrun\".\"EmployeePersonalInfo\"", EmployeePersonalInfo.class).getResultList();
    }
}