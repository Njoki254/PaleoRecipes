package com.moringaschool.paleorecipes

import android.widget.TextView
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)

class FindRecipesActivityTest {

    private FindRecipesActivity activity;



    @Test
    public void validateRecipeNameTextViewContent() {
        TextView appNameTextView = activity.findViewById(R.id.recipeNameTextView);
        assertTrue("MyRestaurants".equals(recipeNameTextView.getText().toString()));
    }
    @Test
    public void validateIngredientsTextViewContent() {
        TextView appNameTextView = activity.findViewById(R.id.ingredeintsTextView);
        assertTrue("MyRestaurants".equals(ingredientsTextView.getText().toString()));
    }
    @Test
    public void validatePreparationTextViewContent() {
        TextView appNameTextView = activity.findViewById(R.id.preparationTextView);
        assertTrue("MyRestaurants".equals(preparationTextView.getText().toString()));
    }
    @Test
    public void validatepersonNameTextViewContent() {
        TextView appNameTextView = activity.findViewById(R.id.personNameTextView);
        assertTrue("MyRestaurants".equals(personNameTextView.getText().toString()));
    }
}
