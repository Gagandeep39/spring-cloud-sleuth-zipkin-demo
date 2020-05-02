/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-02 18:05:37
 * @modify date 2020-05-02 18:05:37
 * @desc [description]
 */
package com.gagan.springsleuthpatientservice.controller;

import com.gagan.springsleuthpatientservice.service.PatientService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PatientController {

    private static Logger logger = LoggerFactory.getLogger(PatientController.class);

    @Autowired
    private PatientService patientService;
    
    @GetMapping("/allPatients/{city}")
    public String patients(@PathVariable String city){
        logger.info("got hit on /allPatients/"+city);
        return patientService.getPatients(city);
    }
    
}