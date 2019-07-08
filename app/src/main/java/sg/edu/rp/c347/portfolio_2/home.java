package sg.edu.rp.c347.portfolio_2;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class home extends AppCompatActivity {
    ListView lv;
    Button btnAdd;
    ArrayAdapter aa;
    ArrayList<Ride> ride;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent i = getIntent();

        lv = findViewById(R.id.listview);
        btnAdd = findViewById(R.id.button4);

        ride= new ArrayList<Ride>();
        ride.add(new Ride("7am", "10-03-2019", "Woodlands 11 Coffee shop", "East coast park", "Kiraow"));
        ride.add(new Ride("8pm", "15-04-2019", "Punggol Reservoir Park 7-eleven", "Woodlands Waterfront", "Kiraow"));

        final String username = i.getStringExtra("user");

        aa = new CustomAdapter(this, R.layout.row, ride);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Ride selectedRide = ride.get(i);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this, addRide.class);
                i.putExtra("user", username);
                //i.putParcelableArrayListExtra("ride", (ArrayList<? extends Parcelable>) ride);
                startActivity(i);
            }
        });

    }
}
