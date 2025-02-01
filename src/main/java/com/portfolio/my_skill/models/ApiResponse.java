package com.portfolio.my_skill.models;

public class ApiResponse<T> {
    public  int status;
    public T data;
    public String message;

    public ApiResponse(int status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }
}
