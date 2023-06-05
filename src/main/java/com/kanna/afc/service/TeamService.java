package com.kanna.afc.service;

import com.kanna.afc.entity.Teams;
import com.kanna.afc.repo.TeamRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {
    private final TeamRepo repo;

    public void save(Teams teams){
        repo.save(teams);
    }
    public List<Teams> getALl(){
        return repo.findAll();
    }
    public Teams getById(int id){
        return repo.findById(id).get();
    }
    public void delete(int id){
        repo.deleteById(id);
    }
}
