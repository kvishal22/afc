package com.kanna.afc.repo;

import com.kanna.afc.entity.MyTeams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTeamsRepo extends JpaRepository<MyTeams, Integer> {
}
