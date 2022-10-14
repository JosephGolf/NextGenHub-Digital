package com.example.mailsender_java_live_project.service.serviceImpl;

import com.example.mailsender_java_live_project.dto.CustomerContactMailDto;
import com.example.mailsender_java_live_project.service.CustomerContactMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CustomerContactServiceMailImpl implements CustomerContactMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendNotification(CustomerContactMailDto customerContactMailDto) throws MailException{

        //send email

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("josgolf3@gmail.com");
        mail.setFrom(customerContactMailDto.getEmail());
        mail.setSubject("NextGenHub MailBot");
        mail.setText("From: " + "\n \n" + customerContactMailDto.getEmail() + "\n \n" + "Phone Number: "+ customerContactMailDto.getPhone() + "\n \n" + "Name: " + customerContactMailDto.getName() + "\n \n"+ "Enquiry Message: " + customerContactMailDto.getMessage() + "\n \n" + "NextGenHub Mail Bot!");
        javaMailSender.send(mail);
    }


}
