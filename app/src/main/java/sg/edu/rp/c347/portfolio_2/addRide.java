package sg.edu.rp.c347.portfolio_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addRide extends AppCompatActivity {

    EditText etMeet, etTime, etDate, etDest;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ride);
        Intent i = getIntent();
        final String user = i.getStringExtra("user");


        etDate = findViewById(R.id.etDate);
        etDest = findViewById(R.id.etDest);
        etMeet = findViewById(R.id.etMeetup);
        etTime = findViewById(R.id.etTime);

        btnAdd = findViewById(R.id.button5);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Ride(etTime.getText().toString(), etDate.getText().toString(), etMeet.getText().toString(), etDest.getText().toString(), user);
                startActivity(new Intent(addRide.this, home.class));
            }
        });
    }
}
