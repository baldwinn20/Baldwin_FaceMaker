import android.support.v7.app.AppCompatActivity;

//@author: Nicholas Baldwin

package com.example.baldwinn20.FaceMaker;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.SeekBar;

import com.example.baldwinn20.facemaker.R;

//MainActivity implements methods to make the user interface work
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Face fv = findViewById(R.id.faceView);
        SeekBar RedBar = (SeekBar) findViewById(R.id.RedBar);
        SeekBar GreenBar = (SeekBar) findViewById(R.id.GreenBar);
        SeekBar BlueBar = (SeekBar) findViewById(R.id.BlueBar);
        RadioButton EyeButton = (RadioButton) findViewById(R.id.EyesButton);
        RadioButton SkinButton = (RadioButton) findViewById(R.id.SkinButton);
        RadioButton HairButton = (RadioButton) findViewById(R.id.HairButton);
        RadioButton RandomFaceButton = (RadioButton) findViewById(R.id.RandomFaceButton);
    }


    public void SeekBarHandler(SeekBar RedBar, SeekBar GreenBar, SeekBar BlueBar) {
//connect seekbars to color value variables
    }

    public void ButtonHandler(RadioButton EyeButton, RadioButton SkinButton, RadioButton HairButton, RadioButton RandomFaceButton) {
//connect buttons to button listeners
    }

    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        int redVal;
        int blueVal;
        int greenVal;

        if (seekBar.getId() == R.id.RedBar) {
            redVal = progress;
        } else if (seekBar.getId() == R.id.GreenBar) {
            greenVal = progress;

        } else if (seekBar.getId() == R.id.BlueBar) {
            blueVal = progress;
        }


    }

    public void setSkinColor(int redVal, int greenVal, int blueVal) {
        // Face.skinColor = Color.rgb(redVal,greenVal,blueVal);
    }

    public void onStartTrackingTouch(SeekBar seekbar) {
    }

    public void onStopTrackingTouch(SeekBar seekbar) {
    }
}
