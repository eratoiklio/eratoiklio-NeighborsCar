package com.eratoiklio.neighborscar.ride;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class RideRepositoryImpl implements RideRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ride> getRidesByCriteria(RideRequest rideRequest) {
        String queryString = "SELECT r FROM Ride r " +
                "WHERE r.rideFrom LIKE CONCAT('%', :rideFrom, '%') " +
                "AND r.rideTo = :rideTo";
        Query query = entityManager
                .createQuery(queryString, Ride.class);
        query.setParameter("rideFrom", rideRequest.getRideFrom())
            .setParameter("rideTo", rideRequest.getRideTo());
       //.setParameter("date", rideRequest.getDate());
        return query.getResultList();
    }
}
