package fr.speleize.civilizationvi_scrollkit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.Date;

import fr.speleize.civilizationvi_scrollkit.classes.Building;
import fr.speleize.civilizationvi_scrollkit.classes.Civilization;
import fr.speleize.civilizationvi_scrollkit.classes.Leader;
import fr.speleize.civilizationvi_scrollkit.classes.Unit;

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
                + "     productionCost integer NOT NULL,"
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
                + "     productionCost integer NOT NULL,"
                + "     typeOfBuilding text NOT NULL"
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
                + "     productionCost integer,"
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

    // REQUETE POUR INSERER UNE CIVILISATION :

    public void insertCivilization(String name, String description, String image, Leader leader, String continent, String bonus, Unit specialUnit, Building specialBuilding, String victoryType) {
        name = name.replace("'", "''");
        description = description.replace("'", "''");
        image = image.replace("'", "''");
        continent = continent.replace("'", "''");
        bonus = bonus.replace("'", "''");
        victoryType = victoryType.replace("'", "''");

        String civilizationsSql = "INSERT INTO civilizations (name, description, image, leader, continent, bonus, specialUnit, specialBuilding, victoryType) values ('"
                + name + "', " + description + ", " + image + ", " + continent + ", " + bonus + ", " + specialUnit + ", " + ", " + specialBuilding + ", " + victoryType + ")";

        this.getWritableDatabase().execSQL(civilizationsSql);
    }

    // REQUETE POUR INSERER UNE UNITE :

    public void insertUnits(String name, String description, String image, String type, Integer damage, Integer rangeDamage, Integer range, Integer movementPoint, String period, Civilization civilization, Integer productionCost, String typeOfProduction, Integer baseGoldCost) {
        name = name.replace("'", "''");
        description = description.replace("'", "''");
        image = image.replace("'", "''");
        type = type.replace("'", "''");
        period = period.replace("'", "''");
        typeOfProduction = typeOfProduction.replace("'", "''");

        String unitsSql = "INSERT INTO units (name, description, image, type, damage, rangeDamage, range, movementPoint, period, civilization, productionCost, typeOfProduction, baseGoldCost) values ('"
                + name + "', " + description + ", " + image + ", " + type + ", " + ", " + damage + ", " + rangeDamage + ", " + range +
                ", " + movementPoint + ", " + period + ", " + civilization + ", " + productionCost + ", " + typeOfProduction + ", " + baseGoldCost + ")";
        this.getWritableDatabase().execSQL(unitsSql);
    }

    // REQUETE POUR INSERER UN BATIMENT :

    public void insertBuildings(String name, String description, String image, String bonus, String period, Integer baseGoldCost, Integer productionCost, String typeOfBuilding) {
        name = name.replace("'", "''");
        description = description.replace("'", "''");
        image = image.replace("'", "''");
        bonus = bonus.replace("'", "''");
        period = period.replace("'", "''");
        typeOfBuilding = typeOfBuilding.replace("'", "''");

        String buildingsSql = "INSERT INTO buildings (name, description, image, bonus, period, baseGoldCost, productionCost, typeOfBuilding) values ('"
                + name + "', " + description + ", " + image + ", " + bonus + ", " + period + ", " + baseGoldCost + ", " + productionCost + ", " + typeOfBuilding + ")";
        this.getWritableDatabase().execSQL(buildingsSql);
    }

    // REQUETE POUR INSERER UNE RESSOURCE :

    public void insertRessources(String name, String description, String image, String bonus, String typeOfRessource) {
        name = name.replace("'", "''");
        description = description.replace("'", "''");
        image = image.replace("'", "''");
        bonus = bonus.replace("'", "''");
        typeOfRessource = typeOfRessource.replace("'", "''");

        String ressourcesSql = "INSERT INTO ressources (name, description, image, bonus, typeOfRessource) values ('"
                + name + "', " + description + ", " + image + ", " + bonus + ", " + typeOfRessource + ", " + ")";
        this.getWritableDatabase().execSQL(ressourcesSql);
    }

    // REQUETE POUR INSERER UN LEADER :

    public void insertLeaders(String name, String function, String description, String image, Date dateOfBirth, Date dateOfDeath, Integer reign, String bonus, Civilization civilization) {
        name = name.replace("'", "''");
        function = function.replace("'", "''");
        description = description.replace("'", "''");
        image = image.replace("'", "''");
        bonus = bonus.replace("'", "''");

        String leadersSql = "INSERT INTO leaders (name, function, description, image, dateOfBirth, dateOfDeath, reign, bonus, civilization) values ('"
                + name + "', " + function + ", " + description + ", " + image + ", " + dateOfBirth + ", " + dateOfDeath + ", " + reign + ", " + bonus + ", " + civilization + ")";
        this.getWritableDatabase().execSQL(leadersSql);
    }

    // REQUETE POUR INSERER UNE MERVEILLE :

    public void insertWonders(String name, String description, String image, String constructor, String bonus, String type, String period, String location, Integer productionCost, Date dateOfFoundation) {
        name = name.replace("'", "''");
        period = period.replace("'", "''");
        constructor = constructor.replace("'", "''");
        description = description.replace("'", "''");
        image = image.replace("'", "''");
        bonus = bonus.replace("'", "''");
        type = type.replace("'", "''");
        location = location.replace("'", "''");

        String wondersSql = "INSERT INTO wonders (name, description, image, constructor, bonus, type, period, location, productionCost, dateOfFoundation) values ('"
                + name + "', " + description + ", " + image + ", " + image + ", " + constructor + ", " + bonus + ", " + type + ", " + period + ", " + ", " + location + ", " + productionCost + ", " + dateOfFoundation + ")";
        this.getWritableDatabase().execSQL(wondersSql);
    }


}
