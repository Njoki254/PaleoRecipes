
package com.moringaschool.paleorecipes.view.detail;

import com.moringaschool.paleorecipes.model.Meals;

public interface DetailView {
    //Add void method  for showLoading, hideLoading, setMeal, onErrorLoading;
    //The interface of this method will behave bridging between presenters to activities
    //then activity Overriding the interface
    //behavior, when loading must appear || showLoading();
    //Loading must be removed || hideLoading()
    // Display Meal data (with List <Meal> meals) parameters || setMeals();
    // Displays Category data (with List parameters <Category> category) setCategories();
    // and, Behavior when an error occurs when requesting data to the API
    void showLoading();
    void hideLoading();
    void setMeal (Meals.Meal meal);
    void onErrorLoading(String message);

}
