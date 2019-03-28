package fr.speleize.civilizationvi_scrollkit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;

import java.util.List;

import fr.speleize.civilizationvi_scrollkit.classes.Ressource;
import fr.speleize.civilizationvi_scrollkit.database.ressources.DatabaseHelper;
import fr.speleize.civilizationvi_scrollkit.database.ressources.RessourceDAO;
import fr.speleize.civilizationvi_scrollkit.database.ressources.RessourcesAdapter;
import fr.speleize.civilizationvi_scrollkit.database.ressources.SelectedRessourceActivity;

public class RessourcesActivity extends AppCompatActivity {

    // Vues :
    private RecyclerView recyclerView = null;

    // Adapter :
    private RessourcesAdapter ressourcesAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ressources);

        // création de la base de données, si inexistante :
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        databaseHelper.getReadableDatabase();

        // accès à la base de données :
        RessourceDAO ressourceDAO = new RessourceDAO();
        List<Ressource> listRessourcesDTO = ressourceDAO.getListRessources(this);

        // vues :
        recyclerView = findViewById(R.id.list_ressources);
        recyclerView.setHasFixedSize(true);


        // layoutmanager :
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // adapter :
        ressourcesAdapter = new RessourcesAdapter(listRessourcesDTO, this);

        recyclerView.setAdapter(ressourcesAdapter);
        Log.e("imageView state :", listRessourcesDTO.get(0).getImage());
    }

    public void onClickItem(int position) {
        Ressource ressource = ressourcesAdapter.getItemParPosition(position);
        SharedPreferences getRessource;
        getRessource = getSharedPreferences("prefRessource", Context.MODE_PRIVATE);
        SharedPreferences.Editor editorRessource = getRessource.edit();
        Gson gson = new Gson();
        String json = gson.toJson(ressource);
        editorRessource.putString("ressource", json);
        editorRessource.apply();

        Intent intent = new Intent(this, SelectedRessourceActivity.class);
        startActivity(intent);
    }
}
