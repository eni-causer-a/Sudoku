package amaury.android.sudoku;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by amaury on 15/03/2018.
 */

class Care  {
    Float r,l,t,b;
    public Paint paint;



    public Care(Float l, Float t, Float r, Float b) {
        this.l = l;
        this.r = r;
        this.t = t;
        this.b = b;
        paint = new Paint();
        paint.setColor(Color.rgb((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
    }
    public void draw(Canvas canvas)
    {

        canvas.drawRect(l,t,r,b,paint);

    }



}
class Chifrage  {
    String chaine;
    private Paint paint;



    public Chifrage(String chaine, Paint paint) {
        chaine= this.chaine;
        paint = new Paint();
        paint.setColor(Color.rgb((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
    }
    public void draw(Canvas canvas)
    {

        canvas.drawText(l,t,r,b,paint);

    }



}

public class Dessin extends View {
    Paint paint2= new Paint();
    public Dessin(Context context, AttributeSet attrs) {
        super(context,attrs);

    }
    @Override
    public void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        int margeW = width / 9;
        int margeH = width / 9;
        float l,r,t,b;
        l= 0;r=l+margeW;t=0;b=t+margeH;
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++) {
                new Care(l, t, r , b).draw(canvas);
                l+=margeW;r+=margeW;


            }
            l=0;r=l+margeW;
            b+=margeH;t+=margeH;
        }



    }



  }

