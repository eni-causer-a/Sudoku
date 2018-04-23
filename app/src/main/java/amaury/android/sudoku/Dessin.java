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

class Care {
    Float r, l, t, b;
    public Paint paint;


    public Care(Float l, Float t, Float r, Float b) {
        this.l = l;
        this.r = r;
        this.t = t;
        this.b = b;
        paint = new Paint();
        paint.setColor(Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
    }

    public void draw(Canvas canvas) {

        canvas.drawRect(l, t, r, b, paint);

    }
}

    class Text  {
        Float x,y;
        String txt;
        public Paint paint2;

 




        public Text(String txt, Float x, Float y) {

            this.txt = txt;
            this.x = x;
            this.y = y;
            paint2 = new Paint();
            paint2.setTextSize(100);

        }


        public void draw(Canvas canvas)
        {

            canvas.drawText(txt,x,y,paint2);

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

        for (int k= 0;k<chaine.length();k++) {
           //valeur_case = chaine.substring(0, 1)
            //canvas.drawText(l,t,r,b,paint);
        }
    }



}

public class Dessin extends View {


    String chaine = "";
    public Dessin(Context context, AttributeSet attrs) {
        super(context,attrs);

    }



    @Override
    public void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        String valeur_case;
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
        int k = 0;
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++) {
                new Care(l, t, r , b).draw(canvas);
                if(!chaine.substring(k, k+1).equals("0")) {
                    float valeur_x = l+((l-r)*(1/2));
                    new Text( chaine.substring(k, k + 1),valeur_x , b-((t-b)*(1/2))).draw(canvas);
                }
                l+=margeW;r+=margeW;
                k++;


            }
            l=0;r=l+margeW;
            b+=margeH;t+=margeH;

        }



    }

    public void setchaine(String chaine){
        this.chaine = chaine;
    }



}

