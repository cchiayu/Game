package com.tom.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {

    private Object Paint;
    private float posX,posY = 400;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas ) {//畫布
        super.onDraw(canvas);
        Paint  paint= new Paint();//畫筆
        canvas.drawLine(400,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.wolf);
        canvas.drawBitmap(bitmap,posX,posY,paint);
    }

  public void setPosX(float posX) {
        if(posX>0 && posX< getWidth()-105){
            this.posX = posX;
        }
    }

    public void setPosY(float posY) {
        if(posY>0 && posY< getHeight()-105){
        this.posY = posY;
        }
    }

    public void moveRight(){
        if(posX<getWidth()-105&&posX>=0){
            posX =posX + 160;
            invalidate();
        }
    }

    public void moveLeft(){
        if(posX<getWidth()-105){
            posX =posX - 160;
            invalidate();
        }
    }

    public void moveUp(){
        if(posY >=0&&posY<getHeight()-105){
            posY =posY - 50;
            invalidate();
        }
    }
    public void moveDown(){
        if(posY >=0&&posY<getHeight()-105){
            posY =posY + 100;
            invalidate();
        }
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

}
