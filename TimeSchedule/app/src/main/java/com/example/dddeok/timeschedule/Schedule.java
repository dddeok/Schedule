package com.example.dddeok.timeschedule;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
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
    private String color ="";

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

    public void setting(AutoResizeTextView[] mon, AutoResizeTextView[] tue, AutoResizeTextView[] wen, AutoResizeTextView[] thu, AutoResizeTextView[] fri, AutoResizeTextView[] sat, AutoResizeTextView[] sun, Context context){
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
                color = cursor.getString(7);

                for(int i = _start-9; i<_end-9; i++){
                    this.mon[i] = cursor.getString(4)+ "\n" + cursor.getString(5) ;
                    if(color.equals("red")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.red));
                    }
                    if(color.equals("orange")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.orange));
                    }
                    if(color.equals("yellow")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.yellow));
                    }
                    if(color.equals("ye_green")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.ye_green));
                    }
                    if(color.equals("green")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.green));
                    }
                    if(color.equals("gr_mint")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.gr_mint));
                    }
                    if(color.equals("mint")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.mint));
                    }
                    if(color.equals("sky_blue")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.sky_blue));
                    }
                    if(color.equals("blue")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.blue));
                    }
                    if(color.equals("ocean")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.ocean));
                    }
                    if(color.equals("bl_purple")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.bl_purple));
                    }
                    if(color.equals("purple")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.purple));
                    }
                    if(color.equals("pu_pink")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.pu_pink));
                    }
                    if(color.equals("pink")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.pink));
                    }
                    if(color.equals("gray_b")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.gray_b));
                    }
                    if(color.equals("gray_w")){
                        mon[i].setBackgroundColor(context.getResources().getColor(R.color.gray_w));
                    }
                    Log.d(this.mon[i], "Test");
                }
            }
            if(tmp.equals("tue")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));
                color = cursor.getString(7);
                for(int i = _start-9; i<_end-9; i++){
                    this.tue[i] = cursor.getString(4) +"\n" + cursor.getString(5);
                    Log.d(this.tue[i], "Test");

                    if(color.equals("red")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.red));
                    }
                    if(color.equals("orange")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.orange));
                    }
                    if(color.equals("yellow")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.yellow));
                    }
                    if(color.equals("ye_green")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.ye_green));
                    }
                    if(color.equals("green")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.green));
                    }
                    if(color.equals("gr_mint")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.gr_mint));
                    }
                    if(color.equals("mint")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.mint));
                    }
                    if(color.equals("sky_blue")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.sky_blue));
                    }
                    if(color.equals("blue")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.blue));
                    }
                    if(color.equals("ocean")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.ocean));
                    }
                    if(color.equals("bl_purple")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.bl_purple));
                    }
                    if(color.equals("purple")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.purple));
                    }
                    if(color.equals("pu_pink")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.pu_pink));
                    }
                    if(color.equals("pink")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.pink));
                    }
                    if(color.equals("gray_b")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.gray_b));
                    }
                    if(color.equals("gray_w")){
                        tue[i].setBackgroundColor(context.getResources().getColor(R.color.gray_w));
                    }
                }
            }

            if(tmp.equals("wen")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));
                color = cursor.getString(7);

                for(int i = _start-9; i<_end-9; i++){
                    this.wen[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                    if(color.equals("red")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.red));
                    }
                    if(color.equals("orange")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.orange));
                    }
                    if(color.equals("yellow")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.yellow));
                    }
                    if(color.equals("ye_green")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.ye_green));
                    }
                    if(color.equals("green")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.green));
                    }
                    if(color.equals("gr_mint")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.gr_mint));
                    }
                    if(color.equals("mint")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.mint));
                    }
                    if(color.equals("sky_blue")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.sky_blue));
                    }
                    if(color.equals("blue")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.blue));
                    }
                    if(color.equals("ocean")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.ocean));
                    }
                    if(color.equals("bl_purple")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.bl_purple));
                    }
                    if(color.equals("purple")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.purple));
                    }
                    if(color.equals("pu_pink")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.pu_pink));
                    }
                    if(color.equals("pink")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.pink));
                    }
                    if(color.equals("gray_b")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.gray_b));
                    }
                    if(color.equals("gray_w")){
                        wen[i].setBackgroundColor(context.getResources().getColor(R.color.gray_w));
                    }
                    Log.d(this.wen[i], "Test");
                }
            }
            if(tmp.equals("thu")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));
                color = cursor.getString(7);

                for(int i = _start-9; i<_end-9; i++){
                    this.thu[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                    if(color.equals("red")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.red));
                    }
                    if(color.equals("orange")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.orange));
                    }
                    if(color.equals("yellow")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.yellow));
                    }
                    if(color.equals("ye_green")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.ye_green));
                    }
                    if(color.equals("green")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.green));
                    }
                    if(color.equals("gr_mint")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.gr_mint));
                    }
                    if(color.equals("mint")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.mint));
                    }
                    if(color.equals("sky_blue")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.sky_blue));
                    }
                    if(color.equals("blue")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.blue));
                    }
                    if(color.equals("ocean")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.ocean));
                    }
                    if(color.equals("bl_purple")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.bl_purple));
                    }
                    if(color.equals("purple")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.purple));
                    }
                    if(color.equals("pu_pink")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.pu_pink));
                    }
                    if(color.equals("pink")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.pink));
                    }
                    if(color.equals("gray_b")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.gray_b));
                    }
                    if(color.equals("gray_w")){
                        thu[i].setBackgroundColor(context.getResources().getColor(R.color.gray_w));
                    }
                    Log.d(this.thu[i], "Test");
                }
            }
            if(tmp.equals("fri")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));
                color = cursor.getString(7);

                for(int i = _start-9; i<_end-9; i++){
                    this.fri[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                    if(color.equals("red")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.red));
                    }
                    if(color.equals("orange")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.orange));
                    }
                    if(color.equals("yellow")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.yellow));
                    }
                    if(color.equals("ye_green")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.ye_green));
                    }
                    if(color.equals("green")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.green));
                    }
                    if(color.equals("gr_mint")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.gr_mint));
                    }
                    if(color.equals("mint")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.mint));
                    }
                    if(color.equals("sky_blue")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.sky_blue));
                    }
                    if(color.equals("blue")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.blue));
                    }
                    if(color.equals("ocean")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.ocean));
                    }
                    if(color.equals("bl_purple")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.bl_purple));
                    }
                    if(color.equals("purple")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.purple));
                    }
                    if(color.equals("pu_pink")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.pu_pink));
                    }
                    if(color.equals("pink")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.pink));
                    }
                    if(color.equals("gray_b")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.gray_b));
                    }
                    if(color.equals("gray_w")){
                        fri[i].setBackgroundColor(context.getResources().getColor(R.color.gray_w));
                    }
                    Log.d(this.fri[i], "Test");
                }
            }
            if(tmp.equals("sat")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));
                color = cursor.getString(7);

                for(int i = _start-9; i<_end-9; i++){
                    this.sat[i] = cursor.getString(4) + "\n" + cursor.getString(5);
                    if(color.equals("red")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.red));
                    }
                    if(color.equals("orange")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.orange));
                    }
                    if(color.equals("yellow")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.yellow));
                    }
                    if(color.equals("ye_green")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.ye_green));
                    }
                    if(color.equals("green")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.green));
                    }
                    if(color.equals("gr_mint")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.gr_mint));
                    }
                    if(color.equals("mint")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.mint));
                    }
                    if(color.equals("sky_blue")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.sky_blue));
                    }
                    if(color.equals("blue")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.blue));
                    }
                    if(color.equals("ocean")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.ocean));
                    }
                    if(color.equals("bl_purple")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.bl_purple));
                    }
                    if(color.equals("purple")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.purple));
                    }
                    if(color.equals("pu_pink")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.pu_pink));
                    }
                    if(color.equals("pink")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.pink));
                    }
                    if(color.equals("gray_b")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.gray_b));
                    }
                    if(color.equals("gray_w")){
                        sat[i].setBackgroundColor(context.getResources().getColor(R.color.gray_w));
                    }
                    Log.d(this.sat[i], "Test");
                }
            }
            if(tmp.equals("sun")){
                _start = Integer.parseInt(cursor.getString(2));
                _end = Integer.parseInt(cursor.getString(3));
                color = cursor.getString(7);

                for(int i = _start-9; i<_end-9; i++){
                    this.sun[i] = cursor.getString(4) + "\n" +cursor.getString(5);
                    if(color.equals("red")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.red));
                    }
                    if(color.equals("orange")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.orange));
                    }
                    if(color.equals("yellow")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.yellow));
                    }
                    if(color.equals("ye_green")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.ye_green));
                    }
                    if(color.equals("green")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.green));
                    }
                    if(color.equals("gr_mint")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.gr_mint));
                    }
                    if(color.equals("mint")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.mint));
                    }
                    if(color.equals("sky_blue")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.sky_blue));
                    }
                    if(color.equals("blue")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.blue));
                    }
                    if(color.equals("ocean")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.ocean));
                    }
                    if(color.equals("bl_purple")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.bl_purple));
                    }
                    if(color.equals("purple")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.purple));
                    }
                    if(color.equals("pu_pink")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.pu_pink));
                    }
                    if(color.equals("pink")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.pink));
                    }
                    if(color.equals("gray_b")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.gray_b));
                    }
                    if(color.equals("gray_w")){
                        sun[i].setBackgroundColor(context.getResources().getColor(R.color.gray_w));
                    }
                    Log.d(this.sun[i], "Test");
                }
            }
        }
        int maxLength = 0;
        String maxString = "";

        for(int i=0; i<13; i++){
            if(this.mon[i].length() >maxLength){
                maxLength = this.mon[i].length();
                maxString = this.mon[i];
            }
            if(this.tue[i].length() >maxLength){
                maxLength = this.tue[i].length();
                maxString = this.tue[i];
            }
            if(this.wen[i].length() >maxLength){
                maxLength = this.wen[i].length();
                maxString = this.wen[i];
            }
            if(this.thu[i].length() >maxLength){
                maxLength = this.thu[i].length();
                maxString = this.thu[i];
            }
            if(this.fri[i].length() >maxLength){
                maxLength = this.fri[i].length();
                maxString = this.fri[i];
            }
            if(this.sat[i].length() >maxLength){
                maxLength = this.sat[i].length();
                maxString = this.sat[i];
            }
            if(this.sun[i].length() >maxLength){
                maxLength = this.sun[i].length();
                maxString = this.sun[i];
            }
        }
        for(int i=0; i<13; i++) {
            if (!this.mon[i].equals("")) {
                mon[i].setText(this.mon[i]);
                mon[i].setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                mon[i].setTextColor(context.getResources().getColor(R.color.white));
            } else {
                mon[i].setText(maxString);
                mon[i].setTextColor(context.getResources().getColor(R.color.back));
            }
            if (!this.tue[i].equals("")) {
                tue[i].setText(this.tue[i]);
                tue[i].setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                tue[i].setTextColor(context.getResources().getColor(R.color.white));
            } else {
                tue[i].setText(maxString);
                tue[i].setTextColor(context.getResources().getColor(R.color.back));
            }
            if (!this.wen[i].equals("")) {
                wen[i].setText(this.wen[i]);
                wen[i].setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                wen[i].setTextColor(context.getResources().getColor(R.color.white));
            } else {
                wen[i].setText(maxString);
                wen[i].setTextColor(context.getResources().getColor(R.color.back));
            }
            if (!this.thu[i].equals("")) {
                thu[i].setText(this.thu[i]);
                thu[i].setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                thu[i].setTextColor(context.getResources().getColor(R.color.white));
            } else {
                thu[i].setText(maxString);
                thu[i].setTextColor(context.getResources().getColor(R.color.back));
            }
            if (!this.fri[i].equals("")) {
                fri[i].setText(this.fri[i]);
                fri[i].setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                fri[i].setTextColor(context.getResources().getColor(R.color.white));
            } else {
                fri[i].setText(maxString);
                fri[i].setTextColor(context.getResources().getColor(R.color.back));
            }
            if (!this.sat[i].equals("")) {
                sat[i].setText(this.sat[i]);
                sat[i].setTextAlignment(View.TEXT_ALIGNMENT_CENTER);;
                sat[i].setTextColor(context.getResources().getColor(R.color.white));
            } else {
                sat[i].setText(maxString);
                sat[i].setTextColor(context.getResources().getColor(R.color.back));
            }
            if (!this.sun[i].equals("")) {
                sun[i].setText(this.sun[i]);
                sun[i].setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                sun[i].setTextColor(context.getResources().getColor(R.color.white));
            } else {
                sun[i].setText(maxString);
                sun[i].setTextColor(context.getResources().getColor(R.color.back));
            }

            mon[i].resizeText();
            tue[i].resizeText();
            wen[i].resizeText();
            thu[i].resizeText();
            fri[i].resizeText();
            sat[i].resizeText();
            sun[i].resizeText();
        }
    }
}
