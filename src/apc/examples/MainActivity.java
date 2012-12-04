package apc.examples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends Activity 
{
	
    /** Called when the activity is first created. 
     * 
     * Photo of honeybee from 
     * 
     * */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void aboutMe(View v)
    {
    	Intent intent = new Intent(getApplicationContext(), apc.examples.AboutActivity.class); 
    	startActivity(intent);
    }
    
   public void takePicture(View v)
    {
    	/*Intent intent = new Intent(getApplicationContext(), apc.examples.PhotoCaptureExample.class); 
    	startActivity(intent);*/
	   Intent takePictureIntent = new Intent(getApplicationContext(),apc.examples.PhotoCaptureExample.class);
	   // startActivityForResult(takePictureIntent, actionCode);
	   startActivity(takePictureIntent);
    }
    
    public void showLocation(View v) {
    
    	Intent intent = new Intent(getApplicationContext(), apc.examples.LocationActivity.class); 
    	startActivity(intent);
    }
    
    
}