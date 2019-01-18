package fr.speleize.civilizationvi_scrollkit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import fr.speleize.civilizationvi_scrollkit.classes.Ressource;
import fr.speleize.civilizationvi_scrollkit.database.ressources.DatabaseHelper;
import fr.speleize.civilizationvi_scrollkit.database.ressources.RessourceDAO;
import fr.speleize.civilizationvi_scrollkit.database.ressources.RessourcesAdapter;

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
        ressourcesAdapter = new RessourcesAdapter(listRessourcesDTO);
        recyclerView.setAdapter(ressourcesAdapter);
    }

}
