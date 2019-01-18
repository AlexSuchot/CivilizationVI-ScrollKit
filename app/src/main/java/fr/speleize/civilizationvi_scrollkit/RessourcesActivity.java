package fr.speleize.civilizationvi_scrollkit;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import java.util.List;

import fr.speleize.civilizationvi_scrollkit.classes.Ressource;
import fr.speleize.civilizationvi_scrollkit.database.DatabaseHelper;
import fr.speleize.civilizationvi_scrollkit.database.ressources.RessourceDAO;

public class RessourcesActivity extends AppCompatActivity implements RecyclerView.OnItemTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ressources);

        // création de la base de données, si inexistante :
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        databaseHelper.getReadableDatabase();

        // accès à la base de données :
        RessourceDAO ressource = new RessourceDAO();
        //List<Ressource> ressources = ressource.getListeMemos(this);
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
