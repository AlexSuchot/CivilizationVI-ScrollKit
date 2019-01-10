package fr.speleize.civilizationvi_scrollkit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CivilizationsActivity extends AppCompatActivity {
    private DatabaseManager databaseManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilizations);

        databaseManager = new DatabaseManager(this);
        //databaseManager.insertCivilization();
    }
}
