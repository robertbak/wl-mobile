package pl.org.nowoczesnapolska;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class Settings extends Activity {
	Context ctx;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        
        ctx = this;
    }
}