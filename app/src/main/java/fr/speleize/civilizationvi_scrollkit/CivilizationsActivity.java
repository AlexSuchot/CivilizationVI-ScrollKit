package fr.speleize.civilizationvi_scrollkit;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import fr.speleize.civilizationvi_scrollkit.classes.Ressource;

public class CivilizationsActivity extends AppCompatActivity {
    private DatabaseManager databaseManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilizations);

        databaseManager = new DatabaseManager(this);
        //databaseManager.insertCivilization();
        //databaseManager.insertRessources("Pierre", "Minérale", "allemagneLogo", "+2 de productions", "Bonus");
        ImageView imageView = findViewById(R.id.logo);
        TextView textView = findViewById(R.id.name);
        String variableValue = "allemagneLogo";

        imageView.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));
        textView.setText("Itération numéro : ");

    }
}
