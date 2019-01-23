package fr.speleize.civilizationvi_scrollkit.database.ressources;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import fr.speleize.civilizationvi_scrollkit.R;
import fr.speleize.civilizationvi_scrollkit.classes.Ressource;

import static android.app.PendingIntent.getActivity;

public class RessourcesAdapter extends RecyclerView.Adapter<RessourcesViewHolder> {

    public static String PACKAGE_NAME;

    // Liste d'objets métier :
    private List<Ressource> listRessources = null;

    /**
     * Constructeur.
     *
     * @param listRessources de mémos
     */
    public RessourcesAdapter(List<Ressource> listRessources) {
        this.listRessources = listRessources;
    }

    @Override
    public RessourcesViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View viewRessources = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ressources, parent, false);
        return new RessourcesViewHolder(viewRessources);

    }
    public class activity extends Activity{
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

        }

    }

    @Override
    public void onBindViewHolder(RessourcesViewHolder ressourcesViewHolder, int position) {
        ressourcesViewHolder.getTextViewName().setText(listRessources.get(position).getName());

        // Ne fonctionne pas car le ressource adapter n'est pas une activité :
        //ressourcesViewHolder.getImageViewImage().setImageResource(getResources().getIdentifier("","drawable",getPackageName() ));

        // Fonctionne mais retourne toujours la même image :
        ressourcesViewHolder.getImageViewImage().setImageResource(R.drawable.allemagnelogo);

        ressourcesViewHolder.getTextViewDescription().setText(listRessources.get(position).getDescription());

        ressourcesViewHolder.getTextViewBonus().setText(listRessources.get(position).getBonus());

        ressourcesViewHolder.getTextViewTypeOfRessources().setText(listRessources.get(position).getTypeOfRessource());


    }

    @Override
    public int getItemCount() {
        return listRessources.size();
    }
}
