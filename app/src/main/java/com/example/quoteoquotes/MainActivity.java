package com.example.quoteoquotes;

import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.quoteoquotes.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button shuffleButton;
    private String[] texts = {"Be the change that you wish to see in the world.", "You only live once, but if you do it right, once is enough.", "A room without books is like a body without a soul.", "So many books, so little time.","Have a nice day!","Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.","I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best.","Be yourself; everyone else is already taken.!"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        shuffleButton = findViewById(R.id.shuffleButton);

        // Set initial text
        textView.setText(texts[0]);

        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Shuffle the array
                shuffleArray(texts);
                // Update the text view with the new text
                textView.setText(texts[0]);
            }
        });
    }
    // Method to shuffle the array
    private void shuffleArray(String[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

}