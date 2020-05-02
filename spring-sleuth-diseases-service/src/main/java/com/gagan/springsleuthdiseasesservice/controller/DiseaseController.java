/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-02 18:01:28
 * @modify date 2020-05-02 18:01:28
 * @desc [description]
 */
package com.gagan.springsleuthdiseasesservice.controller;

import com.gagan.springsleuthdiseasesservice.service.DiseaseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class DiseaseController {

    private static Logger logger = LoggerFactory.getLogger(DiseaseController.class);

    @Autowired
    private DiseaseService diseaseService;

    @GetMapping("/allDiseases/{germs}")
    public String diseases(@PathVariable String germs) {
        logger.info("got hit on /allDiseases/" + germs);
        return diseaseService.getDiseases(germs);
    }

}