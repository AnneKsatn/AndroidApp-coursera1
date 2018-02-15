package com.example.anna.mytask;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;


public class FindActivity extends AppCompatActivity {


    public static String NEW_TEXT="NEW_TEXT";
   private TextView mText;
   private Button mButton;
   String s = "https://www.google.ru/search?q=";


    private View.OnClickListener mFindInGoogle = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                Intent BrowseIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse(s));
                startActivity(BrowseIntent);
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_find);

        mText=findViewById(R.id.tvFindText);
        mButton=findViewById(R.id.btFindInGoogle);

        Bundle bundle = getIntent().getExtras();
        mText.setText(bundle.getString(NEW_TEXT));
        s=s+(bundle.getString(NEW_TEXT));
        mButton.setOnClickListener(mFindInGoogle);

    }

}
