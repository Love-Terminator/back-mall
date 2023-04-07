package com.mall.admin.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    /**指定时间格式*/
    static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    /**返回当前时间的指定字符串格式 yyyy/MM/dd HH:mm:ss*/
    public String getTime(){
        String format = dateFormat.format(new Date());
        return format;
    }

    /**返回指定时间戳的指定字符串格式 yyyy/MM/dd HH:mm:ss*/
    public String getTime(long l){
        String format = dateFormat.format(l);
        return format;
    }

    /**返回指定时间的指定字符串格式 yyyy/MM/dd HH:mm:ss*/
    public String getTime(Date date){
        String format = dateFormat.format(date);
        return format;
    }

    /**通过指定的字符串格式返回指定日期*/
    public Date getTime(String str){
        Date parse= new Date();
        try {
            parse = dateFormat.parse(str);
            return parse;
        } catch (ParseException e) {
            System.out.println("请输入正确的日期格式:\"yyyy/MM/dd HH:mm:ss\"");
        }
        return null;
    }
}
