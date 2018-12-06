package com.example.dddeok.timeschedule;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.TextView;

public class Schedule {
    private String mon[] = new String[13];
    private String tue[] = new String[13];
    private String wen[] = new String[13];
    private String thu[] = new String[13];
    private String fri[] = new String[13];
    private String sat[] = new String[13];
    private String sun[] = new String[13];
    private int _start = 0;
    private int _end = 0;

    public Schedule(){
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

    public void setting(TextView[] mon, TextView[] tue, TextView[] wen, TextView[] thu, TextView[] fri, TextView[] sat, TextView[] sun, Context context){
        DBHelper dbHelper = new DBHelper(context,"table.db",null,1);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from timetable", null);
        Log.d("Test","Test");

        String tmp = "";

        /*while(cursor.moveToNext()){
            str +=  cursor.getString(1)
                    + cursor.getString(2)
                    + cursor.getString(3)
                    + "\n";

            Log.d(str, "Test");
        }*/
        while(cursor.moveToNext()){
            tmp = cursor.getString(1);
            if(tmp.equals("mon")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));

                for(int i = _start-9; i<_end-9; i++){
                    this.mon[i] = cursor.getString(4)+ "\n" + cursor.getString(5);
                    mon[i].setText(this.mon[i]);
                    Log.d(this.mon[i], "Test");
                }
            }
            if(tmp.equals("tue")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));

                for(int i = _start-9; i<_end-9; i++){
                    this.tue[i] = cursor.getString(4) +"\n" + cursor.getString(5);
                    tue[i].setText(this.tue[i]);
                    Log.d(this.tue[i], "Test");
                }
            }

            if(tmp.equals("wen")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));

                for(int i = _start-9; i<_end-9; i++){
                    this.wen[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                    wen[i].setText(this.wen[i]);
                    Log.d(this.wen[i], "Test");
                }
            }
            if(tmp.equals("thu")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));

                for(int i = _start-9; i<_end-9; i++){
                    this.thu[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                    thu[i].setText(this.thu[i]);
                    Log.d(this.thu[i], "Test");
                }
            }
            if(tmp.equals("fri")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));

                for(int i = _start-9; i<_end-9; i++){
                    this.fri[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                    fri[i].setText(this.fri[i]);
                    Log.d(this.fri[i], "Test");
                }
            }
            if(tmp.equals("sat")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));

                for(int i = _start-9; i<_end-9; i++){
                    this.sat[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                    sat[i].setText(this.sat[i]);
                    Log.d(this.sat[i], "Test");
                }
            }
            if(tmp.equals("sun")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));

                for(int i = _start-9; i<_end-9; i++){
                    this.sun[i] = cursor.getString(4) + "\n" +cursor.getString(5);
                    sun[i].setText(this.sun[i]);
                    Log.d(this.sun[i], "Test");
                }
            }
        }

    }
}
