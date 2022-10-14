package com.example.mailsender_java_live_project.service;

import com.example.mailsender_java_live_project.dto.CustomerContactMailDto;
import com.example.mailsender_java_live_project.model.User;
import org.springframework.mail.MailException;

public interface CustomerContactMailService {

    public void sendNotification(CustomerContactMailDto customerContactMailDto) throws MailException;
}
