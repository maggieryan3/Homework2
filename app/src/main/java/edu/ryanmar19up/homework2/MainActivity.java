package edu.ryanmar19up.homework2;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SurfaceView sv = (SurfaceView) (findViewById(R.id.surfaceView));
        //MyArtwork art = new MyArtwork(Context, AttributeSet);

    }
}
