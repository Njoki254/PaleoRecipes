package com.moringaschool.paleorecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.moringaschool.paleorecipes.view.home.SearchActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DescriptionActivity extends AppCompatActivity implements View.OnClickListener {


    public static final String TAG = MainActivity.class.getSimpleName();
    //private EditText mNameEditText;
    @BindView(R.id.addRecipeButton) Button mAddRecipeButton;
    @BindView(R.id.findRecipesButton) Button mFindRecipesButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        // mNameEditText = (EditText) findViewById(R.id.nameEditText);
        ButterKnife.bind(this);

        mFindRecipesButton.setOnClickListener(this);
        mAddRecipeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mAddRecipeButton) {
            Intent intent = new Intent(DescriptionActivity.this, AddRecipeActivity.class);
            // intent.putExtra("name", name);
            startActivity(intent);
        }
        else if(v == mFindRecipesButton) {
            Intent intent = new Intent(DescriptionActivity.this, SearchActivity.class);
            // intent.putExtra("name", name);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(DescriptionActivity.this, DescriptionActivity.class);
            // intent.putExtra("name", name);
            startActivity(intent);
        }
    }


}