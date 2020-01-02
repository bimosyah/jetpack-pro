package syahputro.bimo.jetpack_pro.coba;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    @SuppressLint("SimpleDateFormat")
    public static String toSimpleString(Date date){
        return new SimpleDateFormat("EEE, dd MMM yyy").format(date);
    }


}
