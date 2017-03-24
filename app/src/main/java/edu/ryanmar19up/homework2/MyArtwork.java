package edu.ryanmar19up.homework2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Created by maggi on 3/18/2017.
 */

public class MyArtwork extends SurfaceView {

    public MyArtwork(Context context){
        super(context);
        setWillNotDraw(false);
    }
    public MyArtwork(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
    }
    public MyArtwork(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
        setWillNotDraw(false);
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        CustomElement circle = new CustomCircle("Circle", 0xFFFF0000, 200, 200, 100);
        circle.drawMe(canvas);

        CustomElement square = new CustomRect("Square", 0xFFFFFFFF, 100, 400, 300, 600);
        square.drawMe(canvas);


    }//onDraw

}//class MyArtwork
