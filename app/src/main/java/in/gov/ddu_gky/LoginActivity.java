package in.gov.ddu_gky;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.util.Log;

import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

import butterknife.ButterKnife;

/**
 * Created by vyas on 5/10/17.
 */

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;
    SharedPreferences sharedPref;
    @BindView(R.id.aadharno) EditText aadharNotext;
    @BindView(R.id.password) EditText passwordText;
    @BindView(R.id.login) Button loginButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);


        sharedPref = this.getSharedPreferences("AadhaarPass",Context.MODE_PRIVATE);

    }

    @OnClick(R.id.login)
    public void login() {
        Log.d(TAG, "Login");

        loginButton.setEnabled(false);
        validate();
/*      String username = aadharNotext.getText().toString();
        String password = passwordText.getText().toString();
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("aadhaar",username);
        editor.putString("aadhaar-pass",password);
        editor.apply();
 */
        this.startActivity(new Intent(this, MainActivity.class));

        //LoginTask loginTask = new LoginTask(username,password,getApplicationContext(),this);
        //loginTask.execute();
        //loginButton.setEnabled(true);

    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    public boolean validate() {
        boolean valid = true;

        String password = passwordText.getText().toString();

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            passwordText.setError("Your password should be 4 to 10 alphanumeric characters long");
            valid = false;
        } else {
            passwordText.setError(null);
        }

        return valid;
    }
}