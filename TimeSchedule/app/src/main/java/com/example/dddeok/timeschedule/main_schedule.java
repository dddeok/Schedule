package com.example.dddeok.timeschedule;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class main_schedule extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private TextView mon[] = new TextView[13];
    private TextView tue[] = new TextView[13];
    private TextView wen[] = new TextView[13];
    private TextView thu[] = new TextView[13];
    private TextView fri[] = new TextView[13];
    private TextView sat[] = new TextView[13];
    private TextView sun[] = new TextView[13];
    private Schedule schedule = new Schedule();


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mon[0] = (TextView)getView().findViewById(R.id.mon0);
        mon[1] = (TextView)getView().findViewById(R.id.mon1);
        mon[2] = (TextView)getView().findViewById(R.id.mon2);
        mon[3] = (TextView)getView().findViewById(R.id.mon3);
        mon[4] = (TextView)getView().findViewById(R.id.mon4);
        mon[5] = (TextView)getView().findViewById(R.id.mon5);
        mon[6] = (TextView)getView().findViewById(R.id.mon6);
        mon[7] = (TextView)getView().findViewById(R.id.mon7);
        mon[8] = (TextView)getView().findViewById(R.id.mon8);
        mon[9] = (TextView)getView().findViewById(R.id.mon9);
        mon[10] = (TextView)getView().findViewById(R.id.mon10);
        mon[11] = (TextView)getView().findViewById(R.id.mon11);
        mon[12] = (TextView)getView().findViewById(R.id.mon12);

        tue[0] = (TextView)getView().findViewById(R.id.tue0);
        tue[1] = (TextView)getView().findViewById(R.id.tue1);
        tue[2] = (TextView)getView().findViewById(R.id.tue2);
        tue[3] = (TextView)getView().findViewById(R.id.tue3);
        tue[4] = (TextView)getView().findViewById(R.id.tue4);
        tue[5] = (TextView)getView().findViewById(R.id.tue5);
        tue[6] = (TextView)getView().findViewById(R.id.tue6);
        tue[7] = (TextView)getView().findViewById(R.id.tue7);
        tue[8] = (TextView)getView().findViewById(R.id.tue8);
        tue[9] = (TextView)getView().findViewById(R.id.tue9);
        tue[10] = (TextView)getView().findViewById(R.id.tue10);
        tue[11] = (TextView)getView().findViewById(R.id.tue11);
        tue[12] = (TextView)getView().findViewById(R.id.tue12);

        wen[0] = (TextView)getView().findViewById(R.id.wen0);
        wen[1] = (TextView)getView().findViewById(R.id.wen1);
        wen[2] = (TextView)getView().findViewById(R.id.wen2);
        wen[3] = (TextView)getView().findViewById(R.id.wen3);
        wen[4] = (TextView)getView().findViewById(R.id.wen4);
        wen[5] = (TextView)getView().findViewById(R.id.wen5);
        wen[6] = (TextView)getView().findViewById(R.id.wen6);
        wen[7] = (TextView)getView().findViewById(R.id.wen7);
        wen[8] = (TextView)getView().findViewById(R.id.wen8);
        wen[9] = (TextView)getView().findViewById(R.id.wen9);
        wen[10] = (TextView)getView().findViewById(R.id.wen10);
        wen[11] = (TextView)getView().findViewById(R.id.wen11);
        wen[12] = (TextView)getView().findViewById(R.id.wen12);

        thu[0] = (TextView)getView().findViewById(R.id.thu0);
        thu[1] = (TextView)getView().findViewById(R.id.thu1);
        thu[2] = (TextView)getView().findViewById(R.id.thu2);
        thu[3] = (TextView)getView().findViewById(R.id.thu3);
        thu[4] = (TextView)getView().findViewById(R.id.thu4);
        thu[5] = (TextView)getView().findViewById(R.id.thu5);
        thu[6] = (TextView)getView().findViewById(R.id.thu6);
        thu[7] = (TextView)getView().findViewById(R.id.thu7);
        thu[8] = (TextView)getView().findViewById(R.id.thu8);
        thu[9] = (TextView)getView().findViewById(R.id.thu9);
        thu[10] = (TextView)getView().findViewById(R.id.thu10);
        thu[11] = (TextView)getView().findViewById(R.id.thu11);
        thu[12] = (TextView)getView().findViewById(R.id.thu12);

        fri[0] = (TextView)getView().findViewById(R.id.fri0);
        fri[1] = (TextView)getView().findViewById(R.id.fri1);
        fri[2] = (TextView)getView().findViewById(R.id.fri2);
        fri[3] = (TextView)getView().findViewById(R.id.fri3);
        fri[4] = (TextView)getView().findViewById(R.id.fri4);
        fri[5] = (TextView)getView().findViewById(R.id.fri5);
        fri[6] = (TextView)getView().findViewById(R.id.fri6);
        fri[7] = (TextView)getView().findViewById(R.id.fri7);
        fri[8] = (TextView)getView().findViewById(R.id.fri8);
        fri[9] = (TextView)getView().findViewById(R.id.fri9);
        fri[10] = (TextView)getView().findViewById(R.id.fri10);
        fri[11] = (TextView)getView().findViewById(R.id.fri11);
        fri[12] = (TextView)getView().findViewById(R.id.fri12);

        sat[0] = (TextView)getView().findViewById(R.id.sat0);
        sat[1] = (TextView)getView().findViewById(R.id.sat1);
        sat[2] = (TextView)getView().findViewById(R.id.sat2);
        sat[3] = (TextView)getView().findViewById(R.id.sat3);
        sat[4] = (TextView)getView().findViewById(R.id.sat4);
        sat[5] = (TextView)getView().findViewById(R.id.sat5);
        sat[6] = (TextView)getView().findViewById(R.id.sat6);
        sat[7] = (TextView)getView().findViewById(R.id.sat7);
        sat[8] = (TextView)getView().findViewById(R.id.sat8);
        sat[9] = (TextView)getView().findViewById(R.id.sat9);
        sat[10] = (TextView)getView().findViewById(R.id.sat10);
        sat[11] = (TextView)getView().findViewById(R.id.sat11);
        sat[12] = (TextView)getView().findViewById(R.id.sat12);

        sun[0] = (TextView)getView().findViewById(R.id.sun0);
        sun[1] = (TextView)getView().findViewById(R.id.sun1);
        sun[2] = (TextView)getView().findViewById(R.id.sun2);
        sun[3] = (TextView)getView().findViewById(R.id.sun3);
        sun[4] = (TextView)getView().findViewById(R.id.sun4);
        sun[5] = (TextView)getView().findViewById(R.id.sun5);
        sun[6] = (TextView)getView().findViewById(R.id.sun6);
        sun[7] = (TextView)getView().findViewById(R.id.sun7);
        sun[8] = (TextView)getView().findViewById(R.id.sun8);
        sun[9] = (TextView)getView().findViewById(R.id.sun9);
        sun[10] = (TextView)getView().findViewById(R.id.sun10);
        sun[11] = (TextView)getView().findViewById(R.id.sun11);
        sun[12] = (TextView)getView().findViewById(R.id.sun12);

        schedule.setting(mon,tue,wen,thu,fri,sat,sun,getContext());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View)inflater.inflate(R.layout.schedule,container,false);

        DBHelper dbHelper = new DBHelper(getContext(), "table.db", null, 1);

        TextView testdb = (TextView)view.findViewById(R.id.testdb);
        testdb.setText(dbHelper.PrintData());

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery(" select * from timetable ", null);
        while(cursor.moveToNext()){

        }

        TableLayout table = (TableLayout) view.findViewById(R.id.table);
                table.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(),register_Schedule.class);
                        startActivity(intent);
                        getActivity().finish();
                    }
                });
        return view;
    }
}
