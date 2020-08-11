
package com.moringaschool.paleorecipes.api;

import com.moringaschool.paleorecipes.model.Categories;
import com.moringaschool.paleorecipes.model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FoodApi {
//making different calls like getMeal,
// or getCategories using request annotation
//result of the request [GET] will be accommodated into Object (Category)
    @GET("latest.php")
    Call<Meals> getMeal();

    @GET("categories.php")
    Call<Categories> getCategories();
    //add interphase to get meals by category

    @GET("filter.php") 
    Call<Meals> getMealByCategory(@Query("c") String category);

    //Call the search.php with query string the meal name @GET("search.php)
    @GET("search.php")
    Call<Meals> getMealByName(@Query("s") String mealName);
    //"s" is from the search.php url

}
