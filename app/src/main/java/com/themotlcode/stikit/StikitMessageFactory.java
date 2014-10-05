package com.themotlcode.stikit;

import org.json.JSONObject;
import android.util.Log;
/**
 * Created by Alex Ling on 10/4/2014.
 */

public class StikitMessageFactory {
    private static final String TAG = "StikitMessageFactory";
    /* Empty constructor */
    public StikitMessageFactory() {}

    public String Message(String message, String color) {
        return stikitMessageConstruct(message, color).toString();
    }

    public String Commmand(int command) {
        return stikitCommandConstruct(command).toString();
    }
    private JSONObject stikitMessageConstruct(String message, String color) {

        JSONObject messageObj = new JSONObject();

        try {
            messageObj.put("text", message);
            messageObj.put("colorInHex", color);
        }
        catch (org.json.JSONException e) {
            Log.d(TAG, e.toString());
        }
        return messageObj;
    }
    /* Enumerations
        Left: 0
        Right: 1
        Delete: 2
     */
    private JSONObject stikitCommandConstruct(int command) {
        JSONObject commandObj = new JSONObject();

        try {
            commandObj.put("command", command);
        }
        catch (org.json.JSONException e) {
            Log.d(TAG, e.toString());
        }
        return commandObj;
    }


}
