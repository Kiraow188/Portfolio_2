package sg.edu.rp.c347.portfolio_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class viewRide extends AppCompatActivity {
    ImageView ivMap;
    TextView tvMeet, tvDesc;
    Button btnInt, btnRiders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ride);

        ivMap = findViewById(R.id.imageView);
        tvMeet = findViewById(R.id.textView4);
        tvDesc = findViewById(R.id.textView5);
        btnInt = findViewById(R.id.btnInt);
        btnRiders = findViewById(R.id.btnView);

        btnRiders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
