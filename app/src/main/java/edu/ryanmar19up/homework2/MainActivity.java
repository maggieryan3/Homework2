package edu.ryanmar19up.homework2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.widget.CursorAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.R.id.progress;

public class MainActivity extends AppCompatActivity {

    Drawing selectedElement;
    TextView currentElement;
    SeekBar redSeekbar;
    SeekBar greenSeekbar;
    SeekBar blueSeekbar;
    TextView redTV;
    TextView greenTV;
    TextView blueTV;
    Drawing bigStar;
    Drawing mediumStar;
    Drawing smallStar;
    Drawing bigX;
    Drawing mediumX;
    Drawing smallX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //widgets
        currentElement = (TextView)(findViewById(R.id.curElem));
        redSeekbar = (SeekBar)(findViewById(R.id.redSB));
        greenSeekbar = (SeekBar)(findViewById(R.id.greenSB));
        blueSeekbar = (SeekBar)(findViewById(R.id.blueSB));
        redTV = (TextView)(findViewById(R.id.redTV));
        greenTV = (TextView)(findViewById(R.id.greenTV));
        blueTV = (TextView)(findViewById(R.id.blueTV));
        bigStar = (Drawing) (findViewById(R.id.bigStar));
        mediumStar = (Drawing)(findViewById(R.id.mediumStar));
        smallStar = (Drawing)(findViewById(R.id.smallStar));
        bigX = (Drawing)(findViewById(R.id.bigX));
        mediumX = (Drawing)(findViewById(R.id.mediumX));
        smallX = (Drawing)(findViewById(R.id.smallX));

        //listeners
        redSeekbar.setOnSeekBarChangeListener(new SeekbarListener());
        greenSeekbar.setOnSeekBarChangeListener(new SeekbarListener());
        blueSeekbar.setOnSeekBarChangeListener(new SeekbarListener());
        bigStar.setOnClickListener(new TouchListener());
        mediumStar.setOnClickListener(new TouchListener());
        smallStar.setOnClickListener(new TouchListener());
        bigX.setOnClickListener(new TouchListener());
        mediumX.setOnClickListener(new TouchListener());
        smallX.setOnClickListener(new TouchListener());

        //set initial colors
        bigStar.red = 255;
        bigStar.blue = 255;
        bigStar.green = 255;
        mediumStar.red = 255;
        mediumStar.blue = 255;
        mediumStar.green = 255;
        smallStar.red = 255;
        smallStar.blue = 255;
        smallStar.green = 255;
        bigX.red = 0;
        bigX.blue = 0;
        bigX.green = 0;
        mediumX.red = 0;
        mediumX.blue = 0;
        mediumX.green = 0;
        smallX.red = 0;
        smallX.blue = 0;
        smallX.green = 0;
    }

    public class SeekbarListener implements SeekBar.OnSeekBarChangeListener {

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int chosen = seekBar.getId();
            //red
            if(chosen == R.id.redSB)
            {
                redTV.setText("Red: " + progress);
                selectedElement.setBackgroundTintList(ColorStateList.valueOf(Color.rgb(progress,selectedElement.blue, selectedElement.green)));
                //selectedElement.setBackgroundColor(Color.rgb(progress,selectedElement.blue, selectedElement.green));
                selectedElement.invalidate();
            }
            //green
            else if(chosen == R.id.greenSB)
            {
                greenTV.setText("Green: " + progress);
                selectedElement.setBackgroundTintList(ColorStateList.valueOf(Color.rgb(selectedElement.red, selectedElement.blue, progress)));
                //selectedElement.setBackgroundColor(Color.rgb(selectedElement.red, selectedElement.blue, progress));
                selectedElement.invalidate();
            }
            //blue
            else if(chosen == R.id.blueSB)
            {
                blueTV.setText("Blue: " + progress);
                selectedElement.setBackgroundTintList(ColorStateList.valueOf(Color.rgb(selectedElement.red, progress, selectedElement.green)));
                //selectedElement.setBackgroundColor(Color.rgb(selectedElement.red, progress, selectedElement.green));
                selectedElement.invalidate();
            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            int chosen = seekBar.getId();
            if(chosen == R.id.redSB)
            {
                selectedElement.red = seekBar.getProgress();
            }
            //green
            else if(chosen == R.id.greenSB)
            {
                selectedElement.green = seekBar.getProgress();
            }
            //blue
            else if(chosen == R.id.blueSB)
            {
                selectedElement.blue = seekBar.getProgress();
            }
        }
    }

    public class TouchListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            if(v.getId() == R.id.bigStar)
            {
                selectedElement = bigStar;
                currentElement.setText("Current Element: Big Star");
                redSeekbar.setProgress(selectedElement.red);
                greenSeekbar.setProgress(selectedElement.green);
                blueSeekbar.setProgress(selectedElement.blue);
            }
            else if(v.getId() == R.id.mediumStar)
            {
                selectedElement = mediumStar;
                currentElement.setText("Current Element: Medium Star");
                redSeekbar.setProgress(selectedElement.red);
                greenSeekbar.setProgress(selectedElement.green);
                blueSeekbar.setProgress(selectedElement.blue);
            }
            else if(v.getId() == R.id.smallStar)
            {
                selectedElement = smallStar;
                currentElement.setText("Current Element: Small Star");
                redSeekbar.setProgress(selectedElement.red);
                greenSeekbar.setProgress(selectedElement.green);
                blueSeekbar.setProgress(selectedElement.blue);
            }
            else if(v.getId() == R.id.bigX)
            {
                selectedElement = bigX;
                currentElement.setText("Current Element: Big X");
                redSeekbar.setProgress(selectedElement.red);
                greenSeekbar.setProgress(selectedElement.green);
                blueSeekbar.setProgress(selectedElement.blue);
            }
            else if(v.getId() == R.id.mediumX)
            {
                selectedElement = mediumX;
                currentElement.setText("Current Element: Medium X");
                redSeekbar.setProgress(selectedElement.red);
                greenSeekbar.setProgress(selectedElement.green);
                blueSeekbar.setProgress(selectedElement.blue);
            }
            else if(v.getId() == R.id.smallX)
            {
                selectedElement = smallX;
                currentElement.setText("Current Element: Small X");
                redSeekbar.setProgress(selectedElement.red);
                greenSeekbar.setProgress(selectedElement.green);
                blueSeekbar.setProgress(selectedElement.blue);
            }

        }
    }
}
