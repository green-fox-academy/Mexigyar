package com.greenfox.expractice.service;

import com.greenfox.expractice.repo.LicenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

    @Autowired
    LicenceRepo licenceRepo;
}
