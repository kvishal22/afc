package com.kanna.afc.service;

import com.kanna.afc.entity.MyTeams;
import com.kanna.afc.repo.MyTeamsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyTeamService {

    private final MyTeamsRepo repo;

    public void save(MyTeams teams){
        repo.save(teams);
    }
    public List<MyTeams> getAll(){
        return repo.findAll();
    }
    public void deleteById(int id){
        repo.deleteById(id);
    }
}
