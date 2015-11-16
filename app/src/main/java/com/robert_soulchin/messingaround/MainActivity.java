package com.robert_soulchin.messingaround;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button answerYesButton, answerNoButton;
    private EditText usersNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerYesButton = (Button ) findViewById(R.id.answer_yes_button);
        answerNoButton = (Button) findViewById(R.id.answer_no_button);
        usersNameEditText = (EditText) findViewById(R.id.users_name_edit_text);
    }

    public void onYesButtonClick(View view) {
        String usersName = String.valueOf(usersNameEditText.getText());

        String yourYesResponse = "that is great " + usersName;

        Toast.makeText(this, yourYesResponse, Toast.LENGTH_LONG).show();
    }

    public void onNoButtonClick(View view) {
        String usersName = String.valueOf(usersNameEditText.getText());

        String yourNoResponse = "To bad " + usersName;

        Toast.makeText(this, yourNoResponse, Toast.LENGTH_LONG).show();
    }
}
