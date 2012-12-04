package apc.examples;

import apc.examples.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import apc.examples.R;

public class PhotoCaptureExample extends Activity 
{
	protected Button _button;
	protected ImageView _image;
	protected TextView _field;
	protected String _path;
	protected boolean _taken;
	
	protected static final String PHOTO_TAKEN	= "photo_taken";
		
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.twitter);
       
        _image = ( ImageView ) findViewById( R.id.image1 );
        _field = ( TextView ) findViewById( R.id.field1);
        _button = ( Button ) findViewById( R.id.button1 );
        _button.setOnClickListener( new ButtonClickHandler() );
        
        _path = Environment.getExternalStorageDirectory() + "/images/make_machine_example.jpg";
    }
    
    public class ButtonClickHandler implements View.OnClickListener 
    {
    	public void onClick( View view ){
    		Log.i("MakeMachine", "ButtonClickHandler.onClick()" );
    		Intent intent = new Intent("android.intent.action.CAMERA_BUTTON");
    		startActivity(intent);
    		//startCameraActivity();
    	}
    }
    
    protected void startCameraActivity()
    {
    	Log.i("MakeMachine", "startCameraActivity()" );
    	File file = new File( _path );
    	Uri outputFileUri = Uri.fromFile( file );
    	
    	Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE );
    	intent.putExtra( MediaStore.EXTRA_OUTPUT, outputFileUri );
    	
    	startActivityForResult( intent, 0 );
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) 
    {	
    	Log.i( "MakeMachine", "resultCode: " + resultCode );
    	switch( resultCode )
    	{
    		case 0:
    			Log.i( "MakeMachine", "User cancelled" );
    			break;
    			
    		case -1:
    			onPhotoTaken();
    			break;
    	}
    }
    
    protected void onPhotoTaken()
    {
    	Log.i( "MakeMachine", "onPhotoTaken" );
    	
    	_taken = true;
    	
    	BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 4;
    	
    	Bitmap bitmap = BitmapFactory.decodeFile( _path, options );
    	
    	_image.setImageBitmap(bitmap);
    	
    	_field.setVisibility( View.GONE );
    }
    
    @Override 
    protected void onRestoreInstanceState( Bundle savedInstanceState){
    	Log.i( "MakeMachine", "onRestoreInstanceState()");
    	if( savedInstanceState.getBoolean( PhotoCaptureExample.PHOTO_TAKEN ) ) {
    		onPhotoTaken();
    	}
    }
    
    @Override
    protected void onSaveInstanceState( Bundle outState ) {
    	outState.putBoolean( PhotoCaptureExample.PHOTO_TAKEN, _taken );
    }
}*/
/*
public class PhotoCaptureExample extends Activity implements View.OnClickListener{
	private Button cameraButton;
	private static final int CAMERA_PIC_REQUEST = 42;  
	private Button finishButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitter);
        
        cameraButton= (Button) findViewById(R.id.camera);
        cameraButton.setOnClickListener(this);   
       // finishButton= (Button) findViewById(R.id.submit_PICKUP);
        finishButton.setOnClickListener(this);   
         
    
    }
	
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {  
        if (requestCode == CAMERA_PIC_REQUEST) {  
        	//Bitmap thumbnail = (Bitmap) data.getExtras().get("data"); 
        	//image = (ImageView) findViewById(R.id.camera); 
        	//image.setImageBitmap(thumbnail);
        }  
    }
    @Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		
    	case R.id.camera:
    		
    	    try {
    	    	Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE); 
    	    	startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);  

    	    	  Toast.makeText(getBaseContext(), 
    	    			  "Worked... " ,
      	                   Toast.LENGTH_LONG).show();
    	
    	    	  
    	    } catch (IllegalArgumentException e) {
    	        // TODO Auto-generated catch block
    	        e.printStackTrace();
    	    } catch (IllegalStateException e) {
    	        // TODO Auto-generated catch block
    	        e.printStackTrace();
    	    }
    	    
    		break;
    		
    		case R.id.submit_PICKUP:
    		
    	    try {
    	    	  Toast.makeText(getBaseContext(), 
    	    			  "Done!" ,
      	                   Toast.LENGTH_LONG).show();
  	 
    	    } catch (IllegalArgumentException e) {
    	        // TODO Auto-generated catch block
    	        e.printStackTrace();
    	    } catch (IllegalStateException e) {
    	        // TODO Auto-generated catch block
    	        e.printStackTrace();
    	    }
    	    
    		break;
   
	}
}
}*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class PhotoCaptureExample extends Activity{
	
	

	private static final String ACTION_CAMERA_BUTTON = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
		 startActivityForResult(intent, 0);
	}
	

}