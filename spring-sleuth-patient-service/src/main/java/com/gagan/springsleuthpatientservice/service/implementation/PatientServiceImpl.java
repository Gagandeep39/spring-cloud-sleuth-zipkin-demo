/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-02 18:05:30
 * @modify date 2020-05-02 18:05:30
 * @desc [description]
 */
package com.gagan.springsleuthpatientservice.service.implementation;

import com.gagan.springsleuthpatientservice.service.PatientService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class PatientServiceImpl implements PatientService {

    private static Logger logger = LoggerFactory.getLogger(PatientServiceImpl.class);

    @Autowired
    private RestTemplateBuilder builder;

    @Override
    public String getPatients(String city) {
        logger.info("fetching patients list from db for city -{}", city);

        RestTemplate template = builder.build();
        template.getForObject("http://localhost:5081/notify/patients", String.class);

        return "List of patients for city - " + city;
    }
    
}