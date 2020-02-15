package com.example.dynamicdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnDefault, btnError, btnSuccess, btnInfo, btnPrimary, btnWarning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDefault = findViewById(R.id.btnDefault);
        btnError = findViewById(R.id.btnDanger);
        btnSuccess = findViewById(R.id.btnSuccess);
        btnInfo = findViewById(R.id.btnInfo);
        btnPrimary = findViewById(R.id.btnPrimary);
        btnWarning = findViewById(R.id.btnWarning);

        btnDefault.setOnClickListener(this);
        btnError.setOnClickListener(this);
        btnSuccess.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
        btnPrimary.setOnClickListener(this);
        btnWarning.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnDefault:
                DynamicDialog dialogDefault = new
                        DynamicDialog("Warning!",
                        "wag pasaway pag ginama mo to papalutin kita sa pwet",
                        R.drawable.ic_default, true);
                dialogDefault.show(getSupportFragmentManager(), null);
                break;
            case R.id.btnDanger:
                DynamicDialog dialogDanger = new DynamicDialog("Danger!",
                        "lorem ipsum lol cute ko talaga thanks!",
                        R.drawable.ic_error, false);
                dialogDanger.show(getSupportFragmentManager(), null);
                break;
            case R.id.btnSuccess:
                DynamicDialog dialogSuccess = new DynamicDialog("Danger!",
                        "lorem ipsum lol cute ko talaga thanks!",
                        R.drawable.ic_success, false);
                dialogSuccess.show(getSupportFragmentManager(), null);
                break;
            case R.id.btnInfo:
                DynamicDialog dialogInfo = new DynamicDialog("Danger!",
                        "lorem ipsum lol cute ko talaga thanks!",
                        R.drawable.ic_info, true);
                dialogInfo.show(getSupportFragmentManager(), null);
                break;
            case R.id.btnPrimary:
                DynamicDialog dialogPrimary = new DynamicDialog("Danger!",
                        "lorem ipsum lol cute ko talaga thanks!",
                        R.drawable.ic_idea, true);
                dialogPrimary.show(getSupportFragmentManager(), null);

                break;
            case R.id.btnWarning:
                DynamicDialog dialogWarning = new DynamicDialog("Danger!",
                        "lorem ipsum lol cute ko talaga thanks!",
                        R.drawable.ic_warning, false);
                dialogWarning.show(getSupportFragmentManager(), null);

                break;

        }

    }

}
