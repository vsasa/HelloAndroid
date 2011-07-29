package vsasa.hello.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.AnalogClock;

public class vsasa_hello_androidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView tv = new TextView(this);
        tv.setText("vsasa na androidu!!!");
        
        AnalogClock an_clock = new AnalogClock(this);
        
        setContentView(an_clock);
        //gisetContentView(tv);
    }
}