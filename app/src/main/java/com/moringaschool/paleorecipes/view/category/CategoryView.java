
package com.moringaschool.paleorecipes.view.category;

import com.moringaschool.paleorecipes.model.Meals;

import java.util.List;

public interface CategoryView {
    //Create void methods
    //The interface of this method will behave bridging between presenters to activities
    //then activity Overriding the interface
    //behavior, when loading must appear || showLoading();
    //Loading must be removed || hideLoading()
    // Display Meal data (with List <Meal> meals) parameters || setMeals();
    // Displays Category data (with List parameters <Category> category) setCategories();
    // and, Behavior when an error occurs when requesting data to the API
    void showLoading();
    void hideLoading();
    void setMeals(List<Meals.Meal> meals);
    void onErrorLoading(String message);
}
