package amaury.android.sudoku;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by amaury on 15/03/2018.
 */

class Cercle {
    int xc, yc, rayon;
    private Paint paint;

    public Cercle(int x, int y, int r) {
        xc = x;
        yc = y;
        rayon = r;
        paint = new Paint();
        paint.setColor(Color.rgb((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
    }
    public void draw(Canvas canvas)
    {
        canvas.drawCircle(xc, yc, rayon, paint);
    }
}

public class Dessin extends View {
    public Dessin(Context context, AttributeSet attrs) {
        super(context);
    }
    @Override
    public void onDraw(Canvas canvas) {
        /*
        paint.setColor(Color.BLUE);
        canvas.drawCircle(100, 100, 50, paint);*/
        (new Cercle(100,100,50)).draw(canvas    );
    }

}

