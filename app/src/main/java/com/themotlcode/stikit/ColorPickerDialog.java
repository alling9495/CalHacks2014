package com.themotlcode.stikit;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Christopher on 10/4/2014.
 */
public class ColorPickerDialog extends Dialog implements View.OnClickListener {

    private Context context;
    private EditText editText;
    public ColorPickerDialog(Context context, EditText editText) {
        super(context);
        this.context = context;
        this.editText = editText;
        setTitle("Stickit Color");
        setContentView(R.layout.color_picker);

        findViewById(R.id.imageWhite).setOnClickListener(this);
        findViewById(R.id.imageAqua).setOnClickListener(this);
        findViewById(R.id.imageBlue).setOnClickListener(this);
        findViewById(R.id.imageGreen).setOnClickListener(this);
        findViewById(R.id.imageGrey).setOnClickListener(this);
        findViewById(R.id.imageOrange).setOnClickListener(this);
        findViewById(R.id.imageRed).setOnClickListener(this);
        findViewById(R.id.imageYellow).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageWhite:
                StikitActivity.color = "#D0D0D0";
                editText.setBackground(new ColorDrawable(context.getResources().getColor(R.color.white)));
                break;
            case R.id.imageAqua:
                StikitActivity.color = "#77DDBB";
                editText.setBackground(new ColorDrawable(context.getResources().getColor(R.color.aqua)));
                break;
            case R.id.imageBlue:
                StikitActivity.color = "#66CCDD";
                editText.setBackground(new ColorDrawable(context.getResources().getColor(R.color.blue)));
                break;
            case R.id.imageGreen:
                StikitActivity.color = "#BBE535";
                editText.setBackground(new ColorDrawable(context.getResources().getColor(R.color.green)));
                break;
            case R.id.imageGrey:
                StikitActivity.color = "#B5C5C5";
                editText.setBackground(new ColorDrawable(context.getResources().getColor(R.color.grey)));
                break;
            case R.id.imageOrange:
                StikitActivity.color = "#FFBB22";
                editText.setBackground(new ColorDrawable(context.getResources().getColor(R.color.orange)));
                break;
            case R.id.imageRed:
                StikitActivity.color = "#F56545";
                editText.setBackground(new ColorDrawable(context.getResources().getColor(R.color.red)));
                break;
            case R.id.imageYellow:
                StikitActivity.color = "#EEEE22";
                editText.setBackground(new ColorDrawable(context.getResources().getColor(R.color.yellow)));
                break;
        }
        Log.e("Blake",StikitActivity.color);
        dismiss();
    }
}
