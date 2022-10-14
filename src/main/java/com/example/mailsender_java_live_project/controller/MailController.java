package com.example.mailsender_java_live_project.controller;


import com.example.mailsender_java_live_project.dto.CustomerContactMailDto;
import com.example.mailsender_java_live_project.model.User;
import com.example.mailsender_java_live_project.service.CustomerContactMailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MailController {

    @GetMapping()
    public String home(){
        return "dist/index";
    }

    @GetMapping("/contactus")
    public String contactus(){
        return "dist/contactus";
    }

    @Autowired
    CustomerContactMailService customerContactMailService;

    @PostMapping ("/send")
    public String sendMail (@ModelAttribute CustomerContactMailDto customerContactMailDto, Model model) {

        //send mail from client

        try
        {
            model.addAttribute("send", customerContactMailDto);
            customerContactMailService.sendNotification(customerContactMailDto);

            return "dist/index";
        } catch (MailException e) {
        LOGGER.error("Could Not send mail to {}" , customerContactMailDto.getName() , e);
        }
   return "Oops! Something bad happened."; }



    private static Logger LOGGER = LoggerFactory.getLogger(MailController.class);
}
