package com.admir.demiraj.datacatalogspringboot.controller;


import org.aspectj.lang.annotation.Before;
import org.bouncycastle.math.ec.ScaleYPointMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


// This initializes all the beans in my application in order for them to be available through @Autowired
//@SpringBootTest

// This initializes only the beans(classes) that are requested
@ContextConfiguration(classes = {VersionController.class})
public class VersionControllerUnitTests {

    @Autowired
    private VersionController versionController;


}
