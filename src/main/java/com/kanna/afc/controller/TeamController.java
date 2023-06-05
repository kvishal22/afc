package com.kanna.afc.controller;

import com.kanna.afc.entity.MyTeams;
import com.kanna.afc.entity.Teams;
import com.kanna.afc.service.MyTeamService;
import com.kanna.afc.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TeamController {

    private final TeamService service;
    private final MyTeamService myTeamService;

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/team_register")
    public String register(){
        return "register";
    }
    @GetMapping("/matches")
        public ModelAndView matches(){
        List<Teams> list = service.getALl();
            return new ModelAndView("matches", "team", list);
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Teams teams){
        service.save(teams);
        return "redirect:/matches";
    }
    @GetMapping("/my_teams")
    public String myTeams(Model model){
        List<MyTeams> list= myTeamService.getAll();
        model.addAttribute("team", list);
        return "myTeams";
    }
    @RequestMapping("/mylist/{id}")
    public String getById(@PathVariable int id){
        Teams teams = service.getById(id);
        MyTeams myTeams = new MyTeams(teams.getId(), teams.getTeamName(),teams.getEmail(), teams.getContactNumber());
        myTeamService.save(myTeams);
        return "redirect:/my_teams";
    }
    @RequestMapping("/editTeam/{id}")
    public String edit(@PathVariable int id, Model model){
        Teams teams = service.getById(id);
        model.addAttribute("team", teams);
        return "teamEdit";
    }
    @RequestMapping("/deleteTeam/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/matches";
    }
}
