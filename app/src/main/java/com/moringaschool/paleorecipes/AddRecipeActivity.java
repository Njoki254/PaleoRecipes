package com.moringaschool.paleorecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddRecipeActivity extends AppCompatActivity {
    @BindView(R.id.recipeNameEditText) EditText mRecipeNameEditText;
    @BindView(R.id.personNameEditText) EditText mPersonNameEditText;
    @BindView(R.id.ingredientsEditText) EditText mIngredientsEditText;
    @BindView(R.id.preparationEditText) EditText mPreparationEditText;

    @BindView(R.id.addRecipeButton) Button mAddRecipeButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);
        ButterKnife.bind(this);


        mAddRecipeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String recipeName = mRecipeNameEditText.getText().toString();
                String ingredients = mIngredientsEditText.getText().toString();
                String personName = mPersonNameEditText.getText().toString();
                String preparation = mPreparationEditText.getText().toString();

                Intent intent = new Intent(AddRecipeActivity.this, NewRecipeActivity.class);
                intent.putExtra("recipeName", recipeName);
                intent.putExtra("ingredients", ingredients);
                intent.putExtra("personName", personName);
                intent.putExtra("preparation", preparation);
                startActivity(intent);
            }
        });
    }
}