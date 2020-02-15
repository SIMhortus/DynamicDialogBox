package com.example.dynamicdialogbox;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DynamicDialog extends AppCompatDialogFragment implements View.OnClickListener{

    Button btnPos, btnNeg;
    ImageView dialogIcon;
    TextView txtTitle, txtDesc;
    LinearLayout dialogLayoutButton;

    String title, desc;
    Boolean noCancelButton;
    int icon;

    public DynamicDialog(String title, String desc, int icon, boolean noCancelButton) {

        this.title = title;
        this.desc = desc;
        this.icon = icon;
        this.noCancelButton = noCancelButton;

    }

    public DynamicDialog() { }


    @Nullable
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dynamic_dialog, null);
        builder.setView(view);

        txtTitle = view.findViewById(R.id.dialogTitle);
        txtDesc = view.findViewById(R.id.dialogMessage);
        btnNeg = view.findViewById(R.id.btnNeg);

        dialogIcon = view.findViewById(R.id.dialogImage);
        dialogLayoutButton = view.findViewById(R.id.dialogLayoutButton);

        txtTitle.setText(this.title);
        txtDesc.setText(this.desc);
        dialogIcon.setImageResource(this.icon);


        if (this.noCancelButton == true) {
            btnNeg.setVisibility(view.GONE);
        }


        return builder.create();
    }

    @Override
    public void onClick(View v) {

    }

}
