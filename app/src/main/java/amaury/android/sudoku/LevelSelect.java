package amaury.android.sudoku;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import java.util.logging.Level;

public class LevelSelect extends Activity implements View.OnClickListener {
    public final static String LEVEL = "sudoku.intent.LEVEL";
    int lvl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
        Button button_lvl1 = (Button) findViewById(R.id.button_lvl1);
        Button button_lvl2 = (Button) findViewById(R.id.button_lvl2);
        button_lvl1.setOnClickListener(this);
        button_lvl1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(LevelSelect.this, SelectGrille.class );
         if(v.getId()== R.id.button_lvl1)
             lvl = 1;
         if(v.getId()== R.id.button_lvl2)
            lvl = 2;
        i.putExtra(LevelSelect.LEVEL, lvl);
        startActivity(i);
    }


}
