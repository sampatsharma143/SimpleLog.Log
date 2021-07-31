package com.shunyank.simplelog;


import android.os.Build;
import java.util.Map;

public class Log {

    public static void e(String tag,String message){
        android.util.Log.e(tag,message);
    }
    public static void e(String tag,int value,String message){
        android.util.Log.e(tag, value +" "+message);
    }
    public static void e(String tag,int value){
        android.util.Log.e(tag,String.valueOf(value));
    }
    public static void e(String tag, boolean value, String message){
        android.util.Log.e(tag, value +" "+message);
    }
    public static void e(String tag, boolean value){
        android.util.Log.e(tag,String.valueOf(value));
    }

    //debug version

    public static void d(String tag,String message){
        android.util.Log.d(tag,message);
    }
    public static void d(String tag,int value,String message){
        android.util.Log.d(tag, value +" "+message);
    }
    public static void d(String tag,int value){
        android.util.Log.d(tag,String.valueOf(value));
    }
    public static void d(String tag, boolean value, String message){
        android.util.Log.d(tag, value +" "+message);
    }
    public static void d(String tag, boolean value){
        android.util.Log.d(tag,String.valueOf(value));
    }



    /**
     * How to use
     * Log.e("TagName", new String[]{"First Message","Second Message","Third Message"});
     * output:
     * E:TagName : First Message Second Message Third Message
     *
     * append different messages into one message
     * */
    public static void e(String tag, String[] message){
        StringBuilder newMessage = new StringBuilder();
        for(String m:message){
            newMessage.append(" ").append(m);
        }
        android.util.Log.e(tag,newMessage.toString());
    }

    //debug version
    public static void d(String tag, String[] message){
        StringBuilder newMessage = new StringBuilder();
        for(String m:message){
            newMessage.append(" ").append(m);
        }
        android.util.Log.d(tag,newMessage.toString());
    }
    /**
     * How to use
     * Log.e("TagName", 1 , new String[]{"First Message","Second Message","Third Message"});
     * output:
     * E:TagName : 1 First Message Second Message Third Message
     *
     * append different messages into one message with int value
     * */
    public static void e(String tag, int value, String[] message){
        StringBuilder newMessage = new StringBuilder();
        newMessage.append(String.valueOf(value));
        for(String m:message){
            newMessage.append(" ").append(m);
        }
        android.util.Log.e(tag,newMessage.toString());
    }

    public static void d(String tag, int value, String[] message){
        StringBuilder newMessage = new StringBuilder();
        newMessage.append(String.valueOf(value));
        for(String m:message){
            newMessage.append(" ").append(m);
        }
        android.util.Log.d(tag,newMessage.toString());
    }

    /**
     * HashMap<String,String>
     * this e function will take a hashmap and print multiple log error in contains in HashMap
     * HashMap<K,V> in which K will be used as Tag and V will be used as Message
     * k = Tag
     * v = Message
     * How to use?
     * Map<String,String> messages = new HashMap<String,String>();
     * messages.put("Tag","Message");
     * Log.e(messages);
     */

    public static void e(Map<String,String> values){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            values.forEach((tag,value)-> android.util.Log.e(tag,value));
        }else{
            for (Map.Entry<String,String> m : values.entrySet()) {
                android.util.Log.e(m.getKey(),m.getValue());
            }
        }
    }
    //debug version
    public static void d(Map<String,String> values){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            values.forEach((tag,value)-> android.util.Log.d(tag,value));
        }else{
            for (Map.Entry<String,String> m : values.entrySet()) {
                android.util.Log.d(m.getKey(),m.getValue());
            }
        }
    }

}
