package edu.ryanmar19up.homework2;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    public CustomElement selectedElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyArtwork sv = (MyArtwork) (findViewById(R.id.surfaceView));
        sv.setOnTouchListener(new TouchListener());

        SeekBar redSeekbar = (SeekBar)(findViewById(R.id.redSB));
        SeekBar greenSeekbar = (SeekBar)(findViewById(R.id.greenSB));
        SeekBar blueSeekbar = (SeekBar)(findViewById(R.id.blueSB));
        redSeekbar.setOnSeekBarChangeListener(new SeekbarListener());
        blueSeekbar.setOnSeekBarChangeListener(new SeekbarListener());
        greenSeekbar.setOnSeekBarChangeListener(new SeekbarListener());
    }

}
