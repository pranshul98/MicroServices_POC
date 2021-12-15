package com.app.microservice_contactservice.service;


import com.app.microservice_contactservice.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list = List.of(
            new Contact(1L, "pranshul98@gmail.com", "pranshul", 1311L),
            new Contact(2L, "pranshul98@yahoo.com", "pranshul_2", 1311L),
            new Contact(3L, "rohan98@gmail.com", "rohan", 1312L),
            new Contact(4L, "ravi98@gmail.com", "ravi", 1313L)
    );

    @Override
    public List<Contact> getContactsofUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
