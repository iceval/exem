package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;



public class ControlledRocket extends Rocket {
    float toX,toY;
    public void setTarget(float toX, float toY)
    {
        this.toX = toX;
        this.toY = toY;
        vx=toX-x;
        vy=toY-y;
        float d=(float)Math.sqrt(vx * vx + vy * vy);
        vx*=5/d;
        vy*=5/d;
    }
    ControlledRocket(Bitmap pic) {
        super(pic);
        toX = this.x;
        toY = this.y;
    }

    void move(){

        if ((toX - x)*(toX - x)+(toY - y)+(toY - y) < 10){
            return;
        }
        super.move();
    }
}