package sg.edu.rp.c347.portfolio_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnLogin, btnRegister;
    EditText user, pass;
    ArrayList<Acc> accs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();
        if (i.equals(null)){
            accs = new ArrayList<Acc>();
            accs.add(new Acc("Kiraow", "12345678", "10-01-2000", "kira@gmail.com"));
        }else{

        }

        btnLogin = findViewById(R.id.button);
        btnRegister = findViewById(R.id.button2);

        user = findViewById(R.id.editText4);
        pass = findViewById(R.id.editText5);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, home.class);
                i.putExtra("user", user.getText().toString());
                startActivity(i);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, register.class);
                startActivity(i);
            }
        });
    }
}
