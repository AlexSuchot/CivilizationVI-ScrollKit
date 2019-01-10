package fr.speleize.civilizationvi_scrollkit.classes;

import java.util.Date;

public class Leader {
    private String name;
    private String function;
    private String description;
    private String image;
    private Date dateOfBirth;
    private Date dateOfDeath;
    private Integer reign;
    private String bonus;
    private Civilization civilization;

    public Leader(String name, String function, String description, String image, Date dateOfBirth, Date dateOfDeath, Integer reign, String bonus, Civilization civilization) {
        this.name = name;
        this.function = function;
        this.description = description;
        this.image = image;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.reign = reign;
        this.bonus = bonus;
        this.civilization = civilization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public Integer getReign() {
        return reign;
    }

    public void setReign(Integer reign) {
        this.reign = reign;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public Civilization getCivilization() {
        return civilization;
    }

    public void setCivilization(Civilization civilization) {
        this.civilization = civilization;
    }


}


