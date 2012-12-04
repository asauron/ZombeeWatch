package apc.examples;

import android.app.Activity;
import android.os.Bundle;

/**
 * This activity will display an image and some information about the person/entity
 * The image used in the example is of Linus Trovals, the Father of Linux
 *
 */
public class AboutActivity extends Activity 
{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }

}
