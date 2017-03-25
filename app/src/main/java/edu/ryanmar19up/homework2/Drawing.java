package edu.ryanmar19up.homework2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/**
 * @author Maggie Ryan
 * @date 03/25/2017
 */

public class Drawing extends ImageButton {
    public Drawing(Context context) {
        super(context);
    }

    Drawing(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    Drawing(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
    }

    Drawing(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes){
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    int red;
    int green;
    int blue;
}
