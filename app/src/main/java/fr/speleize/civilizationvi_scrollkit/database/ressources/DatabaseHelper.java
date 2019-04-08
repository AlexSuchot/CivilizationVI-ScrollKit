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

        ///////////////////////////////////////////////////////////////
        // RESSOURCES BONUS :
        ///////////////////////////////////////////////////////////////

        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus se trouvant dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Cuivre', 'Ressource bonus se trouvant dans les collines, nécessite le minage. Améliorable avec les mines qui apportent plus de productions. Le cuivre est utilisé par les hommes depuis très longtemps, très maléable il sert essentiellement dans l''électricité. Il a aussi servi à faire des armes et des armures de part sa solidité.', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Lait', 'Ressource bonus se trouvant sur les prairies. Améliorable avec les paturages. Le lait est utilisé par l''humanité depuis des milliers d''années.', 'https://vignette.wikia.nocookie.net/civilization/images/5/59/Cattle_%28Civ6%29.png/revision/latest?cb=20180504132307', '+1 de nourriture', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Crabe', 'Ressource bonus se trouvant sur les eaux côtières, nécessite la pêche. Améliorable avec les bateaux de pêche. Les crabes vivent dans des environnements variés et sont une source de nourriture pour les hommes depuis des milliers d''années.', 'https://vignette.wikia.nocookie.net/civilization/images/d/de/Crabs_%28Civ6%29.png/revision/latest?cb=20180504132308', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Cerf', 'Ressource bonus se trouvant sur les cases de toundra ou de forêt. Améliorable avec des camps. Chassé par les tribus primitives, les cerfs représentaient la nourriture principale chez les hommes de cro-magnons.', 'https://vignette.wikia.nocookie.net/civilization/images/f/fa/Deer_%28Civ6%29.png/revision/latest?cb=20180504132311', '+1 nourriture', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Poisson', 'Ressource bonus se trouvant sur les côtes et les récifs, nécessite navigation céleste. Améliorable avec les bateaux de pêche. Riche en protéine et minéraux. La consommation très forte menace de nombreuses espèces suite à leur exploitation.', 'https://vignette.wikia.nocookie.net/civilization/images/7/71/Fish_%28Civ6%29.png/revision/latest?cb=20180504132312', '+1 nourriture', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Riz', 'Ressource bonus se trouvant sur les prairies et les marais. Peut être récolté avec la compétence poterie. Peut être amélioré avec une ferme ce qui augmente de 4 le bonus de nourriture. Consommé dans le monde entier. Se cultive dans les régiosn tropicales.', 'https://vignette.wikia.nocookie.net/civilization/images/4/4e/Sheep_%28Civ6%29.png/revision/latest?cb=20180504132316', '+1 nourriture', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Mouton', 'Ressource bonus se trouvant dans les collines et les prairies. S''améliore avec les paturages et augmente ainsi la nourriture et la production. L''élevage de mouton a commencé il y a 5000 ans en Asie.', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Pierre', 'Ressource bonus se trouvant dans les prairies. Se récolte avec le minage. Permet la construction de la merveille Stonehenge.', 'https://vignette.wikia.nocookie.net/civilization/images/4/44/Stone_%28Civ6%29.png/revision/latest?cb=20180504132318', '+1 de production', 'Bonus')");
        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Blé', 'Ressource bonus se trouvant sur les terrains plat. Peut être récolté avec la compétence poterie. Peut être amélioré avec une ferme ce qui augmente de 4 le bonus de nourriture. Très versatile, le blé peut se moudre et devenir de la farine, nourrir le bétail, ou transformer en bière. Le blé est considéré comme l''un des aliments de base à travers le monde.', 'https://vignette.wikia.nocookie.net/civilization/images/7/76/Wheat_%28Civ6%29.png/revision/latest?cb=20180504132321', '+1 nourriture', 'Bonus')");

        ///////////////////////////////////////////////////////////////
        // RESSOURCES STRATEGIQUES :
        ///////////////////////////////////////////////////////////////



//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans la jungle', 'https://vignette.wikia.nocookie.net/civilization/images/1/1b/Bananas_%28Civ6%29.png/revision/latest?cb=20180504132300', '+1 de nourriture, +0,5 habitation, +1 or', 'Bonus')");
//        db.execSQL("INSERT INTO " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES + " VALUES (NULL, 'Banane', 'Ressource bonus trouvable dans les collines, nécessite le minage', 'https://vignette.wikia.nocookie.net/civilization/images/c/ce/Copper_%28Civ6%29.png/revision/latest?cb=20180504132305', '+2 or', 'Bonus')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + BaseContrat.RessourcesContrat.TABLE_RESSOURCES);
        onCreate(db);

    }
}
