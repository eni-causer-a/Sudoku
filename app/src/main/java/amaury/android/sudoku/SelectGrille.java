package amaury.android.sudoku;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SelectGrille extends Activity implements AdapterView.OnItemClickListener {
    vgrille[] grille;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_grille);
        Intent i = getIntent();
        int lvl = i.getIntExtra(LevelSelect.LEVEL, 0);

        final ListView listView = (ListView) findViewById(R.id.listView);

        vgrille grille1 = new vgrille(1,5,90);
        vgrille grille2 = new vgrille(2,8,89);
        grille = new vgrille[]{grille1,grille2};


        ArrayAdapter <vgrille>adapter = new ArrayAdapter<vgrille>(this, android.R.layout.simple_list_item_1, android.R.id.text1 , grille );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, String.valueOf(grille[i].getlvl()), Toast.LENGTH_LONG);
        toast.show();
    }
}
