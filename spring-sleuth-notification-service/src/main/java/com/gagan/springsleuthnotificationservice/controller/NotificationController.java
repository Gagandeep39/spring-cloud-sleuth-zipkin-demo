/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-02 17:38:32
 * @modify date 2020-05-02 17:38:32
 * @desc [description]
 */
package com.gagan.springsleuthnotificationservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private static Logger logger = LoggerFactory.getLogger(NotificationController.class);

    @GetMapping("/notify/{enquiry}")
    public String notifyUser(@PathVariable String enquiry){
        logger.info("notified user for enquiry of - {}", enquiry);
        return "notified user for enquiry of " + enquiry;
    }
    
}