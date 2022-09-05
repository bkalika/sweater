package com.sweater.sweater.domain;

import com.sweater.sweater.domain.util.MessageHelper;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

/**
 * @author @bkalika
 * Created on 12.05.2022 2:29 PM
 */
//@Data
@Builder
@Entity
@Getter
@Setter
@ToString(of = {"id", "text"})
@EqualsAndHashCode(exclude = {"tag", "text"})
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Please, fill out the text.")
    @Length(max = 2048, message =  "Message too long (more then 2 kB).")
    @NonNull
    @Setter
    private String text;

    @Length(max = 255, message =  "Tag too long (more then 255).")
    @NonNull
    private String tag;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    private String filename;

    @ManyToMany
    @JoinTable(
            name = "message_likes",
            joinColumns = {@JoinColumn(name = "message_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")}
    )
    private Set<User> likes = new HashSet<>();

    public String getAuthorName() {
        return MessageHelper.getAuthorName(author);
    }
}
