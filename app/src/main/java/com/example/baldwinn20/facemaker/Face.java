
//@author: Nicholas Baldwin

package com.example.baldwinn20.FaceMaker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.Random;

//Face class creates the aspects of a face and determines the color of the skin, eyes, and hair
public class Face extends SurfaceView {

    int skinColor;
    int eyeColor;
    int hairColor;
    int hairStyle;
    Random rando = new Random();
    Paint eyePaint = new Paint();
    Paint headPaint = new Paint();

    public Face(Context context) {
        super(context);
    }

    public Face(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
    }

    public Face(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    //assigns different random values to each color.
    public void randomize(int redRand, int greenRand, int blueRand) {

        redRand = rando.nextInt(255);
        blueRand = rando.nextInt(255);
        greenRand = rando.nextInt(255);

    }

    public void drawHead(Canvas canvas) {
        headPaint.setARGB(255, 1, 1, 1);
        canvas.drawCircle(100, 300, 200, headPaint);
        invalidate();
    }

    public void drawEyes(Canvas canvas) {
        eyePaint.setARGB(255, 1, 1, 1);
        canvas.drawCircle(50, 150, 25, eyePaint);
        canvas.drawCircle(150, 150, 25, eyePaint);
        invalidate();
    }

    public void drawHair(Canvas canvas) {
//draw 3 different hairstyles with a switch statement
        invalidate();
    }

    public void onDraw(Canvas canvas) {
//call draw methods
        invalidate();
    }

}
