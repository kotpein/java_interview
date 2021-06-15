package org.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MailService.class);
    private final UserService userService;

    public MailService(UserService userService) {
        this.userService = userService;
    }

    public void sendMailTo(String userName, String message){
        String mail = userService.getEmailForUser(userName);
        LOGGER.info("Sending email message {} to {}",message,mail);
    }
}
