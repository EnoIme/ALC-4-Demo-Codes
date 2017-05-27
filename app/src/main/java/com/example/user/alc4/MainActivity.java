package com.example.user.alc4;

import android.content.*;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView thanks = (TextView) findViewById(R.id.text);
        final EditText name = (EditText) findViewById(R.id.et_name);
        Button submit = (Button) findViewById(R.id.sumbit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = name.getText().toString();

                if ( value != null && !value.isEmpty()){
                    thanks.setText(value);
                } else {

                    Snackbar.make(name, "Here is a SnackBar", Snackbar.LENGTH_LONG)
                            .setAction("Go to", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(MainActivity.this, Detail.class);
                                    intent.putExtra("name", "Happy");
                                    startActivity(intent);
                                }
                            }).show();
                }
            }
        });



    }
}
