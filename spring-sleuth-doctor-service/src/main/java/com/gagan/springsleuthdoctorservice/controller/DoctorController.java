/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-02 17:28:11
 * @modify date 2020-05-02 17:28:11
 * @desc [description]
 */
package com.gagan.springsleuthdoctorservice.controller;

import com.gagan.springsleuthdoctorservice.service.DoctorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    private static Logger logger = LoggerFactory.getLogger(DoctorController.class);

    @Autowired
    private DoctorService doctorService;
    
    @GetMapping("/allDoctors/{hospital}")
    public String doctors(@PathVariable String hospital){
        logger.info("got hit on /allDoctors/"+hospital);
        return doctorService.getDoctors(hospital);
    }

}