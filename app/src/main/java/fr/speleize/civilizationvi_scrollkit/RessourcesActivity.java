package fr.speleize.civilizationvi_scrollkit;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import fr.speleize.civilizationvi_scrollkit.classes.Ressource;
import fr.speleize.civilizationvi_scrollkit.database.DatabaseHelper;
import fr.speleize.civilizationvi_scrollkit.database.ressources.RessourceDAO;
import fr.speleize.civilizationvi_scrollkit.database.ressources.RessourcesAdapter;

public class RessourcesActivity extends AppCompatActivity implements RecyclerView.OnItemTouchListener{

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
        //
        List<Ressource> listRessourcesDTO = ressourceDAO.getListRessources(this);

        // vues :

        recyclerView = findViewById(R.id.list_ressources);

        // à ajouter pour de meilleures performances :
        recyclerView.setHasFixedSize(true);

        // layout manager, décrivant comment les items sont disposés :
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // adapter :
        ressourcesAdapter = new RessourcesAdapter(listRessourcesDTO);
        recyclerView.setAdapter(ressourcesAdapter);
    }

    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean b) {

    }
}
