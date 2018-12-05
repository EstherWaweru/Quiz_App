package com.example.estherwaweru.quiz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void firstQuestion(){
        RadioButton question1=(RadioButton) findViewById(R.id.radio_android);
        if (question1.isChecked()){
            result+=10;
        }
    }
    public void secondQuestion(){
        RadioButton secondQuestion=(RadioButton) findViewById(R.id.radio_linear);
        if(secondQuestion.isChecked()){
            result+=10; }
    }
    public void thirdQuestion(){
        EditText mEdittext=(EditText) findViewById(R.id.edittext_answer);
        String answer=mEdittext.getText().toString();
        String ans="Xcode";
        if(answer.trim().equalsIgnoreCase(ans)) {
            result+=10;}
    }

    public void fourthQuestion(){

        CheckBox box1=(CheckBox)findViewById(R.id.vertical_checkbox);
        CheckBox box2=(CheckBox) findViewById(R.id.horizontal_checkbox);
        CheckBox box3=(CheckBox) findViewById(R.id.relative_checkbox);
        if(box1.isChecked() && box2.isChecked() && !box3.isChecked()){
            result+=10;
        }
    }
    public void fifthQuestion(){

        CheckBox textStle=(CheckBox) findViewById(R.id.textstyle_checkbox);
        CheckBox textVisible=(CheckBox) findViewById(R.id.textvisibility_checkbox);
        CheckBox orientation=(CheckBox) findViewById(R.id.orientation_checkbox);
        if(textStle.isChecked() && textVisible.isChecked() && !orientation.isChecked()){
            result+=10;
        }
    }
    /*This method is for checking the answer given and uses a Toast message to
    display final results*/
    public void submitAnswers(View view){
        result=0;
        firstQuestion();
        secondQuestion();
        thirdQuestion();
        fourthQuestion();
        fifthQuestion();

        String grade="Thanks for attempting the quiz,Your score is:"+result;

        Toast toast=Toast.makeText(this,grade,Toast.LENGTH_SHORT);
        toast.show(); }

    //The retryTest resets all the input fields so that one can attempt the quiz again.
    public void retryTest(View view){
        result=0;
        RadioButton rad1=(RadioButton) findViewById(R.id.radio_android);
        rad1.setChecked(false);
        RadioButton radi2=(RadioButton) findViewById(R.id.radio_Xcode);
        radi2.setChecked(false);
        RadioButton rad3=(RadioButton) findViewById(R.id.radio_linear);
        rad3.setChecked(false);
        RadioButton rad4=(RadioButton) findViewById(R.id.radio_horizontal);
        rad4.setChecked(false);
        RadioButton rad5=(RadioButton) findViewById(R.id.radio_vertical);
        rad5.setChecked(false);
        CheckBox cbox1=(CheckBox) findViewById(R.id.horizontal_checkbox);
        cbox1.setChecked(false);
        CheckBox cbox2=(CheckBox) findViewById(R.id.vertical_checkbox);
        cbox2.setChecked(false);
        CheckBox cbox3=(CheckBox) findViewById(R.id.orientation_checkbox);
        cbox3.setChecked(false);
        CheckBox cbox4=(CheckBox) findViewById(R.id.relative_checkbox);
        cbox4.setChecked(false);
        CheckBox cbox5=(CheckBox) findViewById(R.id.textstyle_checkbox);
        cbox5.setChecked(false);
        CheckBox cbox6=(CheckBox) findViewById(R.id.textvisibility_checkbox);
        cbox6.setChecked(false);
        EditText text=(EditText) findViewById(R.id.edittext_answer);
        text.setText("");
    }
}
