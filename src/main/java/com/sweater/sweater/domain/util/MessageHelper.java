package com.sweater.sweater.domain.util;

import com.sweater.sweater.domain.User;

/**
 * @author @bkalika
 * Created on 09.08.2022 4:44 PM
 */
public abstract class MessageHelper {

    public static String getAuthorName(User user) {
        return user != null ? user.getUsername() : "<none>";
    }

}
