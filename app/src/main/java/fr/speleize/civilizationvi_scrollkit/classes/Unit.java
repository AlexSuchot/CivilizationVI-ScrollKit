package fr.speleize.civilizationvi_scrollkit.classes;

public class Unit {
    private String name;
    private String description;
    private String image;
    private String type;
    private Integer damage;
    private Integer rangeDamage;
    private Integer movementPoint;
    private String period;
    private Civilization civilization;
    private String productionCost;
    private String typeOfProduction;
    private Integer baseGoldCost;

    public Unit(String name, String description, String image, String type, Integer damage, Integer rangeDamage, Integer movementPoint, String period, Civilization civilization, String productionCost, String typeOfProduction, Integer baseGoldCost) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.type = type;
        this.damage = damage;
        this.rangeDamage = rangeDamage;
        this.movementPoint = movementPoint;
        this.period = period;
        this.civilization = civilization;
        this.productionCost = productionCost;
        this.typeOfProduction = typeOfProduction;
        this.baseGoldCost = baseGoldCost;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getRangeDamage() {
        return rangeDamage;
    }

    public void setRangeDamage(Integer rangeDamage) {
        this.rangeDamage = rangeDamage;
    }

    public Integer getMovementPoint() {
        return movementPoint;
    }

    public void setMovementPoint(Integer movementPoint) {
        this.movementPoint = movementPoint;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Civilization getCivilization() {
        return civilization;
    }

    public void setCivilization(Civilization civilization) {
        this.civilization = civilization;
    }

    public String getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(String productionCost) {
        this.productionCost = productionCost;
    }

    public String getTypeOfProduction() {
        return typeOfProduction;
    }

    public void setTypeOfProduction(String typeOfProduction) {
        this.typeOfProduction = typeOfProduction;
    }

    public Integer getBaseGoldCost() {
        return baseGoldCost;
    }

    public void setBaseGoldCost(Integer baseGoldCost) {
        this.baseGoldCost = baseGoldCost;
    }

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
