package com.greefox.demoexam.Service;

import com.greefox.demoexam.Repsitories.SpaceShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpaceShipService {

    @Autowired
    SpaceShipRepository spaceShipRepository;
}
