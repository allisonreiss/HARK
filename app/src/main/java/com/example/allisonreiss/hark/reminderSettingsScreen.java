package com.example.allisonreiss.hark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by veronica.lin1218 on 11/28/2017.
 */

public class reminderSettingsScreen extends AppCompatActivity {
    private NumberPicker numPicker;
    private TextView dosage, txtOften;
    private Button nextBtn, backBtn;
    private RadioButton dailyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reminder_settings_screen);
        numPicker = (NumberPicker) findViewById(R.id.numberPicker);
        dosage = (TextView) findViewById(R.id.txtDosage);
        nextBtn = (Button) findViewById(R.id.settingsNextBtn);
        dailyBtn = (RadioButton) findViewById(R.id.dailyBtn);
        backBtn = (Button) findViewById(R.id.backBtn);

        /**
         * Go back to home page
         */
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(reminderSettingsScreen.this, FinishedReminderScreen.class));
            }
        });
    }
}
