package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by student2 on 27.11.17.
 */

public class Circle implements Drawable,Touchable{
    float x,y,r = 20;
    Paint paint = new Paint();


    public Circle(float x, float y) {
        this.x = x;
        this.y = y;

    }

    public void draw(Canvas canvas){
        paint.setColor(Color.rgb(255,255,0));
        canvas.drawCircle(x,y,r,paint);

    }
    @Override
    public void onTouch(MotionEvent event) {
        if (r<500){
        r+=20;}
    }

}
