package swapper.swapapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class MainActivity extends ActionBarActivity {
//wtf is this skit
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Parse.initialize(this, "Itd6ZHQhxHjuUSiBSsTVFClsYMz1CMXnCYD6W6Fl", "GucwC0yT4Rn99JhMgJWvLHIGT07FWFdIBUQ0hH2A");
        setContentView(R.layout.fragment_inbox);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        // if (id == R.id.) Hit kommer meny alternativ

        return super.onOptionsItemSelected(item);
    }
}
