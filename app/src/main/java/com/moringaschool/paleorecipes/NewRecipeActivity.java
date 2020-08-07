
package com.moringaschool.paleorecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewRecipeActivity extends AppCompatActivity{
    public static final String TAG = NewRecipeActivity.class.getSimpleName();
    @BindView(R.id.recipeNameTextView) TextView mRecipeNameTextView;
    @BindView(R.id.personNameTextView) TextView mPersonNameTextView;
    @BindView(R.id.ingredientsTextView) TextView mIngredientsTextView;
    @BindView(R.id.preparationTextView) TextView mPreparationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_recipe);
        ButterKnife.bind(this);



        Intent intent = getIntent();
        String recipeName = intent.getStringExtra("recipeName");
        mRecipeNameTextView.setText("Name of Recipe: " + recipeName);
        String ingredients= intent.getStringExtra("ingredients");
        mIngredientsTextView.setText("Ingredients: " + ingredients + ",");

        String preparation= intent.getStringExtra("preparation");
        mPreparationTextView.setText("Preparation: " + preparation + ",");
        String personName = intent.getStringExtra("personName");
        mPersonNameTextView.setText("Added By: " + personName);


    }
}