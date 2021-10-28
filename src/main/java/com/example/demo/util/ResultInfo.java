package com.example.demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResultInfo<T>{
    private Integer status;
    private String message;
    private T response;

    public ResultInfo<T> success(Integer status, String message, T response) {
        return new ResultInfo<T>(status, message, response);
    }
}