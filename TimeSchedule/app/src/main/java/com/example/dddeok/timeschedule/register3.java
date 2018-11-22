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

public class register3 extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View)inflater.inflate(R.layout.register_self,container,false);

        final ImageButton mon_r = (ImageButton) view.findViewById(R.id.mon_r);
        mon_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mon_r.isSelected()) {
                    mon_r.setSelected(true);
                } else {
                    mon_r.setSelected(false);
                }
            }
        });
        final ImageButton tue_r = (ImageButton) view.findViewById(R.id.tue_r);
        tue_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tue_r.isSelected()) {
                    tue_r.setSelected(true);
                } else {
                    tue_r.setSelected(false);
                }
            }
        });
        final ImageButton wen_r = (ImageButton) view.findViewById(R.id.wen_r);
        wen_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!wen_r.isSelected()) {
                    wen_r.setSelected(true);
                } else {
                    wen_r.setSelected(false);
                }
            }
        });
        final ImageButton thu_r = (ImageButton) view.findViewById(R.id.thu_r);
        thu_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!thu_r.isSelected()) {
                    thu_r.setSelected(true);
                } else {
                    thu_r.setSelected(false);
                }
            }
        });
        final ImageButton fri_r = (ImageButton) view.findViewById(R.id.fri_r);
        fri_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!fri_r.isSelected()) {
                    fri_r.setSelected(true);
                } else {
                    fri_r.setSelected(false);
                }
            }
        });
        final ImageButton sat_r = (ImageButton) view.findViewById(R.id.sat_r);
        sat_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sat_r.isSelected()) {
                    sat_r.setSelected(true);
                } else {
                    sat_r.setSelected(false);
                }
            }
        });
        final ImageButton sun_r = (ImageButton) view.findViewById(R.id.sun_r);
        sun_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sun_r.isSelected()) {
                    sun_r.setSelected(true);
                } else {
                    sun_r.setSelected(false);
                }
            }
        });

        final ImageButton red_r = (ImageButton) view.findViewById(R.id.red_r);
        red_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!red_r.isSelected()) {
                    red_r.setSelected(true);
                } else {
                    red_r.setSelected(false);
                }
            }
        });
        final ImageButton oragne_r = (ImageButton) view.findViewById(R.id.orange_r);
        oragne_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!oragne_r.isSelected()) {
                    oragne_r.setSelected(true);
                } else {
                    oragne_r.setSelected(false);
                }
            }
        });
        final ImageButton yellow_r = (ImageButton) view.findViewById(R.id.yellow_r);
        yellow_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yellow_r.isSelected()) {
                    yellow_r.setSelected(true);
                } else {
                    yellow_r.setSelected(false);
                }
            }
        });
        final ImageButton ye_green_r = (ImageButton) view.findViewById(R.id.ye_green_r);
        ye_green_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ye_green_r.isSelected()) {
                    ye_green_r.setSelected(true);
                } else {
                    ye_green_r.setSelected(false);
                }
            }
        });
        final ImageButton green_r = (ImageButton) view.findViewById(R.id.green_r);
        green_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!green_r.isSelected()) {
                    green_r.setSelected(true);
                } else {
                    green_r.setSelected(false);
                }
            }
        });
        final ImageButton gr_mint_r = (ImageButton) view.findViewById(R.id.gr_mint_r);
        gr_mint_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gr_mint_r.isSelected()) {
                    gr_mint_r.setSelected(true);
                } else {
                    gr_mint_r.setSelected(false);
                }
            }
        });
        final ImageButton mint_r = (ImageButton) view.findViewById(R.id.mint_r);
        mint_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mint_r.isSelected()) {
                    mint_r.setSelected(true);
                } else {
                    mint_r.setSelected(false);
                }
            }
        });
        final ImageButton sky_blue_r = (ImageButton) view.findViewById(R.id.sky_blue_r);
        sky_blue_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sky_blue_r.isSelected()) {
                    sky_blue_r.setSelected(true);
                } else {
                    sky_blue_r.setSelected(false);
                }
            }
        });
        final ImageButton blue_r = (ImageButton) view.findViewById(R.id.blue_r);
        blue_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!blue_r.isSelected()) {
                    blue_r.setSelected(true);
                } else {
                    blue_r.setSelected(false);
                }
            }
        });
        final ImageButton ocean_r = (ImageButton) view.findViewById(R.id.ocean_r);
        ocean_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ocean_r.isSelected()) {
                    ocean_r.setSelected(true);
                } else {
                    ocean_r.setSelected(false);
                }
            }
        });
        final ImageButton bl_purple_r = (ImageButton) view.findViewById(R.id.bl_purple_r);
        bl_purple_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!bl_purple_r.isSelected()) {
                    bl_purple_r.setSelected(true);
                } else {
                    bl_purple_r.setSelected(false);
                }
            }
        });
        final ImageButton purple_r = (ImageButton) view.findViewById(R.id.purple_r);
        purple_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!purple_r.isSelected()) {
                    purple_r.setSelected(true);
                } else {
                    purple_r.setSelected(false);
                }
            }
        });
        final ImageButton pu_pink_r = (ImageButton) view.findViewById(R.id.pu_pink_r);
        pu_pink_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!pu_pink_r.isSelected()) {
                    pu_pink_r.setSelected(true);
                } else {
                    pu_pink_r.setSelected(false);
                }
            }
        });
        final ImageButton pink_r = (ImageButton) view.findViewById(R.id.pink_r);
        pink_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!pink_r.isSelected()) {
                    pink_r.setSelected(true);
                } else {
                    pink_r.setSelected(false);
                }
            }
        });
        final ImageButton gray_b_r = (ImageButton) view.findViewById(R.id.gray_b_r);
        gray_b_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gray_b_r.isSelected()) {
                    gray_b_r.setSelected(true);
                } else {
                    gray_b_r.setSelected(false);
                }
            }
        });
        final ImageButton gray_w_r = (ImageButton) view.findViewById(R.id.gray_w_r);
        gray_w_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gray_w_r.isSelected()) {
                    gray_w_r.setSelected(true);
                } else {
                    gray_w_r.setSelected(false);
                }
            }
        });
        return view;
    }
}
