package com.example.mayabello.bello;

import android.app.Activity;
import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by mayabello on 2/4/17.
 */

public class VoiceActivity extends Activity{

        TextToSpeech t1;
        TextToSpeech t2;
        TextToSpeech t3;
        TextToSpeech t4;
        TextToSpeech t5;
        TextToSpeech t6;
        TextToSpeech t7;
        TextToSpeech t8;
        TextToSpeech t9;
        Button b1;
        Button b2;
        Button b3;
        Button b4;
        Button b5;
        Button b6;
        Button b7;
        Button b8;
        Button b9;
        Button voice_next;
        TextView myText1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_voice);
            b1=(Button)findViewById(R.id.button);
            b2 = (Button)findViewById(R.id.button2);
            b3 = (Button) findViewById(R.id.button3);
            b4 = (Button) findViewById(R.id.button4);
            b5 = (Button) findViewById(R.id.button5);
            // b6 = (Button) findViewById(R.id.button6);
            // b7 = (Button) findViewById(R.id.button7);
            // b8 = (Button) findViewById(R.id.button8);
            voice_next = (Button) findViewById(R.id.voice_next);
            Animation fadeIn;
            fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
            myText1.startAnimation(fadeIn);

            /* button 1*********************************** */
            t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t1.setLanguage(Locale.GERMAN);
                    }
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = "La, la, la, do you like my voice?";
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                    b1.getBackground().setColorFilter(new LightingColorFilter(0xff000000, 0xff000000));
                }
            });

            /* button 2 *************************************/
            t2=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t2.setLanguage(Locale.FRENCH);
                    }
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = "La, la, la, do you like my voice?";
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t2.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                    b2.getBackground().setColorFilter(new LightingColorFilter(0xff000000, 0xff000000));
                }
            });

            /* button 3 *************************************/
            t3=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t3.setLanguage(Locale.CHINA);
                    }
                }
            });

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = "La, la, la, do you like my voice?";
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t3.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                    b3.getBackground().setColorFilter(new LightingColorFilter(0xff000000, 0xff000000));
                }
            });

            /************ button 4 *********************************/
            t4=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t4.setLanguage(Locale.GERMAN);
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = "La, la, la, do you like my voice?";
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t4.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                    b4.getBackground().setColorFilter(new LightingColorFilter(0xff000000, 0xff000000));
                }
            });


            /*********** b5 **********/
            t5=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t5.setLanguage(Locale.ITALIAN);
                    }
                }
            });

            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = "La, la, la, do you like my voice?";
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t5.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                    b5.getBackground().setColorFilter(new LightingColorFilter(0xff000000, 0xff000000));
                }
            });

            /*********** b6 **********/
            /*
            t6=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t6.setLanguage(Locale.JAPANESE);
                    }
                }
            });

            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = "La, la, la, do you like my voice?";
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t6.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            });
*/

            /*********** b7 **********/
            /*
            t7=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t7.setLanguage(Locale.FRENCH);
                    }
                }
            });

            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = "La, la, la, do you like my voice?";
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t7.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            });
*/
            /*********** b8 **********/
            /*
            t8=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t8.setLanguage(Locale.KOREAN);
                    }
                }
            });

            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = "La, la, la, do you like my voice?";
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t8.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            });
*/
            // locate button
            voice_next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    Intent intent = new Intent(VoiceActivity.this, CameraActivity.class);
                    startActivity(intent);
                }
            });
        }

        public void onPause(){
            if(t1 !=null){
                t1.stop();
                t1.shutdown();
            }
            super.onPause();
        }
    }

