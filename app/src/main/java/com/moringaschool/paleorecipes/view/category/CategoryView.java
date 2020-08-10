
package com.moringaschool.paleorecipes.view.category;

import com.moringaschool.paleorecipes.model.Meals;

import java.util.List;

public interface CategoryView {
    void showLoading();
    void hideLoading();
    void setMeals(List<Meals.Meal> meals);
    void onErrorLoading(String message);
}
