package fr.speleize.civilizationvi_scrollkit.classes;

public class Building {
    private String name;
    private String description;
    private String image;
    private String bonus;
    private String period;
    private Integer baseGoldCost;
    private Integer productionCost;

    public Building(String name, String description, String image, String bonus, String period, Integer baseGoldCost, Integer productionCost) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.bonus = bonus;
        this.period = period;
        this.baseGoldCost = baseGoldCost;
        this.productionCost = productionCost;
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

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getBaseGoldCost() {
        return baseGoldCost;
    }

    public void setBaseGoldCost(Integer baseGoldCost) {
        this.baseGoldCost = baseGoldCost;
    }

    public Integer getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(Integer productionCost) {
        this.productionCost = productionCost;
    }
}


