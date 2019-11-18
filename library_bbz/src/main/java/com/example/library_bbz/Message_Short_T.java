package com.example.library_bbz;

import android.content.Context;
import android.widget.Toast;

public class Message_Short_T {

    public static void ShortMessage(Context context, String str){

        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }
}
