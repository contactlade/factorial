package work.example.factorial;

import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	
	TextView textShow;
	Button buttonc;
	EditText value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	
    
         textShow = (TextView) findViewById(R.id.myTextView);
         buttonc = (Button) findViewById(R.id.button1);
         value = (EditText) findViewById(R.id.myEditText);
       
         value.setHint("enter your value");
        
		
    }

    
    		public void CalFactorial(View v){
    			
    			String  p = value.getText().toString();
    			 
    			int i = Integer.parseInt(p);
    			
    			 int k = 1 ;
    			for(int y=i; y>0; y--){
    				
    				k = k * y ;
    			}
    			
    			textShow.setText("the value of  " + i + " Factorial is " + k);
    			
    			
    			
    			
    		}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
