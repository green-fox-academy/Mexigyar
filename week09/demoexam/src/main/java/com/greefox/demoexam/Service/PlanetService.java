package com.greefox.demoexam.Service;

import com.greefox.demoexam.Repsitories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {

    @Autowired
    PlanetRepository planetRepository;
}
