package fr.speleize.civilizationvi_scrollkit.database.ressources;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
        ressourcesViewHolder.getTextViewName().setText(listRessources.get(position).getName());

        String fileImage = listRessources.get(position).getImage();

        Picasso.with(ressourcesActivity)
                .load(fileImage)
                .into(ressourcesViewHolder.getImageViewImage());

        //ressourcesViewHolder.getTextViewDescription().setText(listRessources.get(position).getDescription());

        ressourcesViewHolder.getTextViewBonus().setText(listRessources.get(position).getBonus());

        ressourcesViewHolder.getTextViewTypeOfRessources().setText(listRessources.get(position).getTypeOfRessource());
    }
    /**
     * Retourne le mémo à la position voulue.
     * @param position Position
     * @return Mémo
     */
    public Ressource getItemParPosition(int position)
    {
        return listRessources.get(position);
    }

    @Override
    public int getItemCount() {
        return listRessources.size();
    }

    class RessourceViewHolder extends RecyclerView.ViewHolder {
        TextView ressourceName = null;
        TextView ressourceBonus = null;
        TextView ressourceDescription = null;
        TextView ressourceType = null;


        RessourceViewHolder(final View itemView) {
            super(itemView);
            ressourceName = itemView.findViewById(R.id.name);
            ressourceBonus = itemView.findViewById(R.id.bonus);
            ressourceDescription = itemView.findViewById(R.id.description);
            ressourceType = itemView.findViewById(R.id.typeOfRessource);

            // listener :
            itemView.setOnClickListener( new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    ressourcesActivity.onClickItem(getAdapterPosition());
                }
            });
        }
    }
}
