package fr.speleize.civilizationvi_scrollkit.database.ressources;

import android.provider.BaseColumns;

import fr.speleize.civilizationvi_scrollkit.classes.Building;
import fr.speleize.civilizationvi_scrollkit.classes.Leader;
import fr.speleize.civilizationvi_scrollkit.classes.Unit;

public class BaseContrat {

    /**
     * Constructeur privé afin de ne pas instancier la classe.
     */
    private BaseContrat() {
    }

    /* public static class CivilizationsContrat implements BaseColumns {
     */

    /**
     * Contenu de la table "civilizations"
     *//*
        public static final String TABLE_CIVILIZATIONS = "civilizations";
        public static final String COLONNE_NAME = "name";
        public static final String COLONNE_DESCRIPTION = "description";
        public static final String COLONNE_IMAGE = "image";
        public static final Leader COLONNE_LEADER = null;
        public static final String COLONNE_CONTINENT = "continent";
        public static final String COLONNE_BONUS = "bonus";
        public static final Unit COLONNE_SPECIALUNIT = null;
        public static final Building COLONNE_SPECIALBUILDING = null;
        public static final String COLONNE_VICTORYTYPE = "victorytype";

    }
*/
    public static class RessourcesContrat implements BaseColumns {
        /**
         * Contenu de la table "ressources"
         */
        public static final String TABLE_RESSOURCES = "ressources";
        public static final String COLONNE_NAME = "name";
        public static final String COLONNE_DESCRIPTION = "description";
        public static final String COLONNE_IMAGE = "image";
        public static final String COLONNE_BONUS = "bonus";
        public static final String COLONNE_TYPEOFRESSOURCE = "continent";
    }
}

    /*private static final String SQL_CREATE_RESSOURCE =
            "CREATE TABLE " + RessourcesContrat.TABLE_RESSOURCES + " (" +
                    RessourcesContrat._ID + " INTEGER PRIMARY KEY," +
                    RessourcesContrat.COLONNE_NAME + " TEXT," +
                    RessourcesContrat.COLONNE_DESCRIPTION + " TEXT," +
                    RessourcesContrat.COLONNE_IMAGE + " TEXT," +
                    RessourcesContrat.COLONNE_BONUS + " TEXT," +
                    RessourcesContrat.COLONNE_TYPEOFRESSOURCE + " TEXT)";
}*/



    /*private static final String SQL_CREATE_CIVILIZATION =
            "CREATE TABLE " + CivilizationsContrat.TABLE_CIVILIZATIONS + " (" +
                    CivilizationsContrat._ID + " INTEGER PRIMARY KEY," +
                    CivilizationsContrat.COLONNE_NAME + " TEXT," +
                    CivilizationsContrat.COLONNE_DESCRIPTION + " TEXT," +
                    CivilizationsContrat.COLONNE_IMAGE + " TEXT," +
                    CivilizationsContrat.COLONNE_LEADER +
                    CivilizationsContrat.COLONNE_CONTINENT + " TEXT," +
                    CivilizationsContrat.COLONNE_BONUS + " TEXT," +
                    CivilizationsContrat.COLONNE_SPECIALUNIT +
                    CivilizationsContrat.COLONNE_SPECIALBUILDING +
                    CivilizationsContrat.COLONNE_VICTORYTYPE + " TEXT)";
}*/
