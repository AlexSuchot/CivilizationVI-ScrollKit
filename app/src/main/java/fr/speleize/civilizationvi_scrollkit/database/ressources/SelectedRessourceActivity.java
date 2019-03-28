package fr.speleize.civilizationvi_scrollkit.database.ressources;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import fr.speleize.civilizationvi_scrollkit.R;
import fr.speleize.civilizationvi_scrollkit.classes.Ressource;

public class SelectedRessourceActivity extends AppCompatActivity {
    private Ressource ressource;
    private TextView name;
    private TextView description;
    private TextView bonus;
    private TextView typeOfRessource;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_ressource);
        Intent intent = getIntent();
        name = findViewById(R.id.name);
        description = findViewById(R.id.description);
        bonus = findViewById(R.id.bonus);
        typeOfRessource = findViewById(R.id.typeOfRessource);
        image = findViewById(R.id.image);

        name.setText(intent.getStringExtra("name"));
        description.setText(intent.getStringExtra("description"));
        bonus.setText(intent.getStringExtra("bonus"));
        typeOfRessource.setText(intent.getStringExtra("typeOfRessource"));
        Picasso.with(this)
                .load(intent.getStringExtra("image"))
                .into(image);

    }
}
