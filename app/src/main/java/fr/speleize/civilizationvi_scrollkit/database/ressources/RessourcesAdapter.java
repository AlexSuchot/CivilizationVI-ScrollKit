package fr.speleize.civilizationvi_scrollkit.database.ressources;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import fr.speleize.civilizationvi_scrollkit.R;
import fr.speleize.civilizationvi_scrollkit.RessourcesActivity;
import fr.speleize.civilizationvi_scrollkit.classes.Ressource;

public class RessourcesAdapter extends RecyclerView.Adapter<RessourcesViewHolder> {

    public static String PACKAGE_NAME;
    private final RessourcesActivity ressourcesActivity;

    // Liste d'objets métier :
    private List<Ressource> listRessources = null;
    private Context context = null;

    /**
     * Constructeur.
     *
     * @param listRessources de mémos
     */
    public RessourcesAdapter(List<Ressource> listRessources, RessourcesActivity ressourcesActivity) {
        this.listRessources = listRessources;
        this.ressourcesActivity = ressourcesActivity;
    }

    @Override
    public RessourcesViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View viewRessources = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ressources, parent, false);
        return new RessourcesViewHolder(viewRessources);

    }

    public class activity extends Activity {
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
        }
    }

    @Override
    public void onBindViewHolder(RessourcesViewHolder ressourcesViewHolder, int position) {
        onClick(getItemParPosition(position), ressourcesViewHolder);

        ressourcesViewHolder.getTextViewName().setText(listRessources.get(position).getName());
        String fileImage = listRessources.get(position).getImage();
        Picasso.with(ressourcesActivity)
                .load(fileImage)
                .into(ressourcesViewHolder.getImageViewImage());
        //ressourcesViewHolder.getTextViewDescription().setText(listRessources.get(position).getDescription());
        ressourcesViewHolder.getTextViewBonus().setText(listRessources.get(position).getBonus());
        ressourcesViewHolder.getTextViewTypeOfRessources().setText(listRessources.get(position).getTypeOfRessource());
    }

    @Override
    public int getItemCount() {
        return listRessources.size();
    }

    /**
     * Retourne la ressource à la position voulue.
     *
     * @param position Position
     * @return Ressources
     */
    public Ressource getItemParPosition(int position) {
        return listRessources.get(position);
    }

    public void onClick(final Ressource ressource, final RessourcesViewHolder holder) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ressourcesActivity, ressource.getBonus(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(holder.itemView.getContext(), SelectedRessourceActivity.class);
                intent.putExtra( "name", ressource.getName());
                intent.putExtra("description", ressource.getDescription());
                intent.putExtra("bonus", ressource.getBonus());
                intent.putExtra("typeOfRessource", ressource.getTypeOfRessource());
                intent.putExtra("image", ressource.getImage());
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

}