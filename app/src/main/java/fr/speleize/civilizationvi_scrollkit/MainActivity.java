package fr.speleize.civilizationvi_scrollkit;

        import android.content.Intent;
        import android.graphics.Typeface;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;

        import fr.speleize.civilizationvi_scrollkit.classes.Civilization;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Font pour le titre :
        Typeface PermanentMarkerRegular = Typeface.createFromAsset(getAssets(),
                "font/penumbra.ttf");
        TextView textView = findViewById(R.id.title);
        textView.setTypeface(PermanentMarkerRegular);

        DatabaseManager databaseManager = new DatabaseManager(this);

        // INSERT DATA INTO CIVILIZATIONS :


    }


    // BUTTONS :
    public void goToCivilizations(View view){
        Intent intent = new Intent(this, CivilizationsActivity.class);
        startActivity(intent);

    }

    public void goToBuildings(View view){
        Intent intent = new Intent(this, BuildingsActivity.class);
        startActivity(intent);

    }

    public void goToUnits(View view){
        Intent intent = new Intent(this, UnitsActivity.class);
        startActivity(intent);

    }

    public void goToWonders(View view){
        Intent intent = new Intent(this, WondersActivity.class);
        startActivity(intent);

    }

    public void goToLeaders(View view){
        Intent intent = new Intent(this, LeadersActivity.class);
        startActivity(intent);

    }

    public void goToRessources(View view){
        Intent intent = new Intent(this, RessourcesActivity.class);
        startActivity(intent);

    }
}
