package com.eratoiklio.neighborscar.user;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepositoryCustom{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUserByName(UserRequest userRequest) {
        String queryString = "SELECT u FROM User u " +
                "WHERE u.firstName = :firstName " +
                "AND u.surname = :surname";
        Query query = entityManager
                .createQuery(queryString, User.class);
        query.setParameter("firstName", userRequest.getFirstName())
                .setParameter("surname", userRequest.getSurname());

        return query.getResultList();
    }
}
