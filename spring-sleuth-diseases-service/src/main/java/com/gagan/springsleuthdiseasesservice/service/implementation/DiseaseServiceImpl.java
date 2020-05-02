/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-02 18:00:45
 * @modify date 2020-05-02 18:00:45
 * @desc [description]
 */
package com.gagan.springsleuthdiseasesservice.service.implementation;

import com.gagan.springsleuthdiseasesservice.service.DiseaseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DiseaseServiceImpl implements DiseaseService {

    private static Logger logger = LoggerFactory.getLogger(DiseaseServiceImpl.class);

    @Autowired
    private RestTemplateBuilder builder;

    @Override
    public String getDiseases(String germs) {
        logger.info("fetching diseases list from db for germ -{}", germs);

        RestTemplate template = builder.build();
        template.getForObject("http://localhost:5081/notify/diseases", String.class);

        return "List of diseases for germ - " + germs;
    }

}