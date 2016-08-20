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
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

import com.mmc.energysaver.Communication.ArquinoPostRequest;
import com.mmc.energysaver.R;

public class LampadasFragment extends Fragment {

    private Switch tomada1;
    private Switch tomada2;
    private Switch tomada3;
    private Switch tomada4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        /*View view = inflater.inflate(R.layout.lampadas, container, false);

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
        button.setTextOff(content);*/

        tomada1 = (Switch) getView().findViewById(R.id.lampswitch1);
        tomada2 = (Switch) getView().findViewById(R.id.lampswitch2);
        tomada3 = (Switch) getView().findViewById(R.id.lampswitch3);
        tomada4 = (Switch) getView().findViewById(R.id.lampswitch4);

        final ArquinoPostRequest arduino = new ArquinoPostRequest();

        tomada1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    arduino.makePostRequest("L1ON");
                    //textView2.setText(switchOn);
                } else {
                    arduino.makePostRequest("L1OFF");
                    //textView2.setText(switchOff);
                }
            }
        });

        tomada2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    arduino.makePostRequest("L2ON");
                } else {
                    arduino.makePostRequest("L2OFF");
                }
            }
        });

        tomada3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    arduino.makePostRequest("L3ON");
                } else {
                    arduino.makePostRequest("L3OFF");
                }
            }
        });

        tomada4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    arduino.makePostRequest("L4ON");
                } else {
                    arduino.makePostRequest("L4OFF");
                }
            }
        });


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.lampadas, container, false);
    }

    //tomada1.OnC
    //tomada1.setChecked(false);

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
