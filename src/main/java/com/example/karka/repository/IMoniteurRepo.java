package com.example.karka.repository;

import com.example.karka.entity.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMoniteurRepo extends JpaRepository <Moniteur,Long> {
    @Query("SELECT DISTINCT i.numSemaine FROM Moniteur m " +
            "JOIN m.cours c " +
            "JOIN c.inscriptions i " +
            "WHERE m = ?1 AND c.support = ?2")
    List<Integer> findWeekNumbersByMoniteurAndSupport(Moniteur moniteur, String support);
}
