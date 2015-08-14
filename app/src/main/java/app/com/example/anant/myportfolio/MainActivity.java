package app.com.example.anant.myportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

Button app1,app2,app3,app4,app5,app6;

    final CharSequence msg1 = "Launching App : Spotify Streamer ";
    final CharSequence msg2 = "Launching App : Scores App";
    final CharSequence msg3 = "Launching App : Library App";
    final CharSequence msg4 = "Launching App : Build it Bigger";
    final CharSequence msg5 = "Launching App : XYZ Reader";
    final CharSequence msg6 = "Launching App : Capstone App";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app1 = (Button)findViewById(R.id.b1);
        app2 = (Button)findViewById(R.id.b2);
        app3 = (Button)findViewById(R.id.b3);
        app4 = (Button)findViewById(R.id.b4);
        app5 = (Button)findViewById(R.id.b5);
        app6 = (Button)findViewById(R.id.b6);

        click(app1);
        click(app2);
        click(app3);
        click(app4);
        click(app5);
        click(app6);


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

        return super.onOptionsItemSelected(item);
    }


    public void click(Button b){
        //setting onclick listener on the butons
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = v.getId();
                switch (i) {
                    case R.id.b1:
                        //toastText.setText("Launching App : Spotify Streamer ");
                        Toast.makeText(getApplicationContext(), msg1, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b2:
                        Toast.makeText(getApplicationContext(), msg2, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b3:
                        Toast.makeText(getApplicationContext(), msg3, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b4:
                        Toast.makeText(getApplicationContext(), msg4, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b5:
                        Toast.makeText(getApplicationContext(), msg5, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b6:
                        Toast.makeText(getApplicationContext(), msg6, Toast.LENGTH_SHORT).show();
                        break;

                }


            }
        });


    }
}
