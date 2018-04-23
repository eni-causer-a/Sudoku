package amaury.android.sudoku;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

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


        ArrayAdapter <vgrille>adapter = new ArrayAdapter<vgrille>(this, android.R.layout.simple_list_item_1, android.R.id.text1 , grille )
        {@Override
        public View getView (int position, View convertView, ViewGroup parent){
            View view = super.getView( position,  convertView,  parent);
            TextView text1 = view.findViewById(android.R.id.text1);
            text1.setText("Niveau: "+ grille[position].getnum());
            return view;
        }};
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Message avec 3 params
        // 1. Instantiate an AlertDialog.Builder with its constructor
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

// 2. Chain together various setter methods to set the dialog characteristics
        builder.setMessage("Niveau: "+ grille[i].getlvl()+" Numéro: "+ grille[i].getnum()+" Avancement: "+grille[i].getdone())
                .setTitle("Informations niveau")
                .setPositiveButton("Lancer", new DialogInterface.OnClickListener() {
                     public void onClick(DialogInterface dialog, int id) {
                         Intent i = new Intent(SelectGrille.this, MainActivity.class);
                         startActivity(i);
                     }
            });

// 3. Get the AlertDialog from create()
        AlertDialog dialog = builder.create();

        dialog.show();
    }

    public Context getActivity() {
        return SelectGrille.this;
    }
}
