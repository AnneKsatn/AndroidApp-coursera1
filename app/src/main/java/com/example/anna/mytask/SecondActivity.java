package com.example.anna.mytask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    public static String NEW_TEXT="NEW_TEXT";
   private TextView mText;
   private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_second);

        mText=findViewById(R.id.tvText);
        mButton=findViewById(R.id.button2);

        Bundle bundle = getIntent().getExtras();
        mText.setText(bundle.getString(NEW_TEXT));

    }

}
