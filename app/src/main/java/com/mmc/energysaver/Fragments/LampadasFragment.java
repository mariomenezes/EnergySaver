package com.mmc.energysaver.Fragments;

/**
 * Created by mario on 12/08/16.
 */
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;

import com.mmc.energysaver.R;

public class LampadasFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.lampadas, container, false);

        ToggleButton button = (ToggleButton) view.findViewById(R.id.toggleButton3);
        //ImageSpan imageSpan = new ImageSpan(this, android.R.drawable.ic_menu_info_details);
        Drawable d = getResources().getDrawable(R.drawable.ic_menu_manage);
        //ImageSpan imageSpan = new ImageSpan(d, android.R.drawable.ic_menu_info_details);
        //ImageSpan imageSpan = new ImageSpan(d, android.R.drawable.ic_menu_info_details);
        ImageSpan imageSpan = new ImageSpan(d, "mipmap/lamp_icon_high1.png");
        // mImageSpan.ALIGN_BASELINE
        SpannableString content = new SpannableString("X");
        content.setSpan(imageSpan, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        button.setText(content);
        button.setTextOn(content);
        button.setTextOff(content);



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.lampadas, container, false);
    }
}


/*
* Para usar fazendo a requisicao ao arduino
* @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       makePostRequest();
       Toast toast = Toast.makeText(this, "Lampada ligada", Toast.LENGTH_LONG);
       toast.show();
       this.finish();
   }

   void makePostRequest()
   {
       try {
           HttpClient httpclient = new DefaultHttpClient();
           httpclient.execute(new HttpGet("http://192.168.0.126:81/H1"));
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
* */
