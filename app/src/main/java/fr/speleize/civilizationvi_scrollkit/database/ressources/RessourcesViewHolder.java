package fr.speleize.civilizationvi_scrollkit.database.ressources;

import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fr.speleize.civilizationvi_scrollkit.R;
import fr.speleize.civilizationvi_scrollkit.RessourcesActivity;

public class RessourcesViewHolder extends RecyclerView.ViewHolder {

    private MenuView.ItemView ressourcesView = null;
    private TextView textViewName = null;
    private TextView textViewDescription = null;
    private ImageView imageViewImage = null;
    private TextView textViewBonus = null;
    private TextView textViewTypeOfRessources = null;

    /**
     * Constructeur.
     *
     * @param itemView Vue item
     */
    public RessourcesViewHolder(View itemView) {
        super(itemView);
        textViewName = itemView.findViewById(R.id.name);
        //textViewDescription = itemView.findViewById(R.id.description);
        imageViewImage = itemView.findViewById(R.id.image);
        textViewBonus = itemView.findViewById(R.id.bonus);
        textViewTypeOfRessources = itemView.findViewById(R.id.typeOfRessource);

    }

    public MenuView.ItemView getRessourcesView() {
        return ressourcesView;
    }

    public void setRessourcesView(MenuView.ItemView ressourcesView) {
        this.ressourcesView = ressourcesView;
    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public void setTextViewName(TextView textViewName) {
        this.textViewName = textViewName;
    }

    public TextView getTextViewDescription() {
        return textViewDescription;
    }

    public void setTextViewDescription(TextView textViewDescription) {
        this.textViewDescription = textViewDescription;
    }

    public ImageView getImageViewImage() {
        return imageViewImage;
    }

    public void setImageViewImage(ImageView imageViewImage) {
        this.imageViewImage = imageViewImage;
    }

    public TextView getTextViewBonus() {
        return textViewBonus;
    }

    public void setTextViewBonus(TextView textViewBonus) {
        this.textViewBonus = textViewBonus;
    }

    public TextView getTextViewTypeOfRessources() {
        return textViewTypeOfRessources;
    }

    public void setTextViewTypeOfRessources(TextView textViewTypeOfRessources) {
        this.textViewTypeOfRessources = textViewTypeOfRessources;
    }
}
