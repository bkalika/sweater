package com.sweater.sweater.repos;

import com.sweater.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author @bkalika
 * Created on 12.05.2022 2:34 PM
 */
public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
}
