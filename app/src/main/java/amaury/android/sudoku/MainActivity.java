package amaury.android.sudoku;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        String chaine_sudoku = "508203500009670408346050702430010059967005001000496203280034067703500904004107020";



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dessin d1 = (Dessin) findViewById(R.id.dessin);
        d1.setchaine(chaine_sudoku);





    }
}
