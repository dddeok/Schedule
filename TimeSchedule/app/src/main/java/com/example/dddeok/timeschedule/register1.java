package com.example.dddeok.timeschedule;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class register1 extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = (View)inflater.inflate(R.layout.register_schedule,container,false);

        final ImageButton mon_g = (ImageButton) view.findViewById(R.id.mon_g);
        mon_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mon_g.isSelected()) {
                    mon_g.setSelected(true);
                } else {
                    mon_g.setSelected(false);
                }
            }
        });
        final ImageButton tue_g = (ImageButton) view.findViewById(R.id.tue_g);
        tue_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tue_g.isSelected()) {
                    tue_g.setSelected(true);
                } else {
                    tue_g.setSelected(false);
                }
            }
        });
        final ImageButton wen_g = (ImageButton) view.findViewById(R.id.wen_g);
        wen_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!wen_g.isSelected()) {
                    wen_g.setSelected(true);
                } else {
                    wen_g.setSelected(false);
                }
            }
        });
        final ImageButton thu_g = (ImageButton) view.findViewById(R.id.thu_g);
        thu_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!thu_g.isSelected()) {
                    thu_g.setSelected(true);
                } else {
                    thu_g.setSelected(false);
                }
            }
        });
        final ImageButton fri_g = (ImageButton) view.findViewById(R.id.fri_g);
        fri_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!fri_g.isSelected()) {
                    fri_g.setSelected(true);
                } else {
                    fri_g.setSelected(false);
                }
            }
        });
        final ImageButton sat_g = (ImageButton) view.findViewById(R.id.sat_g);
        sat_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sat_g.isSelected()) {
                    sat_g.setSelected(true);
                } else {
                    sat_g.setSelected(false);
                }
            }
        });
        final ImageButton sun_g = (ImageButton) view.findViewById(R.id.sun_g);
        sun_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sun_g.isSelected()) {
                    sun_g.setSelected(true);
                } else {
                    sun_g.setSelected(false);
                }
            }
        });
        final ImageButton red = (ImageButton) view.findViewById(R.id.red);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!red.isSelected()) {
                    red.setSelected(true);
                } else {
                    red.setSelected(false);
                }
            }
        });
        final ImageButton oragne = (ImageButton) view.findViewById(R.id.orange);
        oragne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!oragne.isSelected()) {
                    oragne.setSelected(true);
                } else {
                    oragne.setSelected(false);
                }
            }
        });
        final ImageButton yellow = (ImageButton) view.findViewById(R.id.yellow);
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yellow.isSelected()) {
                    yellow.setSelected(true);
                } else {
                    yellow.setSelected(false);
                }
            }
        });
        final ImageButton ye_green = (ImageButton) view.findViewById(R.id.ye_green);
        ye_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ye_green.isSelected()) {
                    ye_green.setSelected(true);
                } else {
                    ye_green.setSelected(false);
                }
            }
        });
        final ImageButton green = (ImageButton) view.findViewById(R.id.green);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!green.isSelected()) {
                    green.setSelected(true);
                } else {
                    green.setSelected(false);
                }
            }
        });
        final ImageButton gr_mint = (ImageButton) view.findViewById(R.id.gr_mint);
        gr_mint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gr_mint.isSelected()) {
                    gr_mint.setSelected(true);
                } else {
                    gr_mint.setSelected(false);
                }
            }
        });
        final ImageButton mint = (ImageButton) view.findViewById(R.id.mint);
        mint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mint.isSelected()) {
                    mint.setSelected(true);
                } else {
                    mint.setSelected(false);
                }
            }
        });
        final ImageButton sky_blue = (ImageButton) view.findViewById(R.id.sky_blue);
        sky_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sky_blue.isSelected()) {
                    sky_blue.setSelected(true);
                } else {
                    sky_blue.setSelected(false);
                }
            }
        });
        final ImageButton blue = (ImageButton) view.findViewById(R.id.blue);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!blue.isSelected()) {
                    blue.setSelected(true);
                } else {
                    blue.setSelected(false);
                }
            }
        });
        final ImageButton ocean = (ImageButton) view.findViewById(R.id.ocean);
        ocean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ocean.isSelected()) {
                    ocean.setSelected(true);
                } else {
                    ocean.setSelected(false);
                }
            }
        });
        final ImageButton bl_purple = (ImageButton) view.findViewById(R.id.bl_purple);
        bl_purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!bl_purple.isSelected()) {
                    bl_purple.setSelected(true);
                } else {
                    bl_purple.setSelected(false);
                }
            }
        });
        final ImageButton purple = (ImageButton) view.findViewById(R.id.purple);
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!purple.isSelected()) {
                    purple.setSelected(true);
                } else {
                    purple.setSelected(false);
                }
            }
        });
        final ImageButton pu_pink = (ImageButton) view.findViewById(R.id.pu_pink);
        pu_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!pu_pink.isSelected()) {
                    pu_pink.setSelected(true);
                } else {
                    pu_pink.setSelected(false);
                }
            }
        });
        final ImageButton pink = (ImageButton) view.findViewById(R.id.pink);
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!pink.isSelected()) {
                    pink.setSelected(true);
                } else {
                    pink.setSelected(false);
                }
            }
        });
        final ImageButton gray_b = (ImageButton) view.findViewById(R.id.gray_b);
        gray_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gray_b.isSelected()) {
                    gray_b.setSelected(true);
                } else {
                    gray_b.setSelected(false);
                }
            }
        });
        final ImageButton gray_w = (ImageButton) view.findViewById(R.id.gray_w);
        gray_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gray_w.isSelected()) {
                    gray_w.setSelected(true);
                } else {
                    gray_w.setSelected(false);
                }
            }
        });

        return view;
    }
}
