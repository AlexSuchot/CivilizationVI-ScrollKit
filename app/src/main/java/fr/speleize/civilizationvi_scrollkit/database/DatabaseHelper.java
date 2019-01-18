package fr.speleize.civilizationvi_scrollkit.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Constantes :
    private static final String NOM_BASE = "civ.db";
    private static final int VERSION = 1;
    private static final String CREATE_TABLE_RESSOURCES = "CREATE TABLE " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " ("
            + BaseContrat.RessourcesContrat._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + BaseContrat.RessourcesContrat.COLONNE_NAME + " TEXT NOT NULL, "
            + BaseContrat.RessourcesContrat.COLONNE_DESCRIPTION + " TEXT NOT NULL, "
            + BaseContrat.RessourcesContrat.COLONNE_IMAGE + " TEXT NOT NULL, "
            + BaseContrat.RessourcesContrat.COLONNE_BONUS + " TEXT NOT NULL, "
            + BaseContrat.RessourcesContrat.COLONNE_TYPEOFRESSOURCE + " TEXT NOT NULL "
            + ")";


    /**
     * Constructeur.
     * @param context Context
     */
    public DatabaseHelper(Context context)
    {
        super(context, NOM_BASE, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_RESSOURCES);
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Pierre', 'minerale', 'allemagneLogo', '+2 de production', 'bonus')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES);
        onCreate(db);

    }
}
