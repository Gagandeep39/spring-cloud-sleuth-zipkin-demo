/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-02 17:33:11
 * @modify date 2020-05-02 17:33:11
 * @desc [description]
 */
package com.gagan.springsleuthdoctorportal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DoctorPortalController {
    private static Logger logger = LoggerFactory.getLogger(DoctorPortalController.class);
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    private boolean flag = true;

    @GetMapping("/doctors")
    public String getDoctors() {
        logger.info("Going to call doctors service");
        RestTemplate restTemplate = restTemplateBuilder.build();
        String hospital = "Fortis";
        if (flag) {
            hospital = "Apollo";
        }
        flag = !flag;
        return restTemplate.getForObject("http://localhost:9081/allDoctors/" + hospital, String.class);
    }

    @GetMapping("/diseases")
    public String getDiseases() {
        logger.info("Going to call diseases service");
        RestTemplate restTemplate = restTemplateBuilder.build();
        String germ = "virus";
        if (flag) {
            germ = "bacteria";
        }
        flag = !flag;
        return restTemplate.getForObject("http://localhost:4081/allDiseases/" + germ, String.class);

    }

    @GetMapping("/patients")
    public String getPatients() {
        logger.info("Going to call patients service");
        RestTemplate restTemplate = restTemplateBuilder.build();
        String city = "Mumbai";
        if (flag) {
            city = "NewDelhi";
        }
        flag = !flag;
        return restTemplate.getForObject("http://localhost:6081/allPatients/" + city, String.class);

    }
}