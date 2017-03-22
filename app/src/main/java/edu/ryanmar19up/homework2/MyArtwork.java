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
        //CustomElement circle = new CustomCircle("Circle", 0xFFFFFFFF, 10, 10, 5);
        //CustomElement square = new CustomRect("Square", 0xFFFFFFFF, 50,50,100,100);
        Paint magentaPaint = new Paint();
        magentaPaint.setColor(Color.MAGENTA);
        magentaPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(10, 10, 5, magentaPaint);

    }//onDraw

}//class MyArtwork
