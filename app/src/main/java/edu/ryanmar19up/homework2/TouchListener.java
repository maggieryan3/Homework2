package edu.ryanmar19up.homework2;

import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by maggi on 3/24/2017.
 */

public class TouchListener implements View.OnTouchListener {
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        float x = event.getX();
        float y = event.getY();

        //if(circle.containsPoint(x,y))
        {
            //circle.drawHighlight();
        }

        return false;
    }
}
