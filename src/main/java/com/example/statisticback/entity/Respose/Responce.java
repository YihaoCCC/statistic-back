package com.example.statisticback.entity.Respose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public  class Responce {
    private int code;
    private String message;
    private Object body;

    public static Responce success ( String message,Object body) {
        return new Responce(200,message,body);
    }

    public static Responce error ( String message,Object body) {
        return new Responce(500,message,body);
    }


}
