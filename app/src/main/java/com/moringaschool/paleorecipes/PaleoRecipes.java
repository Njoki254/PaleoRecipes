
package com.moringaschool.paleorecipes;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaleoRecipes {

    @SerializedName("meals")
    @Expose
    private List<com.moringaschool.paleorecipes.Meal> meals = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaleoRecipes() {
    }

    /**
     * 
     * @param meals
     */
    public PaleoRecipes(List<com.moringaschool.paleorecipes.Meal> meals) {
        super();
        this.meals = meals;
    }

    public List<com.moringaschool.paleorecipes.Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<com.moringaschool.paleorecipes.Meal> meals) {
        this.meals = meals;
    }

}
