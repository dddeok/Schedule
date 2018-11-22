package com.example.dddeok.timeschedule;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class register2 extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View)inflater.inflate(R.layout.register_sleep,container,false);

        final ImageButton mon_b = (ImageButton) view.findViewById(R.id.mon_b);
        mon_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mon_b.isSelected()) {
                    mon_b.setSelected(true);
                } else {
                    mon_b.setSelected(false);
                }
            }
        });
        final ImageButton tue_b = (ImageButton) view.findViewById(R.id.tue_b);
        tue_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tue_b.isSelected()) {
                    tue_b.setSelected(true);
                } else {
                    tue_b.setSelected(false);
                }
            }
        });
        final ImageButton wen_b = (ImageButton) view.findViewById(R.id.wen_b);
        wen_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!wen_b.isSelected()) {
                    wen_b.setSelected(true);
                } else {
                    wen_b.setSelected(false);
                }
            }
        });
        final ImageButton thu_b = (ImageButton) view.findViewById(R.id.thu_b);
        thu_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!thu_b.isSelected()) {
                    thu_b.setSelected(true);
                } else {
                    thu_b.setSelected(false);
                }
            }
        });
        final ImageButton fri_b = (ImageButton) view.findViewById(R.id.fri_b);
        fri_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!fri_b.isSelected()) {
                    fri_b.setSelected(true);
                } else {
                    fri_b.setSelected(false);
                }
            }
        });
        final ImageButton sat_b = (ImageButton) view.findViewById(R.id.sat_b);
        sat_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sat_b.isSelected()) {
                    sat_b.setSelected(true);
                } else {
                    sat_b.setSelected(false);
                }
            }
        });
        final ImageButton sun_b = (ImageButton) view.findViewById(R.id.sun_b);
        sun_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sun_b.isSelected()) {
                    sun_b.setSelected(true);
                } else {
                    sun_b.setSelected(false);
                }
            }
        });
        return view;

    }
}
