package com.example.vinnujanu.myap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cameraopen(View view) {
        EditText Rollo=(EditText)findViewById(R.id.input_rollnumber);
        String Roll=Rollo.getText().toString();
        EditText course=(EditText)findViewById(R.id.input_COURSE);
        String Course=course.getText().toString();
        if(!Roll.isEmpty()&&!Course.isEmpty()) {
            Intent camera = new Intent(this, camera.class);
            camera.putExtra("Roll", Roll);
            camera.putExtra("Course", Course);
            startActivity(camera);
        }

    }
}
