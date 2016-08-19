package com.mmc.energysaver.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.mmc.energysaver.R;

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

        tomada1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    //textView2.setText(switchOn);
                } else {
                    //textView2.setText(switchOff);
                }
            }
        });

        tomada2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    //textView2.setText(switchOn);
                } else {
                    //textView2.setText(switchOff);
                }
            }
        });

        tomada3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    //textView2.setText(switchOn);
                } else {
                    //textView2.setText(switchOff);
                }
            }
        });

        tomada4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    //textView2.setText(switchOn);
                } else {
                    //textView2.setText(switchOff);
                }
            }
        });

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tomadas, container, false);
    }
}
