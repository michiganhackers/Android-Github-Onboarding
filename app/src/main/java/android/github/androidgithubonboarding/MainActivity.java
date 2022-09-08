package android.github.androidgithubonboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mainButton = findViewById(R.id.generate);
        ArrayList<String> names = new ArrayList<>();
        //Todo add name to names arraylist like in lines 22 and 23
        names.add("Siddharth");
        names.add("Caleb");
        names.add("Caleb Gifford");
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = names.get((int)(Math.random() * names.size()));
                Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
            }
        });
    }
}