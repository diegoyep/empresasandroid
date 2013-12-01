package pe.zefira.accesototal;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends Activity {

    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        test = (TextView) findViewById(R.id.text_name);
        SharedPreferences settings = getSharedPreferences("User", 0);
        String name = settings.getString("name", "No esta");
        test.setText(name);

        final Button buttonPlaces = (Button) findViewById(R.id.button_activity);
        buttonPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPlaces = new Intent(view.getContext(), ActionsActivity.class);
                startActivityForResult(intentPlaces, 0);
            }
        });





    }

}
