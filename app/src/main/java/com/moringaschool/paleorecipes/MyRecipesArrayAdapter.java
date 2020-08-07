package com.moringaschool.paleorecipes;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyRecipesArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRecipes;
    private String[] mPosters;
    //alling super() from a subclass allows you to reference a method that was overridden.
// It also allows you to call both the original and the overridden method from a subclass, or call the method from the superclass
    public MyRecipesArrayAdapter(Context mContext, int resource, String[] mRecipes, String[] mPosters) {
        super(mContext, resource);//refers to the XML file we are using in order to display our data.
        this.mContext = mContext;//current state of the application, needed to get info of app and other parts of app
        this.mRecipes = mRecipes;
        this.mPosters = mPosters;
    }
    //need to Override some of ArrayAdapter’s methods and replace them with our own custom versions. This is where we can format out output string!
    @Override
    //do not explicitly call getCount(), but we need this to be here nonetheless. ListView requires it, so it knows how many items to draw into the UI.
    public Object getItem(int position) {
        String recipe = mRecipes[position];
        String poster = mPosters[position];
        return String.format("%s \nServes great: %s", recipe, poster);//This is the string interporlation line. The %s represent each value after the closing “, separated by commas, \n is how we can create a new line in Java, to make our formatting even nicer.
    }

    @Override
    public int getCount() {
        return mRecipes.length;
    }
}