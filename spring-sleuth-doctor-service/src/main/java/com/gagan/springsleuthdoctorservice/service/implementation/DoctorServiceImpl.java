/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-02 17:33:08
 * @modify date 2020-05-02 17:33:08
 * @desc [description]
 */
package com.gagan.springsleuthdoctorservice.service.implementation;

import com.gagan.springsleuthdoctorservice.service.DoctorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DoctorServiceImpl implements DoctorService {

    private static Logger logger = LoggerFactory.getLogger(DoctorServiceImpl.class);

    @Autowired
    private RestTemplateBuilder builder;

    @Override
    public String getDoctors(String hospital) {
        logger.info("fetching doctors list from db for hospital -{}", hospital);

        RestTemplate template = builder.build();
        template.getForObject("http://localhost:5081/notify/doctors", String.class);

        return "List of doctors for hospital - " + hospital;
    }

}