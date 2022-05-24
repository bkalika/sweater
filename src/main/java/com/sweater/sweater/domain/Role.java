package com.sweater.sweater.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author @bkalika
 * Created on 13.05.2022 12:07 AM
 */
public enum Role implements GrantedAuthority {
    USER, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
