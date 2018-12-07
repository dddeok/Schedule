package com.example.dddeok.timeschedule;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class main_schedule extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private AutoResizeTextView mon[] = new AutoResizeTextView[13];
    private AutoResizeTextView tue[] = new AutoResizeTextView[13];
    private AutoResizeTextView wen[] = new AutoResizeTextView[13];
    private AutoResizeTextView thu[] = new AutoResizeTextView[13];
    private AutoResizeTextView fri[] = new AutoResizeTextView[13];
    private AutoResizeTextView sat[] = new AutoResizeTextView[13];
    private AutoResizeTextView sun[] = new AutoResizeTextView[13];

    private String Strmon[] = new String[13];
    private String Strtue[] = new String[13];
    private String Strwen[] = new String[13];
    private String Strthu[] = new String[13];
    private String Strfri[] = new String[13];
    private String Strsat[] = new String[13];
    private String Strsun[] = new String[13];

    private Schedule schedule = new Schedule();


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final DBHelper dbHelper = new DBHelper(getContext(), "table.db",null, 1);
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
                    this.Strmon[i] = " 강의날짜 : " + cursor.getString(1) + "\n"
                                    +" 시작시간 : " + cursor.getString(2) + "\n"
                                    +" 종료시간 : " + cursor.getString(3) + "\n"
                                    +" 과목명 : " + cursor.getString(4) + "\n"
                                    +" 교수명 : " + cursor.getString(5) + "\n"
                                    +" 장소 : " + cursor.getString(6);
                }
            }
            if (tmp.equals("tue")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.Strtue[i] = " 강의날짜 : " + cursor.getString(1) + "\n"
                            +" 시작시간 : " + cursor.getString(2) + "\n"
                            +" 종료시간 : " + cursor.getString(3) + "\n"
                            +" 과목명 : " + cursor.getString(4) + "\n"
                            +" 교수명 : " + cursor.getString(5) + "\n"
                            +" 장소 : " + cursor.getString(6);
                }
            }
            if (tmp.equals("wen")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.Strwen[i] = " 강의날짜 : " + cursor.getString(1) + "\n"
                            +" 시작시간 : " + cursor.getString(2) + "\n"
                            +" 종료시간 : " + cursor.getString(3) + "\n"
                            +" 과목명 : " + cursor.getString(4) + "\n"
                            +" 교수명 : " + cursor.getString(5) + "\n"
                            +" 장소 : " + cursor.getString(6);
                }
            }
            if (tmp.equals("thu")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.Strthu[i] = " 강의날짜 : " + cursor.getString(1) + "\n"
                            +" 시작시간 : " + cursor.getString(2) + "\n"
                            +" 종료시간 : " + cursor.getString(3) + "\n"
                            +" 과목명 : " + cursor.getString(4) + "\n"
                            +" 교수명 : " + cursor.getString(5) + "\n"
                            +" 장소 : " + cursor.getString(6);
                }
            }
            if (tmp.equals("fri")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.Strfri[i] = " 강의날짜 : " + cursor.getString(1) + "\n"
                            +" 시작시간 : " + cursor.getString(2) + "\n"
                            +" 종료시간 : " + cursor.getString(3) + "\n"
                            +" 과목명 : " + cursor.getString(4) + "\n"
                            +" 교수명 : " + cursor.getString(5) + "\n"
                            +" 장소 : " + cursor.getString(6);
                }
            }
            if (tmp.equals("sat")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.Strsat[i] = " 강의날짜 : " + cursor.getString(1) + "\n"
                            +" 시작시간 : " + cursor.getString(2) + "\n"
                            +" 종료시간 : " + cursor.getString(3) + "\n"
                            +" 과목명 : " + cursor.getString(4) + "\n"
                            +" 교수명 : " + cursor.getString(5) + "\n"
                            +" 장소 : " + cursor.getString(6);
                }
            }
            if (tmp.equals("sun")) {
                starttime = Integer.parseInt(cursor.getString(2));
                endtime = Integer.parseInt(cursor.getString(3));

                for (int i = starttime - 9; i < endtime - 9; i++) {
                    this.Strsun[i] = " 강의날짜 : " + cursor.getString(1) + "\n"
                            +" 시작시간 : " + cursor.getString(2) + "\n"
                            +" 종료시간 : " + cursor.getString(3) + "\n"
                            +" 과목명 : " + cursor.getString(4) + "\n"
                            +" 교수명 : " + cursor.getString(5) + "\n"
                            +" 장소 : " + cursor.getString(6);
                }
            }
        }


        mon[0] = (AutoResizeTextView) getView().findViewById(R.id.mon0);
        mon[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[0].equals("") || Strmon[0]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[0])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dbHelper.delete("delete from timetable");
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[1] = (AutoResizeTextView) getView().findViewById(R.id.mon1);
        mon[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[1].equals("") || Strmon[1]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[1])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[2] = (AutoResizeTextView) getView().findViewById(R.id.mon2);
        mon[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[2].equals("") || Strmon[2]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[2])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[3] = (AutoResizeTextView) getView().findViewById(R.id.mon3);
        mon[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[3].equals("") || Strmon[3]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[3])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[4] = (AutoResizeTextView) getView().findViewById(R.id.mon4);
        mon[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[4].equals("") || Strmon[4]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[4])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[5] = (AutoResizeTextView) getView().findViewById(R.id.mon5);
        mon[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[5].equals("") || Strmon[5]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[5])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[6] = (AutoResizeTextView) getView().findViewById(R.id.mon6);
        mon[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[6].equals("") || Strmon[6]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[6])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[7] = (AutoResizeTextView) getView().findViewById(R.id.mon7);
        mon[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[7].equals("") || Strmon[7]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[7])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[8] = (AutoResizeTextView) getView().findViewById(R.id.mon8);
        mon[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[8].equals("") || Strmon[8]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[8])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[9] = (AutoResizeTextView) getView().findViewById(R.id.mon9);
        mon[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[9].equals("") || Strmon[9]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[9])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[10] = (AutoResizeTextView) getView().findViewById(R.id.mon10);
        mon[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[10].equals("") || Strmon[10]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[10])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[11] = (AutoResizeTextView) getView().findViewById(R.id.mon11);
        mon[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[11].equals("") || Strmon[11]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[11])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        mon[12] = (AutoResizeTextView) getView().findViewById(R.id.mon12);
        mon[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strmon[12].equals("") || Strmon[12]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strmon[12])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        tue[0] = (AutoResizeTextView)getView().findViewById(R.id.tue0);
        tue[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[0].equals("") || Strtue[0]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[0])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[1] = (AutoResizeTextView)getView().findViewById(R.id.tue1);
        tue[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[1].equals("") || Strtue[1]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[1])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[2] = (AutoResizeTextView)getView().findViewById(R.id.tue2);
        tue[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[2].equals("") || Strtue[2]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[2])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[3] = (AutoResizeTextView)getView().findViewById(R.id.tue3);
        tue[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[3].equals("") || Strtue[3]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[3])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[4] = (AutoResizeTextView)getView().findViewById(R.id.tue4);
        tue[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[4].equals("") || Strtue[4]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[4])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[5] = (AutoResizeTextView)getView().findViewById(R.id.tue5);
        tue[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[5].equals("") || Strtue[5]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[5])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[6] = (AutoResizeTextView)getView().findViewById(R.id.tue6);
        tue[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[6].equals("") || Strtue[6]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[6])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[7] = (AutoResizeTextView)getView().findViewById(R.id.tue7);
        tue[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[7].equals("") || Strtue[7]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[7])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[8] = (AutoResizeTextView)getView().findViewById(R.id.tue8);
        tue[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[8].equals("") || Strtue[8]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[8])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[9] = (AutoResizeTextView)getView().findViewById(R.id.tue9);
        tue[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[9].equals("") || Strtue[9]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[9])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[10] = (AutoResizeTextView)getView().findViewById(R.id.tue10);
        tue[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[10].equals("") || Strtue[10]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[10])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[11] = (AutoResizeTextView)getView().findViewById(R.id.tue11);
        tue[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[11].equals("") || Strtue[11]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[11])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        tue[12] = (AutoResizeTextView)getView().findViewById(R.id.tue12);
        tue[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strtue[12].equals("") || Strtue[12]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strtue[12])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        wen[0] = (AutoResizeTextView)getView().findViewById(R.id.wen0);
        wen[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[0].equals("") || Strwen[0]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[0])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[1] = (AutoResizeTextView)getView().findViewById(R.id.wen1);
        wen[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[1].equals("") || Strwen[1]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[1])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[2] = (AutoResizeTextView)getView().findViewById(R.id.wen2);
        wen[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[2].equals("") || Strwen[2]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[2])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[3] = (AutoResizeTextView)getView().findViewById(R.id.wen3);
        wen[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[3].equals("") || Strwen[3]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[3])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[4] = (AutoResizeTextView)getView().findViewById(R.id.wen4);
        wen[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[4].equals("") || Strwen[4]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[4])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[5] = (AutoResizeTextView)getView().findViewById(R.id.wen5);
        wen[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[5].equals("") || Strwen[5]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[5])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[6] = (AutoResizeTextView)getView().findViewById(R.id.wen6);
        wen[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[6].equals("") || Strwen[6]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[6])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[7] = (AutoResizeTextView)getView().findViewById(R.id.wen7);
        wen[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[7].equals("") || Strwen[7]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[7])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[8] = (AutoResizeTextView)getView().findViewById(R.id.wen8);
        wen[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[8].equals("") || Strwen[8]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[8])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[9] = (AutoResizeTextView)getView().findViewById(R.id.wen9);
        wen[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[9].equals("") || Strwen[9]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[9])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[10] = (AutoResizeTextView)getView().findViewById(R.id.wen10);
        wen[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[10].equals("") || Strwen[10]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[10])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[11] = (AutoResizeTextView)getView().findViewById(R.id.wen11);
        wen[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[11].equals("") || Strwen[11]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[11])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        wen[12] = (AutoResizeTextView)getView().findViewById(R.id.wen12);
        wen[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strwen[12].equals("") || Strwen[12]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strwen[12])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        thu[0] = (AutoResizeTextView)getView().findViewById(R.id.thu0);
        thu[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[0].equals("") || Strthu[0]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[0])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[1] = (AutoResizeTextView)getView().findViewById(R.id.thu1);
        thu[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[1].equals("") || Strthu[1]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[1])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[2] = (AutoResizeTextView)getView().findViewById(R.id.thu2);
        thu[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[2].equals("") || Strthu[2]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[2])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[3] = (AutoResizeTextView)getView().findViewById(R.id.thu3);
        thu[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[3].equals("") || Strthu[3]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[3])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[4] = (AutoResizeTextView)getView().findViewById(R.id.thu4);
        thu[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[4].equals("") || Strthu[4]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[4])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[5] = (AutoResizeTextView)getView().findViewById(R.id.thu5);
        thu[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[5].equals("") || Strthu[5]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[5])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[6] = (AutoResizeTextView)getView().findViewById(R.id.thu6);
        thu[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[6].equals("") || Strthu[6]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[6])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[7] = (AutoResizeTextView)getView().findViewById(R.id.thu7);
        thu[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[7].equals("") || Strthu[7]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[7])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[8] = (AutoResizeTextView)getView().findViewById(R.id.thu8);
        thu[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[8].equals("") || Strthu[8]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[8])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[9] = (AutoResizeTextView)getView().findViewById(R.id.thu9);
        thu[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[9].equals("") || Strthu[9]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[9])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[10] = (AutoResizeTextView)getView().findViewById(R.id.thu10);
        thu[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[10].equals("") || Strthu[10]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[10])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[11] = (AutoResizeTextView)getView().findViewById(R.id.thu11);
        thu[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[11].equals("") || Strthu[11]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[11])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        thu[12] = (AutoResizeTextView)getView().findViewById(R.id.thu12);
        thu[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strthu[12].equals("") || Strthu[12]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strthu[12])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        fri[0] = (AutoResizeTextView)getView().findViewById(R.id.fri0);
        fri[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[0].equals("") || Strfri[0]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[0])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[1] = (AutoResizeTextView)getView().findViewById(R.id.fri1);
        fri[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[1].equals("") || Strfri[1]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[1])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[2] = (AutoResizeTextView)getView().findViewById(R.id.fri2);
        fri[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[2].equals("") || Strfri[2]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[2])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[3] = (AutoResizeTextView)getView().findViewById(R.id.fri3);
        fri[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[3].equals("") || Strfri[3]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[3])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[4] = (AutoResizeTextView)getView().findViewById(R.id.fri4);
        fri[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[4].equals("") || Strfri[4]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[4])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[5] = (AutoResizeTextView)getView().findViewById(R.id.fri5);
        fri[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[5].equals("") || Strfri[5]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[5])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[6] = (AutoResizeTextView)getView().findViewById(R.id.fri6);
        fri[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[6].equals("") || Strfri[6]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[6])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[7] = (AutoResizeTextView)getView().findViewById(R.id.fri7);
        fri[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[7].equals("") || Strfri[7]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[7])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[8] = (AutoResizeTextView)getView().findViewById(R.id.fri8);
        fri[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[8].equals("") || Strfri[8]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[8])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[9] = (AutoResizeTextView)getView().findViewById(R.id.fri9);
        fri[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[9].equals("") || Strfri[9]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[9])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[10] = (AutoResizeTextView)getView().findViewById(R.id.fri10);
        fri[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[10].equals("") || Strfri[10]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[10])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[11] = (AutoResizeTextView)getView().findViewById(R.id.fri11);
        fri[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[11].equals("") || Strfri[11]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[11])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        fri[12] = (AutoResizeTextView)getView().findViewById(R.id.fri12);
        fri[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strfri[12].equals("") || Strfri[12]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strfri[12])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        sat[0] = (AutoResizeTextView)getView().findViewById(R.id.sat0);
        sat[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[0].equals("") || Strsat[0]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[0])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[1] = (AutoResizeTextView)getView().findViewById(R.id.sat1);
        sat[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[1].equals("") || Strsat[1]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[1])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[2] = (AutoResizeTextView)getView().findViewById(R.id.sat2);
        sat[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[2].equals("") || Strsat[2]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[2])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[3] = (AutoResizeTextView)getView().findViewById(R.id.sat3);
        sat[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[3].equals("") || Strsat[3]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[3])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[4] = (AutoResizeTextView)getView().findViewById(R.id.sat4);
        sat[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[4].equals("") || Strsat[4]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[4])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[5] = (AutoResizeTextView)getView().findViewById(R.id.sat5);
        sat[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[5].equals("") || Strsat[5]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[5])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[6] = (AutoResizeTextView)getView().findViewById(R.id.sat6);
        sat[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[6].equals("") || Strsat[6]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[6])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[7] = (AutoResizeTextView)getView().findViewById(R.id.sat7);
        sat[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[7].equals("") || Strsat[7]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[7])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[8] = (AutoResizeTextView)getView().findViewById(R.id.sat8);
        sat[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[8].equals("") || Strsat[8]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[8])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[9] = (AutoResizeTextView)getView().findViewById(R.id.sat9);
        sat[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[9].equals("") || Strsat[9]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[9])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[10] = (AutoResizeTextView)getView().findViewById(R.id.sat10);
        sat[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[10].equals("") || Strsat[10]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[10])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[11] = (AutoResizeTextView)getView().findViewById(R.id.sat11);
        sat[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[11].equals("") || Strsat[11]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[11])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sat[12] = (AutoResizeTextView)getView().findViewById(R.id.sat12);
        sat[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsat[12].equals("") || Strsat[12]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsat[12])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        sun[0] = (AutoResizeTextView)getView().findViewById(R.id.sun0);
        sun[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[0].equals("") || Strsun[0]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[0])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[1] = (AutoResizeTextView)getView().findViewById(R.id.sun1);
        sun[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[1].equals("") || Strsun[1]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[1])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[2] = (AutoResizeTextView)getView().findViewById(R.id.sun2);
        sun[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[2].equals("") || Strsun[2]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[2])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[3] = (AutoResizeTextView)getView().findViewById(R.id.sun3);
        sun[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[3].equals("") || Strsun[3]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[3])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[4] = (AutoResizeTextView)getView().findViewById(R.id.sun4);
        sun[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[4].equals("") || Strsun[4]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[4])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[5] = (AutoResizeTextView)getView().findViewById(R.id.sun5);
        sun[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[5].equals("") || Strsun[5]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[5])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[6] = (AutoResizeTextView)getView().findViewById(R.id.sun6);
        sun[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[6].equals("") || Strsun[6]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[6])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[7] = (AutoResizeTextView)getView().findViewById(R.id.sun7);
        sun[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[7].equals("") || Strsun[7]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[7])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[8] = (AutoResizeTextView)getView().findViewById(R.id.sun8);
        sun[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[8].equals("") || Strsun[8]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[8])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[9] = (AutoResizeTextView)getView().findViewById(R.id.sun9);
        sun[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[9].equals("") || Strsun[9]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[0])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[10] = (AutoResizeTextView)getView().findViewById(R.id.sun10);
        sun[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[10].equals("") || Strsun[10]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[10])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[11] = (AutoResizeTextView)getView().findViewById(R.id.sun11);
        sun[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[11].equals("") || Strsun[11]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[11])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        sun[12] = (AutoResizeTextView)getView().findViewById(R.id.sun12);
        sun[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Strsun[12].equals("") || Strsun[12]!=""){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("강의 정보 알림")
                            .setMessage(Strsun[12])
                            .setCancelable(false)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("삭제", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        schedule.setting(mon,tue,wen,thu,fri,sat,sun,getContext());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View)inflater.inflate(R.layout.schedule,container,false);

        ImageButton add_btn = (ImageButton)view.findViewById(R.id.add_btn);
        add_btn.setOnClickListener(new View.OnClickListener() {
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
