package com.moringaschool.paleorecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FindRecipesActivity extends AppCompatActivity{
    public static final String TAG = FindRecipesActivity.class.getSimpleName();

    private TextView mRecipeNameTextView;
    private TextView mIngredientsTextView;
    private TextView mPreparationTextView;
    private TextView mPersonNameTextView;

    @BindView(R.id.listView) ListView mListView;
    private String[] recipes = new String[] {"Banana Cake", "Vanilla Jello",
            "Stir Fried Rice", "Carrot Cake", "Fudge Brownie", "Tomato Basil Sauce",
            "Sloppy Joes", "Custard Sauce", "Chipotle Beans", "Avocado Toast", "Pinneaple Upside Down Cake", "Ginger Cookies", "Zuchini Bread", "Sweet Potato soup", "Caesar Salad","Taco Casserole", "Hummus"};
    // private String[] posters = new String[] {"Mary", "Wanjiru", "John", "Beatrice", "Wallace", "Edward", "Ken",
    // "Susan", "Becky"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_recipes);

        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, recipes);
        mListView.setAdapter(adapter);

        //MyRecipesArrayAdapter adapter = new MyRecipesArrayAdapter(this, android.R.layout.simple_list_item_1, recipes, posters);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String recipe = ((TextView)view).getText().toString();
                Log.v("FindRecipesActivity", "In the onItemClickListener!");
                Toast.makeText(FindRecipesActivity.this, recipe, Toast.LENGTH_LONG).show();
            }
        });

        Log.d("FindRecipesActivity", "In the onCreate method!");

    }
}