package fr.speleize.civilizationvi_scrollkit.database.ressources;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import fr.speleize.civilizationvi_scrollkit.R;
import fr.speleize.civilizationvi_scrollkit.classes.Ressource;

public class SelectedRessourceActivity extends AppCompatActivity {
    private Ressource ressource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_ressource);

        SharedPreferences getRessource = getSharedPreferences("prefRessource", Context.MODE_PRIVATE);
        String json = getRessource.getString("ressource", "");
        Gson gson = new Gson();
        ressource = gson.fromJson(json, Ressource.class);

    }
}
