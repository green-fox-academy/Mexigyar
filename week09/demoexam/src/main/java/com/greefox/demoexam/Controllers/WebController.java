package com.greefox.demoexam.Controllers;

import com.greefox.demoexam.Modell.Planet;
import com.greefox.demoexam.Modell.SpaceShip;
import com.greefox.demoexam.Repsitories.PlanetRepository;
import com.greefox.demoexam.Repsitories.SpaceShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/spacetransporter")
public class WebController {

    @Autowired
    PlanetRepository planetRepository;

    @Autowired
    SpaceShipRepository spaceShipRepository;

    @GetMapping("/")
    public String indexPage(Model model){
        ArrayList<Planet> planets = new ArrayList<>();
        ArrayList<SpaceShip> ships = new ArrayList<>();
        planetRepository.findAll().forEach(planets::add);
        spaceShipRepository.findAll().forEach(ships::add);
        model.addAttribute("planets",planets);
        model.addAttribute("ships", ships);
        return "index";
    }
}
