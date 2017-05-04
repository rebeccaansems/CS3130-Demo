package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.b_Submit);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText mEdit = (EditText)findViewById(R.id.t_Edit);
                TextView mText = (TextView)findViewById(R.id.t_TextFinal);

                String newText = mEdit.getText().toString();

                mText.setText(newText);
            }
        });
    }
}
