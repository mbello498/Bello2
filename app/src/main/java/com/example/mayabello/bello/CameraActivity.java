package com.example.mayabello.bello;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.media.FaceDetector;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class CameraActivity extends Activity {


    Animation fadeIn;
    Animation fadeOut;
    TextView myText1;
    Button activity_camera1;
    ImageView camera_imageView;
    /*******************************
     * vars for camera
     **********************************************/
    public static final String TAG = CameraActivity.class.getSimpleName();

    private Camera mCamera;

    // We need the phone orientation to correctly draw the overlay:
    private int mOrientation;
    private int mOrientationCompensation;
    private OrientationEventListener mOrientationEventListener;

    // Let's keep track of the display rotation and orientation also:
    private int mDisplayRotation;
    private int mDisplayOrientation;

    // Holds the Face Detection result:
    private FaceDetector.Face[] myFace;

    // The surface view for the camera data
    private SurfaceView mView;

    // Draw rectangles and other fancy stuff:
    private FaceOverlayView mFaceView;

    /**
     * Sets the faces for the overlay view, so it can be updated
     * and the face overlays will be drawn again.
     */
    /*
    private android.hardware.faceDetectionListener = new android.hardware.Camera.FaceDetectionListener() {
        @Override
        public void onFaceDetection(myFace, Camera camera) {
            Log.d("onFaceDetection", "Number of Faces:" + faces.length);
            // Update the view now!
            mFaceView.setFaces(faces);
        }
    }
    */

    /******
     * bucky's video
     *************/

    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView camera_ImageView;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK ) {
            // get the data
            Bundle extras = data.getExtras();
            Bitmap photo = (Bitmap) extras.get("data");
            camera_imageView.setImageBitmap(photo);
        }
    }

    /****
     * end bucky's video
     ***********/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        activity_camera1 = (Button) findViewById(R.id.cameraB);
        // Now create the OverlayView:
        /*
        mFaceView = new FaceOverlayView(this);
        addContentView(mFaceView, new ActionBar.LayoutParams(ActionBarOverlayLayout.LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        // Create and Start the OrientationListener:
        mOrientationEventListener = new SimpleOrientationEventListener(this);
        mOrientationEventListener.enable();
        /************* used for actual camera ****************************************************/

        // does the user have a camera
        if (!hasCamera()) {
            activity_camera1.setEnabled(false);
        }

        /************* used for animation of text ************************************************/
        myText1 = (TextView) findViewById(R.id.myText1);

        fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        myText1.startAnimation(fadeIn);


        myText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                myText1.setVisibility(View.VISIBLE);
                myText1.startAnimation(fadeOut);
                myText1.setVisibility(View.INVISIBLE);
            }
        });

        /**********************go to the next activity page **************************************/

        // locate button
        activity_camera1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                // take a pic and pass reults along to onActivityResult
                startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);

                /*
                Intent intent = new Intent(CameraActivity.this, FaceDetectionActivity.class);
                startActivity(intent);
                */
            }
        });



        /*
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK ) {
                // get the data
                Bundle extras = data.getExtras();
                Bitmap photo = (Bitmap) extras.get("data");
                camera_imageView.setImageBitmap(photo);
            }
        }
        */
    }
    // does the user have a camera, can be any camera at all
    private boolean hasCamera() {
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }

    
}

