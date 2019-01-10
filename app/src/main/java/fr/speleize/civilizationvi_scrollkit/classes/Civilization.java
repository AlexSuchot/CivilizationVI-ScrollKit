package fr.speleize.civilizationvi_scrollkit.classes;

public class Civilization {
    private String name;
    private String description;
    private String image;
    private Leader leader;
    private String continent;
    private String bonus;
    private Unit unit;
    private Building building;
    private String victoryType;

    public Civilization(String name, String description, String image, Leader leader, String continent, String bonus, Unit unit, Building building, String victoryType) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.leader = leader;
        this.continent = continent;
        this.bonus = bonus;
        this.unit = unit;
        this.building = building;
        this.victoryType = victoryType;
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

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public String getVictoryType() {
        return victoryType;
    }

    public void setVictoryType(String victoryType) {
        this.victoryType = victoryType;
    }
}