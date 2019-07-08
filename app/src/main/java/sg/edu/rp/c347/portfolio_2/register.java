package sg.edu.rp.c347.portfolio_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    EditText etUser, etPass, etEmail, etDob;
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUser = findViewById(R.id.editText);
        etPass = findViewById(R.id.editText2);
        etDob = findViewById(R.id.editText6);
        etEmail = findViewById(R.id.editText3);

        btnReg = findViewById(R.id.button3);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
