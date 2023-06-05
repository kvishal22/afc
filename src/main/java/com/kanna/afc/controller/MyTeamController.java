package com.kanna.afc.controller;

import com.kanna.afc.service.MyTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MyTeamController {

    private final MyTeamService service;

    @RequestMapping("/deleteMyList/{id}")
    public String delete(@PathVariable int id){
        service.deleteById(id);
        return "redirect:/my_teams";
    }
}
