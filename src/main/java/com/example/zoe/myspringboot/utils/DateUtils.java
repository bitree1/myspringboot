package com.example.zoe.myspringboot.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static final String DATEFORMT_STRING = "yyyy-MM-dd";

    public static String DateFormtString(Date date){
        DateFormat dateFormat = new SimpleDateFormat(DATEFORMT_STRING);
        return dateFormat.format(date);
    }

    public static void main(String[] args){
        System.out.println(DateFormtString(new Date()));
    }
}
