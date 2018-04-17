package com.greefox.demoexam.Repsitories;

import com.greefox.demoexam.Modell.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<Planet, Integer> {
}
