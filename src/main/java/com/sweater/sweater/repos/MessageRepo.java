package com.sweater.sweater.repos;

import com.sweater.sweater.domain.Message;
import com.sweater.sweater.domain.User;
import com.sweater.sweater.domain.dto.MessageDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author @bkalika
 * Created on 12.05.2022 2:34 PM
 */
public interface MessageRepo extends CrudRepository<Message, Long> {

    @Query("SELECT NEW com.sweater.sweater.domain.dto.MessageDto(" +
            "m, " +
            " count(ml), " +
            " sum(case when ml = :user then 1 else 0 end) > 0 " +
            ") " +
            "from Message m left JOIN m.likes ml " +
            "GROUP BY m"
    )
    Page<MessageDto> findAll(Pageable pageable, @Param("user") User user);

    @Query("SELECT NEW com.sweater.sweater.domain.dto.MessageDto(" +
            "m, " +
            " count(ml), " +
            " sum(case when ml = :user then 1 else 0 end) > 0 " +
            ") " +
            "from Message m left JOIN m.likes ml " +
            "WHERE m.tag = :tag " +
            "GROUP BY m"
    )
    Page<MessageDto> findByTag(@Param("tag") String tag, Pageable pageable, @Param("user") User user);

    @Query("select new com.sweater.sweater.domain.dto.MessageDto(" +
            "   m, " +
            "   count(ml), " +
            "   sum(case when ml = :user then 1 else 0 end) > 0" +
            ") " +
            "from Message m left join m.likes ml " +
            "where m.author = :author " +
            "group by m")
    Page<MessageDto> findByUser(Pageable pageable, @Param("author") User author, @Param("user") User user);
}
