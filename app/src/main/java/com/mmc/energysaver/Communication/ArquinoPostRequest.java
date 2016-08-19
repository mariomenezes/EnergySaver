package com.mmc.energysaver.Communication;

/**
 * Created by mario on 19/08/16.
 */
public class ArquinoPostRequest {

    private String command;

    public ArquinoPostRequest(String command){
        this.command = command;
    }
    void makePostRequest() //TODO

    {
        /*try {
            HttpClient httpclient = new DefaultHttpClient();
            httpclient.execute(new HttpGet("http://192.168.0.126:81/" + command));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

}
