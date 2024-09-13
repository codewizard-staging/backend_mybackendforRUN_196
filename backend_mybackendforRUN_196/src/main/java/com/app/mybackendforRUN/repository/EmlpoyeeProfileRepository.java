package com.app.mybackendforRUN.repository;

import com.app.mybackendforRUN.model.EmlpoyeeProfile;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class EmlpoyeeProfileRepository extends SimpleJpaRepository<EmlpoyeeProfile, String> {
    private final EntityManager em;
    public EmlpoyeeProfileRepository(EntityManager em) {
        super(EmlpoyeeProfile.class, em);
        this.em = em;
    }
    @Override
    public List<EmlpoyeeProfile> findAll() {
        return em.createNativeQuery("Select * from \"mybackendforrun\".\"EmlpoyeeProfile\"", EmlpoyeeProfile.class).getResultList();
    }
}