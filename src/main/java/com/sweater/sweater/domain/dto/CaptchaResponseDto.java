package com.sweater.sweater.domain.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

import java.util.Set;

/**
 * @author @bkalika
 * Created on 10.06.2022 10:01 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaptchaResponseDto {

    private boolean success;

    @JsonAlias("error-codes")
    private Set<String> errorCodes;

    public boolean isSuccess() {
        return !success;
    }

    public Set<String> getErrorCodes() {
        return errorCodes;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setErrorCodes(Set<String> errorCodes) {
        this.errorCodes = errorCodes;
    }
}
