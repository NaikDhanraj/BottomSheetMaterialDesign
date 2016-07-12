package com.dssp.bottomsheetmaterialdesign;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bottomSheetButton = (Button)findViewById(R.id.open_close_sheet);
        bottomSheetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBottomSheet();
            }
        });

    }

    public void openBottomSheet() {
        View view = getLayoutInflater().inflate(R.layout.item_bottom_sheet, null);
        ImageView saveIcon = (ImageView)view.findViewById(R.id.save);
        ImageView editIcon = (ImageView)view.findViewById(R.id.edit);
        ImageView printIcon = (ImageView)view.findViewById(R.id.print);
        ImageView shareIcon = (ImageView)view.findViewById(R.id.share);
        final Dialog mBottomSheetDialog = new Dialog(MainActivity.this, R.style.MaterialDialogSheet);
        mBottomSheetDialog.setContentView(view);
        mBottomSheetDialog.setCancelable(true);
        mBottomSheetDialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        mBottomSheetDialog.getWindow().setGravity(Gravity.BOTTOM);
        mBottomSheetDialog.show();
        saveIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Saving...", Toast.LENGTH_LONG).show();
                mBottomSheetDialog.dismiss();
            }
        });
        editIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Editing...", Toast.LENGTH_LONG).show();
                mBottomSheetDialog.dismiss();
            }
        });
        printIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Printing...", Toast.LENGTH_LONG).show();
                mBottomSheetDialog.dismiss();
            }
        });
        shareIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sharing...", Toast.LENGTH_LONG).show();
                mBottomSheetDialog.dismiss();
            }
        });
    }
}
