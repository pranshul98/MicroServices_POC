package com.app.microservice_contactservice.service;

import com.app.microservice_contactservice.entity.Contact;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsofUser(Long userId);

}
