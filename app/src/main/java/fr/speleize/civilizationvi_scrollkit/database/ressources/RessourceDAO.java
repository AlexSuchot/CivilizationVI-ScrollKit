package fr.speleize.civilizationvi_scrollkit.database.ressources;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import fr.speleize.civilizationvi_scrollkit.classes.Ressource;
import fr.speleize.civilizationvi_scrollkit.database.BaseContrat;
import fr.speleize.civilizationvi_scrollkit.database.DatabaseHelper;

public class RessourceDAO {

    /**
     * Retourne la liste de mémos.
     * @param context Context
     * @return Liste de MemoDTO
     */

    public List<Ressource> getListRessources(Context context) {
        // projection (colonnes utilisées après la requète) :
        String[] projection = {BaseContrat.RessourcesContrat._ID,
                BaseContrat.RessourcesContrat.COLONNE_NAME};

        // tri :
        String tri = BaseContrat.RessourcesContrat.COLONNE_NAME + " ASC ";

        // accès en lecture (query) :
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        SQLiteDatabase db = databaseHelper.getReadableDatabase();

        // requête :
        Cursor cursor = db.query(
                BaseContrat.RessourcesContrat.TABLE_RESSOURCES,    // table sur laquelle faire la requète
                projection,                                // colonnes à retourner
                null,                            // colonnes pour la clause WHERE (inactif)
                null,                        // valeurs pour la clause WHERE (inactif)
                null,                            // GROUP BY (inactif)
                null,                            // HAVING (inactif)
                tri,                                    // ordre de tri
                null);                                // LIMIT (inactif)

        // construction de la liste de mémos
        List<Ressource> listRessources = new ArrayList<>();
        if (cursor != null) {
            try {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    // conversion des données remontées en un objet métier :
                    listRessources.add(new Ressource(
                            cursor.getString(cursor.getColumnIndex(BaseContrat.RessourcesContrat.COLONNE_NAME)),
                            cursor.getString(cursor.getColumnIndex(BaseContrat.RessourcesContrat.COLONNE_DESCRIPTION)),
                            cursor.getString(cursor.getColumnIndex(BaseContrat.RessourcesContrat.COLONNE_IMAGE)),
                            cursor.getString(cursor.getColumnIndex(BaseContrat.RessourcesContrat.COLONNE_BONUS)),
                            cursor.getString(cursor.getColumnIndex(BaseContrat.RessourcesContrat.COLONNE_TYPEOFRESSOURCE))));
                    cursor.moveToNext();
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            } finally {
                cursor.close();
            }
        }

        return listRessources;
    }

}
