package com.mmc.energysaver.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.mmc.energysaver.R;
import com.mmc.energysaver.Communication.ArquinoPostRequest;
/**
 * Created by mario on 12/08/16.
 */
public class TomadasFragment extends Fragment{

    private Switch tomada1;
    private Switch tomada2;
    private Switch tomada3;
    private Switch tomada4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tomada1 = (Switch) getView().findViewById(R.id.lampswitch1);
        tomada2 = (Switch) getView().findViewById(R.id.lampswitch2);
        tomada3 = (Switch) getView().findViewById(R.id.lampswitch3);
        tomada4 = (Switch) getView().findViewById(R.id.lampswitch4);

        //final static  ArquinoPostRequest arduino;
        final ArquinoPostRequest arduino = new ArquinoPostRequest();

        tomada1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    arduino.makePostRequest("T1ON");
                } else {
                    arduino.makePostRequest("T1OFF");
                }
            }
        });

        tomada2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    arduino.makePostRequest("T2ON");
                } else {
                    arduino.makePostRequest("T2OFF");
                }
            }
        });

        tomada3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    arduino.makePostRequest("L1ON");
                } else {
                    arduino.makePostRequest("T3OFF");
                }
            }
        });

        tomada4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    arduino.makePostRequest("T4ON");
                } else {
                    arduino.makePostRequest("T4OFF");
                }
            }
        });

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tomadas, container, false);
    }
}
