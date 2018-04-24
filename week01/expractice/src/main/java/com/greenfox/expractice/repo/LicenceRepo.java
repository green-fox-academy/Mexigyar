package com.greenfox.expractice.repo;

import com.greenfox.expractice.model.LicencePlates;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenceRepo extends CrudRepository<LicencePlates, String> {

    List<LicencePlates> findAllByPlateStartsWith(String string);
    List<LicencePlates> findAllByPlateContains(String string);
    List<LicencePlates> findAllByCarBrandEquals(String string);
}
