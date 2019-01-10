package fr.speleize.civilizationvi_scrollkit.classes;

import java.util.Date;

public class Wonder {
    private String name;
    private String description;
    private String image;
    private String constructor;
    private String bonus;
    private String type;
    private String period;
    private String location;
    private String productionCost;
    private Date dateOfFoundation;

    public Wonder(String name, String description, String image, String constructor, String bonus, String type, String period, String location, String productionCost, Date dateOfFoundation) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.constructor = constructor;
        this.bonus = bonus;
        this.type = type;
        this.period = period;
        this.location = location;
        this.productionCost = productionCost;
        this.dateOfFoundation = dateOfFoundation;
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

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(String productionCost) {
        this.productionCost = productionCost;
    }

    public Date getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(Date dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }
}
