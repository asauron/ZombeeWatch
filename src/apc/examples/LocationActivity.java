package apc.examples;

import android.app.Activity;
import android.content.Context;
import android.location.Location;  
import android.location.LocationListener;  
import android.os.Bundle;  
import android.widget.TextView;
import android.widget.Toast;
import android.location.LocationManager;
//import android.os.Bundle;

/**
 * Displays the location of the person on a map
 * Connection to Google Maps not yet implemented.
 * 
 */

public class LocationActivity extends Activity 
{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        
        //gps meenal
        TextView GPSTv = (TextView) findViewById(R.id.textView1);
       // GPSTv = (TextView)  detailsView.findViewById(R.id.locationTextView);
          LocationManager mlocManager=null;  
           LocationListener mlocListener;  
           mlocManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);  
           mlocListener = new GPS();  
          mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, mlocListener);  
    
          if (mlocManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {  
              if(GPS.latitude>0)  
              {  
                GPSTv.setText("Latitude:- " + GPS.latitude +"Longitude:- " + GPS.longitude );  
              
                Toast.makeText(getApplicationContext(), "Enable GPS", Toast.LENGTH_SHORT).show();
                
               }  
               else  
               {  
                 
                 Toast.makeText(getApplicationContext(), "Enable GPS", Toast.LENGTH_SHORT).show();
//                    alert.setTitle("Wait");  
//                    alert.setMessage("GPS in progress, please wait.");  
//                    alert.setPositiveButton("OK", null);  
//                    alert.show();  
                }  
            } else {  
              System.out.println("GPS is not turned on...");  
            } 
        
        
        //gps end
        
        
        
        
        
    }

}
