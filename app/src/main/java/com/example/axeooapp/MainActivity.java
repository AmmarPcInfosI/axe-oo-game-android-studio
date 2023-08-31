package com.example.axeooapp;


import android.R.color;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button lfttop, lftcntr, btmlft, btmrt, btmcnr, cntrtop, cntr, rtcntr, rttop;
    int turn_round;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lfttop = (Button) findViewById(R.id.lfttop);
        cntrtop = (Button) findViewById(R.id.cntrtop);
        rttop = (Button) findViewById(R.id.rttop);
        rtcntr = (Button) findViewById(R.id.rtcntr);
        cntr = (Button) findViewById(R.id.cntr);
        lftcntr = (Button) findViewById(R.id.lftcntr);
        btmrt = (Button) findViewById(R.id.btmrt);
        btmcnr = (Button) findViewById(R.id.btmcnr);
        btmlft = (Button) findViewById(R.id.btmlft);

        turn_round = 1;

        lfttop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (lfttop.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        lfttop.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        lfttop.setText("O");
                    }
                }
                endGame();
            }
        });

        cntrtop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (cntrtop.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        cntrtop.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        cntrtop.setText("O");
                    }
                }

                endGame();
            }
        });

        rttop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (rttop.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        rttop.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        rttop.setText("O");
                    }
                }
                endGame();
            }
        });

        lftcntr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (lftcntr.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        lftcntr.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        lftcntr.setText("O");
                    }
                }
                endGame();
            }
        });

        cntr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (cntr.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        cntr.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        cntr.setText("O");
                    }
                }
                endGame();
            }
        });

        rtcntr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (rtcntr.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        rtcntr.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        rtcntr.setText("O");
                    }
                }
                endGame();
            }
        });

        btmlft.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btmlft.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btmlft.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btmlft.setText("O");
                    }
                }
                endGame();
            }
        });

        btmcnr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btmcnr.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btmcnr.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btmcnr.setText("O");
                    }
                }
                endGame();
            }
        });

        btmrt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btmrt.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btmrt.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btmrt.setText("O");
                    }
                }
                endGame();
            }
        });

    }

    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;


        a = lfttop.getText().toString();
        b = cntrtop.getText().toString();
        c = rttop.getText().toString();
        d = lftcntr.getText().toString();
        e = cntr.getText().toString();
        f = rtcntr.getText().toString();
        g = btmlft.getText().toString();
        h = btmcnr.getText().toString();
        i = btmrt.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            lfttop.setBackgroundColor(Color.GRAY);
            cntrtop.setBackgroundColor(Color.GRAY);
            rttop.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            lfttop.setBackgroundColor(Color.GRAY);
            lftcntr.setBackgroundColor(Color.GRAY);
            btmlft.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            lfttop.setBackgroundColor(Color.GRAY);
            cntr.setBackgroundColor(Color.GRAY);
            btmrt.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            cntrtop.setBackgroundColor(Color.GRAY);
            cntr.setBackgroundColor(Color.GRAY);
            btmcnr.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            rttop.setBackgroundColor(Color.GRAY);
            cntr.setBackgroundColor(Color.GRAY);
            btmlft.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            rttop.setBackgroundColor(Color.GRAY);
            rtcntr.setBackgroundColor(Color.GRAY);
            btmrt.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            lftcntr.setBackgroundColor(Color.GRAY);
            cntr.setBackgroundColor(Color.GRAY);
            rtcntr.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            btmlft.setBackgroundColor(Color.GRAY);
            btmcnr.setBackgroundColor(Color.GRAY);
            btmrt.setBackgroundColor(Color.GRAY);
            end = true;
        }


        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            lfttop.setBackgroundColor(Color.GRAY);
            cntr.setBackgroundColor(Color.GRAY);
            btmrt.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            lfttop.setBackgroundColor(Color.GRAY);
            lftcntr.setBackgroundColor(Color.GRAY);
            btmlft.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            lfttop.setBackgroundColor(Color.GRAY);
            cntr.setBackgroundColor(Color.GRAY);
            btmrt.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            cntrtop.setBackgroundColor(Color.GRAY);
            cntr.setBackgroundColor(Color.GRAY);
            btmcnr.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            rttop.setBackgroundColor(Color.GRAY);
            cntr.setBackgroundColor(Color.GRAY);
            btmlft.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            rttop.setBackgroundColor(Color.GRAY);
            rtcntr.setBackgroundColor(Color.GRAY);
            btmrt.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            lftcntr.setBackgroundColor(Color.GRAY);
            cntr.setBackgroundColor(Color.GRAY);
            rtcntr.setBackgroundColor(Color.GRAY);
            end = true;
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            btmlft.setBackgroundColor(Color.GRAY);
            btmcnr.setBackgroundColor(Color.GRAY);
            btmrt.setBackgroundColor(Color.GRAY);
            end = true;
        }

        if (end) {
            lfttop.setEnabled(false);
            cntrtop.setEnabled(false);
            rttop.setEnabled(false);
            lftcntr.setEnabled(false);
            cntr.setEnabled(false);
            rtcntr.setEnabled(false);
            btmlft.setEnabled(false);
            btmcnr.setEnabled(false);
            btmrt.setEnabled(false);
        }
    }



}