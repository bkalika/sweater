package com.sweater.sweater.domain.dto;

import com.sweater.sweater.domain.Message;
import com.sweater.sweater.domain.User;
import com.sweater.sweater.domain.util.MessageHelper;
import lombok.Getter;
import lombok.ToString;

/**
 * @author @bkalika
 * Created on 09.08.2022 4:37 PM
 */

@Getter
//@ToString(exclude = {"text, tag, filename"})
public class MessageDto {

    private final Long id;
    private final String text;
    private final String tag;
    private final User author;
    private final String filename;
    private final Long likes;
    private final Boolean meLiked;

    public MessageDto(Message message, Long likes, Boolean meLiked) {
        this.id = message.getId();
        this.text = message.getText();
        this.tag = message.getTag();
        this.author = message.getAuthor();
        this.filename = message.getFilename();
        this.likes = likes;
        this.meLiked = meLiked;
    }

    public String getAuthorName() {
        return MessageHelper.getAuthorName(author);
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "id=" + id +
                ", author=" + author +
                ", likes=" + likes +
                ", meLiked=" + meLiked +
                '}';
    }
}
