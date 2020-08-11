
package com.moringaschool.paleorecipes.view.home;

import com.moringaschool.paleorecipes.model.Categories;
import com.moringaschool.paleorecipes.model.Meals;

import java.util.List;

public interface SearchView {
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
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
