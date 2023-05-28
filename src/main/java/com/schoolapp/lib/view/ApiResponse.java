package com.school_app.lib.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@RequiredArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    @Getter
    @Setter
    private boolean status;

    @Getter
    @Setter
    private int statusCode;

    @Getter
    @Setter
    private String message;

    @Getter
    private final Date time = new Date();
}
