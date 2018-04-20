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
   private  int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//al cambiar o rotal arreglar
            if (savedInstanceState != null){
                mStoryIndex = savedInstanceState.getInt("mStoryIndex");

            }
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBottom = findViewById(R.id.buttonBottom);
        mStoryIndex = 1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
         buttonTop.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 if (mStoryIndex == 1) {
                     updateViewTextButton(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2
                     ,3,View.VISIBLE);
                 }
                 else if(mStoryIndex == 3){
                     //disaneble buttons
                     updateViewTextButton(R.string.T6_End,2,View.GONE);
                 }else if(mStoryIndex == 2) {
                     updateViewTextButton(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2
                             ,3,View.VISIBLE);
                 }

             }
         });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
         buttonBottom.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (mStoryIndex == 1) {
                     updateViewTextButton(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2
                             ,2,View.VISIBLE);
                 }else if(mStoryIndex == 3){
                     //disaneble buttons
                     updateViewTextButton(R.string.T5_End,5,View.GONE);
                 }
                 else if(mStoryIndex == 2){
                     //disaneble buttons
                     updateViewTextButton(R.string.T4_End,4,View.GONE);
                 }
             }
         });





    }
    private void updateViewTextButton(int text, int btnTop, int btnBottom,int straStory,int visiButon){

        storyTextView.setText(text);
        buttonTop.setText(btnTop);
        buttonBottom.setText(btnBottom);
        mStoryIndex = straStory;
        buttonTop.setVisibility(visiButon);
        buttonBottom.setVisibility(visiButon);

    }

    private void updateViewTextButton(int text, int straStory,int visiButon){

        storyTextView.setText(text);
        mStoryIndex = straStory;
        buttonTop.setVisibility(visiButon);
        buttonBottom.setVisibility(visiButon);

    }

   @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putInt("mStoryIndex",mStoryIndex);

   }

}
