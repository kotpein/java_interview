package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private MailService mailService;

    public UserService(MailService mailService) {
        this.mailService = mailService;
    }

    public String getEmailForUser(String userName) {
        return "Volodymyr.Melnyk@gmail.com";
    }
}
