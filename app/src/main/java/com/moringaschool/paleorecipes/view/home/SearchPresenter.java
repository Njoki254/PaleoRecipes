
package com.moringaschool.paleorecipes.view.home;



import androidx.annotation.NonNull;

import com.moringaschool.paleorecipes.getApi;
import com.moringaschool.paleorecipes.model.Categories;
import com.moringaschool.paleorecipes.model.Meals;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
// Presenter is responsible to act as the middle man between View and Model.
// It retrieves data from the Model and returns it formatted to the View
class SearchPresenter {

    private SearchView view;

    public SearchPresenter(SearchView view) {
        this.view = view;
    }

    void getMeals() {

        //line to make a request,

        Call<Meals> mealsCall = getApi.getApi().getMeal();
        //waiting for callback
        mealsCall.enqueue(new Callback<Meals>() {
            @Override
            //@NonNull indicates a variable, parameter, or return value that cannot be null.
            //it is used to check if the results from call are empty or not
            public void onResponse(@NonNull Call<Meals> call, @NonNull Response<Meals> response) {
                view.hideLoading();
                //empty or non-empty result
                if (response.isSuccessful() && response.body() != null) {

                    view.setMeal(response.body().getMeals());

                }
                else {
                    //show error message if something goes wrong
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Meals> call, @NonNull Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }


    void getCategories() {

        view.showLoading();

        Call<Categories> categoriesCall = getApi.getApi().getCategories();
        categoriesCall.enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(@NonNull Call<Categories> call,
                                   @NonNull Response<Categories> response) {

                view.hideLoading();
                if (response.isSuccessful() && response.body() != null) {

                    view.setCategory(response.body().getCategories());

                }
                else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Categories> call, @NonNull Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }
}
