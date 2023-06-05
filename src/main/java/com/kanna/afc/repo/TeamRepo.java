package com.kanna.afc.repo;

import com.kanna.afc.entity.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<Teams, Integer> {
}
