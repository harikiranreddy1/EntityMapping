package com.users.H2crud.exception;

public class UserException extends RuntimeException{

    public UserException(String msg){
        super(msg);
    }

    public UserException(Exception e, String msg){
        super(msg, e);
    }
}
