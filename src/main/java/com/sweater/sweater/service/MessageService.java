package com.sweater.sweater.service;

import com.sweater.sweater.domain.User;
import com.sweater.sweater.domain.dto.MessageDto;
import com.sweater.sweater.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

/**
 * @author @bkalika
 * Created on 09.08.2022 3:14 PM
 */

@Service
public class MessageService {

    @Autowired
    private MessageRepo messageRepo;

//    @Autowired
//    private EntityManager entityManager;

    public Page<MessageDto> messageList(Pageable pageable, String filter, User user) {
        if (filter != null && !filter.isEmpty()) {
            return messageRepo.findByTag(filter, pageable, user);
        } else {
            return messageRepo.findAll(pageable, user);
        }
    }

    public Page<MessageDto> messageListForUser(Pageable pageable, User currentUser, User author) {
        return messageRepo.findByUser(pageable, currentUser, author);
    }
}
