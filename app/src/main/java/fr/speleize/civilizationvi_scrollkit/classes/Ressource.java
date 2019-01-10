package fr.speleize.civilizationvi_scrollkit.classes;

public class Ressource {
    private String name;
    private String description;
    private String image;
    private String bonus;
    private String typeOfRessource;

    public Ressource(String name, String description, String image, String bonus, String typeOfRessource) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.bonus = bonus;
        this.typeOfRessource = typeOfRessource;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getTypeOfRessource() {
        return typeOfRessource;
    }

    public void setTypeOfRessource(String typeOfRessource) {
        this.typeOfRessource = typeOfRessource;
    }
}
