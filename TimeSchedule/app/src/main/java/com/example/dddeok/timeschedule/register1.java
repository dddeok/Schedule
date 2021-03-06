package com.example.dddeok.timeschedule;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class register1 extends Fragment {
    Button btn_make;
    Button btn_cancel;

    String day;
    String color;
    boolean select_day = false, select_color = false;

    private String mon[] = new String[13];
    private String tue[] = new String[13];
    private String wen[] = new String[13];
    private String thu[] = new String[13];
    private String fri[] = new String[13];
    private String sat[] = new String[13];
    private String sun[] = new String[13];

    public register1(){
        for(int i=0; i<13; i++){
            mon[i]="";
            tue[i]="";
            wen[i]="";
            thu[i]="";
            fri[i]="";
            sat[i]="";
            sun[i]="";
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final DBHelper dbHelper = new DBHelper(getContext(), "table.db",null, 1);
        final View view = (View)inflater.inflate(R.layout.register_schedule,container,false);
        final EditText _start = (EditText)view.findViewById(R.id.startTime);
        final EditText _end = (EditText)view.findViewById(R.id.endTime);
        final EditText _subject = (EditText)view.findViewById(R.id.register_subject);
        final EditText _professor = (EditText)view.findViewById(R.id.register_professor);
        final EditText _place = (EditText)view.findViewById(R.id.register_place);

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from timetable", null);
        String tmp = "";
        int starttime = 0 , endtime = 0;

        while(cursor.moveToNext()) {
            tmp = cursor.getString(1);
            if (tmp.equals("mon")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.mon[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                }
            }
            if (tmp.equals("tue")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.tue[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                }
            }
            if (tmp.equals("wen")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.wen[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                }
            }
            if (tmp.equals("thu")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.thu[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                }
            }
            if (tmp.equals("fri")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.fri[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                }
            }
            if (tmp.equals("sat")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.sat[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                }
            }
            if (tmp.equals("sun")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.sun[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                }
            }
        }

        btn_make = (Button)view.findViewById(R.id.btn_make);

        btn_make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _starttime = _start.getText().toString();
                String _endtime = _end.getText().toString();
                String subject = _subject.getText().toString();
                String professor = _professor.getText().toString();
                String place = _place.getText().toString();

                if(overLapCheck(_starttime, _endtime)){
                    dbHelper.insert("insert into timetable values(null, '"+ day + "', '"+_starttime + "', '"+_endtime + "', '"
                            + subject +"', '" + professor + "', '" + place + "', '" + color +"');" );

                    Toast.makeText(getActivity(),"시간 추가 성공",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(),MainActivity.class);
                    startActivity(intent);
                    getActivity().finish();
                } else {
                    Toast.makeText(getActivity(),"중복된 시간이 포함되어 있습니다",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_cancel = (Button)view.findViewById(R.id.btn_del);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        final ImageButton mon_g = (ImageButton) view.findViewById(R.id.mon_g);
        mon_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(!mon_g.isSelected()) {
                        if(!select_day){
                            mon_g.setSelected(true);
                            select_day = true;
                            day = "mon";
                        } else {
                            Toast.makeText(getActivity(), "Only one select Day", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        mon_g.setSelected(false);
                        select_day = false;
                        day = "";
                    }
                }
        });
        final ImageButton tue_g = (ImageButton) view.findViewById(R.id.tue_g);
        tue_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tue_g.isSelected()) {
                    if(!select_day){
                        tue_g.setSelected(true);
                        select_day = true;
                        day = "tue";
                    } else {
                        Toast.makeText(getActivity(), "Only one select Day", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    tue_g.setSelected(false);
                    select_day = false;
                    day = "";
                }
            }
        });
        final ImageButton wen_g = (ImageButton) view.findViewById(R.id.wen_g);
        wen_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!wen_g.isSelected()) {
                    if(!select_day){
                        wen_g.setSelected(true);
                        select_day = true;
                        day = "wen";
                    } else {
                        Toast.makeText(getActivity(), "Only one select Day", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    wen_g.setSelected(false);
                    select_day = false;
                    day = "";
                }
            }
        });
        final ImageButton thu_g = (ImageButton) view.findViewById(R.id.thu_g);
        thu_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!thu_g.isSelected()) {
                    if(!select_day){
                        thu_g.setSelected(true);
                        select_day = true;
                        day = "thu";
                    } else {
                        Toast.makeText(getActivity(), "Only one select Day", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    thu_g.setSelected(false);
                    select_day = false;
                    day = "";
                }
            }
        });
        final ImageButton fri_g = (ImageButton) view.findViewById(R.id.fri_g);
        fri_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!fri_g.isSelected()) {
                    if(!select_day){
                        fri_g.setSelected(true);
                        select_day = true;
                        day = "fri";
                    } else {
                        Toast.makeText(getActivity(), "Only one select Day", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    fri_g.setSelected(false);
                    select_day = false;
                    day = "";
                }
            }
        });
        final ImageButton sat_g = (ImageButton) view.findViewById(R.id.sat_g);
        sat_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sat_g.isSelected()) {
                    if(!select_day){
                        sat_g.setSelected(true);
                        select_day = true;
                        day = "sat";
                    } else {
                        Toast.makeText(getActivity(), "Only one select Day", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    sat_g.setSelected(false);
                    select_day = false;
                    day = "";
                }
            }
        });
        final ImageButton sun_g = (ImageButton) view.findViewById(R.id.sun_g);
        sun_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sun_g.isSelected()) {
                    if(!select_day){
                        sun_g.setSelected(true);
                        select_day = true;
                        day = "sun";
                    } else {
                        Toast.makeText(getActivity(), "Only one select Day", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    sun_g.setSelected(false);
                    select_day = false;
                    day = "";
                }
            }
        });
        final ImageButton red = (ImageButton) view.findViewById(R.id.red);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!red.isSelected()) {
                    if(!select_color){
                        red.setSelected(true);
                        select_color = true;
                        color = "red";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    red.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton oragne = (ImageButton) view.findViewById(R.id.orange);
        oragne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!oragne.isSelected()) {
                    if(!select_color){
                        oragne.setSelected(true);
                        select_color = true;
                        color = "orange";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    oragne.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton yellow = (ImageButton) view.findViewById(R.id.yellow);
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yellow.isSelected()) {
                    if(!select_color){
                        yellow.setSelected(true);
                        select_color = true;
                        color = "yellow";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    yellow.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton ye_green = (ImageButton) view.findViewById(R.id.ye_green);
        ye_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ye_green.isSelected()) {
                    if(!select_color){
                        ye_green.setSelected(true);
                        select_color = true;
                        color = "ye_green";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    ye_green.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton green = (ImageButton) view.findViewById(R.id.green);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!green.isSelected()) {
                    if(!select_color){
                        green.setSelected(true);
                        select_color = true;
                        color = "green";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    green.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton gr_mint = (ImageButton) view.findViewById(R.id.gr_mint);
        gr_mint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gr_mint.isSelected()) {
                    if(!select_color){
                        gr_mint.setSelected(true);
                        select_color = true;
                        color = "gr_mint";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    gr_mint.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton mint = (ImageButton) view.findViewById(R.id.mint);
        mint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mint.isSelected()) {
                    if(!select_color){
                        mint.setSelected(true);
                        select_color = true;
                        color = "mint";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    mint.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton sky_blue = (ImageButton) view.findViewById(R.id.sky_blue);
        sky_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sky_blue.isSelected()) {
                    if(!select_color){
                        sky_blue.setSelected(true);
                        select_color = true;
                        color = "sky_blue";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    sky_blue.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton blue = (ImageButton) view.findViewById(R.id.blue);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!blue.isSelected()) {
                    if(!select_color){
                        blue.setSelected(true);
                        select_color = true;
                        color = "blue";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    blue.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton ocean = (ImageButton) view.findViewById(R.id.ocean);
        ocean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ocean.isSelected()) {
                    if(!select_color){
                        ocean.setSelected(true);
                        select_color = true;
                        color = "ocean";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    ocean.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton bl_purple = (ImageButton) view.findViewById(R.id.bl_purple);
        bl_purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!bl_purple.isSelected()) {
                    if(!select_color){
                        bl_purple.setSelected(true);
                        select_color = true;
                        color = "bl_purple";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    bl_purple.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton purple = (ImageButton) view.findViewById(R.id.purple);
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!purple.isSelected()) {
                    if(!select_color){
                        purple.setSelected(true);
                        select_color = true;
                        color = "purple";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    purple.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton pu_pink = (ImageButton) view.findViewById(R.id.pu_pink);
        pu_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!pu_pink.isSelected()) {
                    if(!select_color){
                        pu_pink.setSelected(true);
                        select_color = true;
                        color = "pu_pink";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    pu_pink.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton pink = (ImageButton) view.findViewById(R.id.pink);
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!pink.isSelected()) {
                    if(!select_color){
                        pink.setSelected(true);
                        select_color = true;
                        color = "pink";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    pink.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton gray_b = (ImageButton) view.findViewById(R.id.gray_b);
        gray_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gray_b.isSelected()) {
                    if(!select_color){
                        gray_b.setSelected(true);
                        select_color = true;
                        color = "gray_b";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    gray_b.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });
        final ImageButton gray_w = (ImageButton) view.findViewById(R.id.gray_w);
        gray_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gray_w.isSelected()) {
                    if(!select_color){
                        gray_w.setSelected(true);
                        select_color = true;
                        color = "gray_w";
                    } else {
                        Toast.makeText(getActivity(),"Only one select Color", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    gray_w.setSelected(false);
                    select_color = false;
                    color = "";
                }
            }
        });

        return view;
    }

    public boolean overLapCheck(String _starttime, String _endtime) {
        Log.d(_starttime, "StartTime");
        Log.d(_endtime, "EndTime");

        int St = Integer.parseInt(_starttime);
        int Ed = Integer.parseInt(_endtime);

        if (day.equals("mon")) { ;
            for (int i = St-9; i < Ed-9; i++) {
                if (!mon[i].equals("") || mon[i]!="") {
                    return false;
                }
            }
        }
        if (day.equals("tue")) {
            for (int i = St-9; i < Ed-9; i++) {
                if (!tue[i].equals("") || tue[i]!="") {
                    return false;
                }
            }
        }
        if (day.equals("wen")) {
            for (int i = St-9; i < Ed-9; i++) {
                if (!wen[i].equals("") || wen[i]!="") {
                    return false;
                }
            }
        }
        if (day.equals("thu")) {
            for (int i = St-9; i < Ed-9; i++) {
                if (!thu[i].equals("") || thu[i]!="") {
                    return false;
                }
            }
        }
        if (day.equals("fri")) {
            for (int i = St-9; i < Ed-9; i++) {
                if (!fri[i].equals("") || fri[i]!="") {
                    return false;
                }
            }
        }
        if (day.equals("sat")) {
            for (int i = St-9; i < Ed-9; i++) {
                if (!sat[i].equals("") || sat[i]!="") {
                    return false;
                }
            }
        }
        if (day.equals("sun")) {
            for (int i = St-9; i < Ed-9; i++) {
                if (!sun[i].equals("") || sun[i]!="") {
                    return false;
                }
            }
        }
        return true;
    }
}
