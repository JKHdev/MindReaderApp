package pl.javaknowhow.mindreaderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_info;
    private Button b_yes, b_higher, b_lower, b_ok;
    private int tries = 0;
    private  int left = 0, right = 1000;
    private int mid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_info = (TextView) findViewById(R.id.tv_info);

        b_ok = (Button) findViewById(R.id.b_ok);
        b_yes = (Button) findViewById(R.id.b_yes);
        b_lower = (Button) findViewById(R.id.b_lower);
        b_higher = (Button) findViewById(R.id.b_higher);

        b_yes.setVisibility(View.INVISIBLE);
        b_lower.setVisibility(View.INVISIBLE);
        b_higher.setVisibility(View.INVISIBLE);

        tv_info.setText("Think of the number betwen 1 and 1000 and I'll guess it under 10 moves");

        b_ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        b_yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        b_higher.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        b_lower.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });
    }
}
