package amaury.android.sudoku;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int Grille[][]= new int[8][8];
        String chaine_sudoku = "008203500009670408346050702430010059967005001000496203280034067703500904004107020";
        int compteur=0;
        for (int i = 0;i <=8;i++){
            for (int j = 0;i <=8;i++){
                Grille[i][j] = Integer.parseInt(chaine_sudoku.substring(compteur));
                compteur++;
            }
        }


    }
}
