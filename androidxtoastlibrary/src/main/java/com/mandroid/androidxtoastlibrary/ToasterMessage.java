package com.mandroid.androidxtoastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Murali Reddy on Fri, Aug 30 2019.
 */
public class ToasterMessage {
    public static void s(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
}
