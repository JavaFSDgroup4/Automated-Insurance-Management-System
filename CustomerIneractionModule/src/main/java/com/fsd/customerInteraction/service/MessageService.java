package com.fsd.customerInteraction.service;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fsd.customerInteraction.resource.Message;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.MessageCreator;
//com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

@Service
public class MessageService {

//    @Value("${twilio.account_sid}")
//    private String accountSid;
//
//    @Value("${twilio.auth_token}")
//    private String authToken;
//
//    @Value("${twilio.phone_number}")
//    private String fromPhoneNumber;
//
    public Message sendMessage(Message message) {
//        Twilio.init(accountSid, authToken);
//        MessageCreator creator = MessageCreator(
//                new PhoneNumber(message.getPhoneNumber()),
//                new PhoneNumber(fromPhoneNumber),
//                message.getMessage());
//        creator.create();
        return message;
    }
}

