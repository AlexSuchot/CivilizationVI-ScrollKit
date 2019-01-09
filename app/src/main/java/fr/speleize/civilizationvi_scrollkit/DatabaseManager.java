package fr.speleize.civilizationvi_scrollkit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "civilization.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // CREATION DE LA TABLE DES CIVILISATIONS :

        String civilizationsSql = "CREATE TABLE civilizations ("
                                + "     id integer PRIMARY KEY AUTOINCREMENT,"
                                + "     name text NOT NULL,"
                                + "     description text NOT NULL,"
                                + "     image text NOT NULL,"
                                + "     leader text NOT NULL,"
                                + "     continent text NOT NULL,"
                                + "     bonus text NOT NULL,"
                                + "     specialUnit text NOT NULL,"
                                + "     specialBuilding text NOT NULL,"
                                + "     victoryType text NOT NULL"
                                + ")";

        // CREATION DE LA TABLE DES UNITES :

        String unitsSql = "CREATE TABLE units ("
                        + "     id integer PRIMARY KEY AUTOINCREMENT,"
                        + "     name text NOT NULL,"
                        + "     description text NOT NULL,"
                        + "     image text NOT NULL,"
                        + "     type text NOT NULL,"
                        + "     damage integer,"
                        + "     rangeDamage integer,"
                        + "     range integer," // Portée d'attaque
                        + "     movementPoint integer NOT NULL,"
                        + "     period text NOT NULL,"
                        + "     civilization text,"
                        + "     productionCost text NOT NULL,"
                        + "     typeOfProduction text NOT NULL,"
                        + "     baseGoldCost integer NOT NULL"
                        + ")";

        // CREATION DE LA TABLE DES BATIMENTS :

        String buildingsSql = "CREATE TABLE buildings ("
                            + "     id integer PRIMARY KEY AUTOINCREMENT,"
                            + "     name text NOT NULL,"
                            + "     description text NOT NULL,"
                            + "     image text NOT NULL,"
                            + "     bonus text NOT NULL,"
                            + "     period text NOT NULL,"
                            + "     baseGoldCost integer NOT NULL,"
                            + "     productionCost text NOT NULL"
                            + ")";

        // CREATION DE LA TABLE DES RESSOURCES :

        String ressourcesSql = "CREATE TABLE ressources ("
                             + "     id integer PRIMARY KEY AUTOINCREMENT,"
                             + "     name text NOT NULL,"
                             + "     description text NOT NULL,"
                             + "     image text NOT NULL,"
                             + "     bonus text NOT NULL,"
                             + "     typeOfRessource text NOT NULL"
                             + ")";

        // CREATION DE LA TABLE DES DIRIGEANTS :

        String leadersSql = "CREATE TABLE leaders ("
                          + "     id integer PRIMARY KEY AUTOINCREMENT,"
                          + "     name text NOT NULL,"
                          + "     function text NOT NULL,"
                          + "     description text NOT NULL,"
                          + "     image text NOT NULL,"
                          + "     dateOfBirth date NOT NULL,"
                          + "     dateOfDeath date NOT NULL,"
                          + "     reign integer NOT NULL,"
                          + "     bonus text NOT NULL,"
                          + "     country text NOT NULL,"
                          + "     civilization text NOT NULL"
                          + ")";

        // CREATION DE LA TABLE DES MERVEILLES :

        String wondersSql = "CREATE TABLE wonders ("
                            + "     id integer PRIMARY KEY AUTOINCREMENT,"
                            + "     name text NOT NULL,"
                            + "     description text NOT NULL,"
                            + "     image text NOT NULL,"
                            + "     constructor text,"
                            + "     bonus text,"
                            + "     type text NOT NULL,"
                            + "     period text,"
                            + "     location text NOT NULL,"
                            + "     dateOfFoundation date"
                            + ")";

        // CREATION DES TABLES :
        db.execSQL(civilizationsSql);
        db.execSQL(ressourcesSql);
        db.execSQL(unitsSql);
        db.execSQL(buildingsSql);
        db.execSQL(leadersSql);
        db.execSQL(wondersSql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
