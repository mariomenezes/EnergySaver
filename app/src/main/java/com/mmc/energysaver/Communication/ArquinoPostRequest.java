package com.mmc.energysaver.Communication;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Created by mario on 19/08/16.
 */
public class ArquinoPostRequest {


    public ArquinoPostRequest(){
    }

    public void makePostRequest(String command) //TODO

    {
        try {
            HttpClient httpclient = new DefaultHttpClient();
            httpclient.execute(new HttpGet("http://192.168.0.126:81/" + command));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
