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




        /*
        int Grille[][]= new int[8][8];
        int compteur=0;
        for (int i = 0;i <=8;i++){
            for (int j = 0;i <=8;i++){
                Grille[i][j] = Integer.parseInt(chaine_sudoku.substring(compteur));
                compteur++;
            }
        }*/


    }
}
