package fr.speleize.civilizationvi_scrollkit.database.ressources;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES);
        onCreate(db);

    }
}
