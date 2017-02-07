package com.example.mayabello.bello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by mayabello on 2/1/17.
 */

public class FaceDetectionActivity extends Activity {

    Animation fadeIn;
    Animation fadeOut;
    TextView myText2;
    private FaceOverlayView mmFaceOverlayView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        setContentView(R.layout.activity_facedetection);
        button = (Button) findViewById(R.id.facedetection_back);

        /************* used for animation of text ************************************************/
        myText2 = (TextView) findViewById(R.id.myText2);
        fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        myText2.startAnimation(fadeIn);

        myText2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                myText2.setVisibility(View.VISIBLE);
                myText2.startAnimation(fadeOut);
                myText2.setVisibility(View.INVISIBLE);
            }
        });

        /**********************go to the previous activity page ***********************************/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(FaceDetectionActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });
    }
}




        /************ used for face detection ****************************************************/
        // mmFaceOverlayView = (FaceOverlayView) findViewById( R.id.face_overlay );

        // InputStream stream = getResources().openRawResource( R.raw.imagemaya );
        // Bitmap bitmap = BitmapFactory.decodeStream(stream);

       // mmFaceOverlayView.setBitmap(bitmap);

