package com.schoolapp.lib.view;

import lombok.Getter;
import lombok.Setter;

public class EntityApiResponse<T> extends ApiResponse {

    @Getter
    @Setter
    private T data;

    public EntityApiResponse() {}

    public EntityApiResponse(boolean status, int statusCode, String message, T data) {
        super(status, statusCode, message);
        this.data = data;
    }
}
