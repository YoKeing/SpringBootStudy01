package com.boot.springboot.exeption;

public class UserNotExistException extends RuntimeException{

    public UserNotExistException(){
        super("用户不存在!");
    }

}
