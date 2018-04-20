package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
   private TextView  storyTextView ;
   private Button  buttonTop;
   private  Button  buttonBottom;
   private  int trackStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBottom = findViewById(R.id.buttonBottom);
        trackStory = 1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
         buttonTop.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 if (trackStory == 1) {
                     updateViewTextButton(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2
                     ,3);
                 }

             }
         });
         buttonBottom.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
    private void updateViewTextButton(int text, int btnTop, int btnBottom,int straStory){

        storyTextView.setText(text);
        buttonTop.setText(btnTop);
        buttonBottom.setText(btnBottom);
        trackStory = straStory;

    }



}
