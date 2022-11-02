package dgoon.mobile.appmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private EditText name, email, pass;
    Button SignUp;
    User newUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);
        SignUp = (Button) findViewById(R.id.SignUpButton);


        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("") || name.getText().toString().equals("") || pass.getText().toString().equals("")) {
                    Toast.makeText(SignUpActivity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }else {
                    newUser =new User(email.getText().toString(), name.getText().toString(), pass.getText().toString());
                    Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                    intent.putExtra("email", newUser.getEmail());
                    intent.putExtra("password", newUser.getPass());
                    startActivity(intent);
                }
            }
        });
    }
}