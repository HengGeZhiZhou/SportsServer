package tools;

import freemarker.template.SimpleDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/12/24.
 */
public class Time {
    public static String  getCurrentTime(){
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyMM");
        return dateFormat.format(date);
    }
}
