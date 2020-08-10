
package com.moringaschool.paleorecipes.view.home;

import com.moringaschool.paleorecipes.model.Categories;
import com.moringaschool.paleorecipes.model.Meals;

import java.util.List;

public interface SearchView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
