package com.example.david.angelsolve;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vidyo.VidyoClient.Connector.VidyoConnector;
import com.vidyo.VidyoClient.Connector.Connector;

import com.github.pwittchen.swipe.library.Swipe;
import com.github.pwittchen.swipe.library.SwipeListener;

import cn.pedant.SweetAlert.SweetAlertDialog;

import static com.example.david.angelsolve.R.id.info;

public class Video extends AppCompatActivity implements VidyoConnector.IConnect {

    private VidyoConnector vc;
    private FrameLayout videoFrame;

    SweetAlertDialog pDialog;
    SweetAlertDialog sDialog;
    //SweetAlertDialog cDialog;
    Intent intent;
    //private Swipe swipe;
    //int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Connector.SetApplicationUIContext(this);
        Connector.Initialize();
        videoFrame = (FrameLayout)findViewById(R.id.videoFrame);

        /*swipe = new Swipe();
        swipe.setListener(new SwipeListener() {
                              @Override
                              public void onSwipingLeft(final MotionEvent event) {
                                  if (i % 20 == 0) {
                                      changeAngel();
                                  }
                                  i++;
                                  return;
                              }

                              @Override
                              public void onSwipedLeft(final MotionEvent event) {
                              }

                              @Override
                              public void onSwipingRight(final MotionEvent event) {
                                  if (i % 20  == 0) {
                                      changeAngel();

                                  i++;
                                  return;
                              }

                              @Override
                              public void onSwipedRight(final MotionEvent event) {
                              }

                              @Override
                              public void onSwipingUp(final MotionEvent event) {
                              }

                              @Override
                              public void onSwipedUp(final MotionEvent event) {
                              }

                              @Override
                              public void onSwipingDown(final MotionEvent event) {
                              }

                              @Override
                              public void onSwipedDown(final MotionEvent event) {
                              }
                          });*/

        pDialog = new SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Matching your Student...");
        pDialog.setCancelable(false);
        pDialog.show();
        sDialog = new SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE);
        sDialog.setCustomImage(R.drawable.studentpic);
        sDialog.setTitleText("You are connected to Royce");
        sDialog.setContentText("Average Rating: 4.9/5.0 \n Asked Questions: 9001 \n from California, USA");
        sDialog.setConfirmText("Dandy!");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                pDialog.dismiss();
                sDialog.show();
            }
        }, 3000);
    }

    public void Start(View v) {
        vc = new VidyoConnector(videoFrame, VidyoConnector.VidyoConnectorViewStyle.VIDYO_CONNECTORVIEWSTYLE_Default, 16, "", "", 0);
        vc.ShowViewAt(videoFrame, 0, 0, videoFrame.getWidth(), videoFrame.getHeight());
        String token = "cHJvdmlzaW9uAEFuZ2VsQDE3YzJlMS52aWR5by5pbwA2MzY2OTY1MzAzMgAAMTZkZTI1MzBkZGI2MWYwMGZhZWMyYmI1ZjVjN2I4NmQxOTA1ZDQ4NTJiNmI4OGJkZjA0Y2RhMTA4MWQyNDM0MzM2ZmIyZGI1ZWI4MTk1ZDEzOTI1ZWUzNGM4NWY3Mzg4";
        vc.Connect("prod.vidyo.io", token, "David", "DemoRoom", this);
    }

    public void Disconnect(View v) {
        vc.Disconnect();
        Intent intent = new Intent (this, Reviews.class);
        startActivity(intent);
    }

    public void OnSuccess() {

    }

    public void OnFailure(VidyoConnector.VidyoConnectorFailReason vidyoConnectorFailReason) {

    }

    public void OnDisconnected(VidyoConnector.VidyoConnectorDisconnectReason vidyoConnectorDisconnectReason) {

    }



    /*@Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }*/

    /*private void changeAngel() {
        cDialog = new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE);
        cDialog.setTitleText("Are you sure?");
        cDialog.setContentText("You will be disconnected from David.");
        cDialog.setCancelText("Cancel");
        cDialog.setConfirmText("Proceed");
        cDialog.showCancelButton(true);
        cDialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog rDialog) {
                rDialog.cancel();
            }
        });
        cDialog.show();
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menumain, menu);
        return true;
    }
}
