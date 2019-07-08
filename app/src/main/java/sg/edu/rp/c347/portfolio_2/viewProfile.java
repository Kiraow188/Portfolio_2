package sg.edu.rp.c347.portfolio_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class viewProfile extends AppCompatActivity {
    ImageView profile;
    TextView user, email, dob;
    Button btnedit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

        profile = findViewById(R.id.ivProfile);
        user = findViewById(R.id.tvUser);
        email = findViewById(R.id.tvEmail);
        dob = findViewById(R.id.tvDOB);
        btnedit = findViewById(R.id.button6);

        btnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
