package edu.ryanmar19up.homework2;

import android.view.View;
import android.widget.SeekBar;

/**
 * Created by maggi on 3/24/2017.
 */

public class SeekbarListener implements SeekBar.OnSeekBarChangeListener {

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int chosen = seekBar.getId();
        //red
        if(chosen == R.id.redSB)
        {
            //reference to selected custom element
            //element.setColor(rbg.Color(progress, currentBlue, currentGreen)
        }

        //green
        else if(chosen == R.id.greenSB)
        {

        }

        //blue
        else if(chosen == R.id.blueSB)
        {

        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
