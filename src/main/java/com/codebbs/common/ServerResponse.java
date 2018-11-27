package com.codebbs.common;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> {

    private T data;
    private Integer status;
    private String message;

    private static final Integer SUCCESS_CODE = 0;
    private static final Integer ERROR_CODE = 1;


    private ServerResponse(Integer status, String message){
        this.status = status;
        this.message = message;
    }

    private ServerResponse(Integer status, String message,T data){
        this.status = status;
        this.message = message;
        this.data = data;
    }

    private ServerResponse(Integer status, T data){
        this.status = status;
        this.data = data;
    }

    private ServerResponse(Integer status){
        this.status = status;
    }

    public static <T> ServerResponse<T> createBySuccess(){
        return new ServerResponse<T>(SUCCESS_CODE);
    }

    public static <T> ServerResponse<T> createBySuccesMessage(String message){
        return new ServerResponse<T>(SUCCESS_CODE,message);
    }

    public static <T> ServerResponse<T> createBySuccessData(T data){
        return new ServerResponse<T>(SUCCESS_CODE,data);
    }

    public static <T> ServerResponse<T> createBySuccess(String message, T data){
        return new ServerResponse<T>(SUCCESS_CODE,message,data);
    }

    public static <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ERROR_CODE);
    }

    public static <T> ServerResponse<T> createByErrorMessage(String message){
        return new ServerResponse<T>(ERROR_CODE,message);
    }

    public static <T> ServerResponse<T> createByErrorCodeMessage(Integer errorCode, String message){
        return new ServerResponse<T>(errorCode, message);
    }



}
