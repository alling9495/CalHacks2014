package com.themotlcode.stikit;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

/**
 * Created by Christopher on 10/4/2014.
 */
public class ColorPickerDialog extends Dialog implements View.OnClickListener {

    public ColorPickerDialog(Context context) {
        super(context);

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
        // determine which color was picked by view id
    }
}
