package com.jiuzhang.guojing.yo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 5 get View using findViewById
        // get the EditText, the Button and the TextView using findViewById
        final EditText text = (EditText) findViewById( R.id.editText );
        final Button button = (Button) findViewById( R.id.button );
        final TextView showText = (TextView) findViewById( R.id.text_view );
        // TODO 6 set OnClickListener of Button
        // set the OnClickListener of the button so that when the button is clicked,
        // your program should set the text of TextView to be the value of the EditText
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String str = text.getText().toString();
                showText.setText(str);
            }
        });
    }
}
