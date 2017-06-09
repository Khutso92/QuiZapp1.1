package com.khutso.quizapp11;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaring the Radio Buttun and Group
    RadioGroup rg;
    RadioButton rb;


    //Changes the  state of what  should displayed on then last question  of each category
    int viewScore = 0;

    //Enable and disable  the radio button holding the current answer
    Boolean onclickedOnce = true;

    //Holds the total score of each category
    public static int essential_question_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_main_menu);

     //   TextView underlineQueston =(TextView)findViewById(R.id.queston1);
       // underlineQueston.setPaintFlags(underlineQueston.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

    }

    //TODO////---------------------/////////////////--------------/////////////////////--------------/////////////////// ---- information Essential question

    //Messages of Essentail question 1 - 10
    String Essentail_msg_Q1 = "Pain is suffering or hurt ,so  HURT is essential element.Without hurt,there's no pain \n\n"
            + " A cut or a burn may cause pain ,but  so do many types of injuries.\n\n"
            + "A nuisance is a an annoyance that may or may not cause pain";

    String Essentail_msg_Q2 = "A gala indicates a celebration,the necessary element here\n\n"
            + " A tuxedo is not required garb at a gala nor is an appetizer\n\n"
            + "A gala may be held without the benefit of anyone speaking ";

    String Essentail_msg_Q3 = "The essential part of a monopoly is that involves exclusive owership or control";

    String Essentail_msg_Q4 = "A guitar does exist without strings, so strings are an essential part of a guitar\n\n"
            + " A band is not necessary a guitar.Guitar playing can be learned with a teacher.\n\n"
            + "Songs are byproducts of a guitar";

    String Essentail_msg_Q5 = "An electioin does not exist without voters.\n\n"
            + " The election of a president is a byproduct.Not all elections are held in March \n"
            + "nor are they nationwide";

    String Essentail_msg_Q6 = "All shoes have a sole of some sort. Not all shoes are made of leather\n\n"
            + "nor do they all have laces \n"
            + "Walking is not essential to a shoe";

    String Essentail_msg_Q7 = "Water is essential for swimming-without water, there is no swimming.\n\n" +
            " The other choices are things that may or may not be present";

    String Essentail_msg_Q8 = "Lighting is producted from a discharge of electricity,so electricity is essential \n\n"
            + " Thunder and rain are not essential to the production of lighting.\n\n"
            + "Brightness may be a byproduct od lighting ,but is not essential ";

    String Essentail_msg_Q9 = "Words are a necessary part of language\n\n"
            + " Slang is not necessary to language.Not all languages are written\n\n"
            + "Not all languages are spoken ";

    String Essentail_msg_Q10 = "Without students, a school cannot exist therefore students are the essential part of school.\n\n" +
            " The other choices may be related ,but they are not essential";


    //When the SHOW ANSWER Button is clicked in :Essential part Q 1 - 10
    public  void AnswerEPQ1(View view) {
        solution(Essentail_msg_Q1);
    }

    public void AnswerEPQ2(View view) {
        solution(Essentail_msg_Q2);
    }

    public void AnswerEPQ3(View view) {
        solution(Essentail_msg_Q3);
    }

    public void AnswerEPQ4(View view) {
        solution(Essentail_msg_Q4);
    }

    public void AnswerEPQ5(View view) {
        solution(Essentail_msg_Q5);
    }

    public void AnswerEPQ6(View view) {
        solution(Essentail_msg_Q6);
    }

    public void AnswerEPQ7(View view) {
        solution(Essentail_msg_Q7);
    }

    public void AnswerEPQ8(View view) {
        solution(Essentail_msg_Q8);
    }

    public void AnswerEPQ9(View view) {
        solution(Essentail_msg_Q9);
    }

    public void AnswerEPQ10(View view) {
        solution(Essentail_msg_Q10);

    }

    /**
     * Intenting to the essential part question 1
     */
    public  void essentialPart(View view) {
        setContentView(R.layout.essential_question1);
        ButtonHide();
    }

    /**
     * Intenting to the essential part question 1,when doing a second a attempt
     */

    public void retryAgain(View view) {
        essentialPart(view);
        viewScore = 0;
        onclickedOnce = true;
        essential_question_score = 0;
    }

    //logic of the Radio Group and Button for Essential Part Question 1 - 10
    public void EPQ1(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("hurt")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }
    }

    /**
     * Intent to the essential part question 2
     */

    public void NextToEPQ2(View view) {
        setContentView(R.layout.essential_question2);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Essential Part Question 2
    public void EPQ2(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("celebration")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
            /*CorrectDisplay();
            essential_question_score += 1;*/
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }
    }

    /**
     * Intent to the essential part question 3
     */

    void NextToEPQ3(View view) {
        setContentView(R.layout.essential_question3);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Essential Part Question 3
    void EPQ3(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("exclusive")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 1; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }
    }

    /**
     * Intent to the essential part question 4
     */

    public void NextToEPQ4(View view) {
        setContentView(R.layout.essential_question4);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Essential Part Question 4
    public void EPQ4(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("strings")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_4();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_4();
            ButtonShow();
        }
    }


    /**
     * Intent to the essential part question 5
     */
    public void NextToEPQ5(View view) {
        setContentView(R.layout.essential_question5);
        ButtonHide();
        onclickedOnce = true;
    }


    //logic of the Radio Group and Button for Essential Part Question 5
    public void EPQ5(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("voter")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }
    }

    /**
     * Intent to the essential part question 6
     */

    public void NextToEPQ6(View view) {
        setContentView(R.layout.essential_question6);
        ButtonHide();
        onclickedOnce = true;
    }


    //logic of the Radio Group and Button for Essential Part Question 5
    public void EPQ6(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("sole")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }
    }

    /**
     * Intent to the essential part question 7
     */
    public void NextToEPQ7(View view) {
        setContentView(R.layout.essential_question7);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Essential Part Question 7
    public void EPQ7(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("water")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on the " + answer + " option", Toast.LENGTH_SHORT).show();
                    lockAnswer_3();
                }
                onclickedOnce = true;
            }

        } else {
            IncorrectDisplay();
            lockAnswer_3();
            ButtonShow();
        }
    }

    /**
     * Intent to the essential part question 8
     */
    void NextToEPQ8(View view) {
        setContentView(R.layout.essential_question8);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Essential Part Question 8
    public void EPQ8(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("electricity")) {
            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }

    }

    /**
     * Intent to the essential part question 9
     */

    public void NextToEPQ9(View view) {
        setContentView(R.layout.essential_question9);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Essential Part Question 9
    public void EPQ9(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("words")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_4();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_4();
            ButtonShow();
        }
    }

    /**
     * Intent to the essential part question 10
     */

    public void NextToEPQ10(View view) {
        setContentView(R.layout.essential_question10);
        ButtonHide();
        viewScore = 1;
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Essential Part Question 9
    public  void EPQ10(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("student")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }

    }

    /**
     * intenting to the final screen
     */

    public void EP_score(View view) {
        setContentView(R.layout.score_essential);
        ButtonHide();

        TextView textView = (TextView) findViewById(R.id.diA);
        textView.setText(String.valueOf(CalculatePer(essential_question_score) + "%"));
    }

    /**
     * select aonther category ,to go the main activity
     */
    public void home(View view) {
        setContentView(R.layout.activity_main);
        viewScore = 0;
        onclickedOnce = true;
        essential_question_score = 0;
    }

    // TODO /////////////----------------/////////////////--------------/////////////////////--------------/////////////////// ---- information about Number series

    //Messages of Number Series question 1 - 10
    String NumberSeries_msg_Q1 = "This is an alternating number subtraction series.\n\nFirst, 2 is subtracted then 4 then 2 and so on";

    String NumberSeries_msg_Q2 = "In this alternating repetition series.\n\n The random number 21 is interpolated every other number into " +
            "an otherwise simple  addition  series\n\n that increases by 2 beginning with the number 9";

    String NumberSeries_msg_Q3 = "This alternation addition series begins with 3\n\nthen 1 is added to give 4 \n\nThen 3 is added to give 7 " +
            " then 1 is added and so on";

    String NumberSeries_msg_Q4 = "This is an series with a random \n number 8 is interpolated as every  other number.\n\n"
            + "In the series 6 is added to each number except\n 8 to arrive at the next number";

    String NumberSeries_msg_Q5 = "This is a simple alternating subtraction series \n\nwhich subtract 2 then 5";

    String NumberSeries_msg_Q6 = "In this addition series 1 is added to the first number.\n\n"
            + "2 is added  to the second number 3 is added to the third number \n\n"
            + " 4 is added to the fourth number\n and go on";

    String NumberSeries_msg_Q7 = "This is a simple subtraction series.\n\n" +
            "Each number is 35 less than the previous number";

    String NumberSeries_msg_Q8 = "This is an alternating addition and subtraction series\n\n"
            + "In this pattern , 10 is subtracted from each number to arrive at the arrive at the next.\n\n"
            + "In the second ,5 is added to each number to arrive at next";

    String NumberSeries_msg_Q9 = "In this simple subtraction series.\n\nEach number decreases by 0.4";

    String NumberSeries_msg_Q10 = "8 x 1 - 2 = 6 \n 6 x 2 -3 = 9 \n 9 x 3 -4 = 23 \n 23 x 4 - 5 = 87 \n 87 x 5 -6 = 429";


    //When the SHOW ANSWER Button is clicked in :Number series Q 1 - 10
    public  void AnswerNSQ1(View view) {
        solution(NumberSeries_msg_Q1);
    }

    public void AnswerNSQ2(View view) {
        solution(NumberSeries_msg_Q2);
    }

    public void AnswerNSQ3(View view) {
        solution(NumberSeries_msg_Q3);
    }

    public void AnswerNSQ4(View view) {
        solution(NumberSeries_msg_Q4);
    }

    public void AnswerNSQ5(View view) {
        solution(NumberSeries_msg_Q5);
    }

    public void AnswerNSQ6(View view) {
        solution(NumberSeries_msg_Q6);
    }

    public void AnswerNSQ7(View view) {
        solution(NumberSeries_msg_Q7);
    }

    public void AnswerNSQ8(View view) {
        solution(NumberSeries_msg_Q8);
    }

    public void AnswerNSQ9(View view) {
        solution(NumberSeries_msg_Q9);
    }

    public void AnswerNSQ10(View view) {
        solution(NumberSeries_msg_Q10);

    }

    /**
     * Intenting to the Number Series question 1
     */

    public void NumberSeries(View view) {
        setContentView(R.layout.number_series_question1);
        ButtonHide();
    }

    /**
     * Intenting to the Number Series question 1,when doing a second a attempt
     */

    public void retryAgainNumberSeries(View view) {
        NumberSeries(view);
        viewScore = 0;
        essential_question_score = 0;
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Number Series  Question 1 - 10
    public  void NSQ1(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("22")) {


            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }

                onclickedOnce = true;
            }

        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }
    }

    /**
     * Intent to the Number Series question 2
     */

    public void NextToNSQ2(View view) {
        setContentView(R.layout.number_series_question2);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Number Series  Question 2
    public void NSQ2(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("15")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }
                onclickedOnce = true;
            }

            /*CorrectDisplay();
            essential_question_score += 1;*/
        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }

    }

    /**
     * Intent to the Number Series question 3
     */
    public  void NextToNSQ3(View view) {
        setContentView(R.layout.number_series_question3);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Number Series Question 3
    public void NSQ3(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("15")) {


            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 1; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_4();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_4();
            ButtonShow();
        }
    }

    /**
     * Intent to the Number Series question 4
     */

    public void NextToNSQ4(View view) {
        setContentView(R.layout.number_series_question4);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Number Series Question 4
    public void NSQ4(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("34")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_4();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_4();
            ButtonShow();
        }
    }

    /**
     * Intent to the Number Series question 5
     */
    public void NextToNSQ5(View view) {
        setContentView(R.layout.number_series_question5);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Number Series Question 5
    public  void NSQ5(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("15")){
            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }
    }

    /**
     * Intent to the Number Series  question 6
     */
    public void NextToNSQ6(View view) {
        setContentView(R.layout.number_series_question6);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Number Series  Question 5
    public void NSQ6(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("211")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_4();
                }

                onclickedOnce = true;
            }

        } else {
            IncorrectDisplay();
            lockAnswer_4();
            ButtonShow();
        }
    }

    /**
     * Intent to the Number Series  question 7
     */
    public void NextToNSQ7(View view) {
        setContentView(R.layout.number_series_question7);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Number Series Question 7
    public void NSQ7(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("404")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on the " + answer + " option", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }

        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }

    }

    /**
     * Intent to the Number Series  question 8
     */
    public void NextToNSQ8(View view) {
        setContentView(R.layout.number_series_question8);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Number Series  Question 8
    public void NSQ8(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("20")) {
            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }

                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }
    }

    /**
     * Intent to the Number Series question 9
     */

    public void NextToNSQ9(View view) {
        setContentView(R.layout.number_series_question9);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Number Series Question 9
    public void NSQ9(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("3.6")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_4();
                }

                onclickedOnce = true;
            }

        } else {
            IncorrectDisplay();
            lockAnswer_4();
            ButtonShow();
        }

    }

    /**
     * Intent to the Number Series  question 10
     */
    public void NextToNSQ10(View view) {
        setContentView(R.layout.number_series_question10);
        ButtonHide();
        viewScore = 1;
    }

    //logic of the Radio Group and Button for Number Series  Question 10
    public  void NSQ10(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("429")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_4();
                }
                onclickedOnce = true;
            }

        } else {
            IncorrectDisplay();
            lockAnswer_4();
            ButtonShow();
        }

    }

    /**
     * intenting to the  Number series score screen
     */

    public void NS_score(View view) {
        setContentView(R.layout.score_number_series);
        ButtonHide();
        onclickedOnce = true;


        TextView textView = (TextView) findViewById(R.id.diA);
        textView.setText(String.valueOf(CalculatePer(essential_question_score) + "%"));
    }


    // TODO /////////////----------------/////////////////--------------/////////////////////--------------/////////////////// ---- information about Calendar

    //Messages of Number Series question 1 - 10
    String Calendar_msg_Q1 = "The year 2007 is an ordinary year.So, it has 1 odd day \n\n " +
            "1st day of the year 2007 was Monday\n\n" +
            "1st day of the year 2008 was Monday will day beyond Monday\n\n" +
            "Hence, it will be tuesday";

    String Calendar_msg_Q2 = "The year is leap year. So, it has 2 odd days\n\n " +
            "1st day of the year 2008 is Tuesday(Given)\n\n" +
            "So,1st day the year 2009 is 2 days beyond Tuesday\n\n" +
            "Hence, it will be Thursday";

    String Calendar_msg_Q3 = "The year 2006 is an ordinary year\n " +
            "So,it has 1 odd day\n\n" +
            "So, the day on tne 8th Dec, 2007 will be 1 day\n" +
            "beyond the day on 8th Dec, 2006.\n\n" +
            "But, 8th Dec, 2007 is Saturday.\n" +
            "8th Dec,2006 is Friday";

    String Calendar_msg_Q4 = "Count the number of odd days from the year" +
            "2007 onwards to get the sum equal to 0 odd days\n\n" +
            "Year :2007 2008 2009 2010 2011 2012 2013 2014 2015 2016 2017\n\n" +
            "Odd day 1 2 1 1 1 2 1 1 1 2 1\n\n" +
            "Sum:14 odd days 0 odd days.\n\n" +
            "Calender for the year 2018 will be be the same a for the year 2007";

    String Calendar_msg_Q5 = "The century by 400 is leap year.\n" +
            "The year 700 is not a leap year";

    String Calendar_msg_Q6 = "The year 2004 is a leap year. It has 2 odd days.\n\n" +
            "The day on 8th Feb.2004 is days before the day on 8th Feb ,2005\n\n" +
            "Hence, this day is Sunday";

    String Calendar_msg_Q7 = "x weeks x days = (7x + x)days = 8x days";

    String Calendar_msg_Q8 = "The year 2004 is a leap year.So, it has 2 odd days\n\n" +
            "But,Feb 2004 not included because we are calculating from March 2004 to March 2005. So it has 1 odd day only\n\n" +
            "The day on 6th March, 2005 will be 1 day beyond the day on 6th MARCH,2004. \n\n" +
            "Given that, 2004 is Sunday (1 day before to 6th March, 2005)";

    String Calendar_msg_Q9 = "Each day of the week is repeated after 7 days.\n\n" +
            "So,after 63 days,it will be Monday.\n\n" +
            "After 61 days,it will be Saturday";

    String Calendar_msg_Q10 = "On 31st December, 2005 it was Saturday.\n\n" +
            "Number of odd days from the year 2006 to the year of odd from the year 2006 to the year 2009 = (1+1+2+1)= 5\n\n" +
            "On 31st December 2009, it was Thursday\n\n" +
            "Thus,on 1st Jan,2010 it is Friday";


    //When the SHOW ANSWER Button is clicked in :Calendar Q 1 - 10
    public void AnswerCalendQ1(View view) {
        solution(Calendar_msg_Q1);
    }

    public void AnswerCalendQ2(View view) {
        solution(Calendar_msg_Q2);
    }

    public void AnswerCalendQ3(View view) {
        solution(Calendar_msg_Q3);
    }

    public void AnswerCalendQ4(View view) {
        solution(Calendar_msg_Q4);
    }

    public void AnswerCalendQ5(View view) {
        solution(Calendar_msg_Q5);
    }

    public void AnswerCalendQ6(View view) {
        solution(Calendar_msg_Q6);
    }

    public void AnswerCalendQ7(View view) {
        solution(Calendar_msg_Q7);
    }

    public void AnswerCalendQ8(View view) {
        solution(Calendar_msg_Q8);
    }

    public void AnswerCalendQ9(View view) {
        solution(Calendar_msg_Q9);
    }

    public  void AnswerCalendQ10(View view) {
        solution(Calendar_msg_Q10);

    }

    /**
     * Intenting to the Calender question 1
     */

    public void Calendar(View view) {
        setContentView(R.layout.calendar_question1);
        ButtonHide();
    }

    /**
     * Intenting to the Calendar question 1,when doing a second a attempt
     */

    public void retryAgainCalendar(View view) {
        Calendar(view);
        viewScore = 0;
        essential_question_score = 0;
    }


    //logic of the Radio Group and Button for Calender Question 1
    public void CalenderQ1(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("Tuesday")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }
    }

    /**
     * Intent to the Calendar question 2
     */

    public void NextToCalQ2(View view) {
        setContentView(R.layout.calendar_question2);
        ButtonHide();


        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Calender Question 2
    public void CalenderQ2(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("Thursday")) {
                        //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }

    }

    /**
     * Intent to the Calendar question 3
     */

    public void NextToCalQ3(View view) {
        setContentView(R.layout.calendar_question3);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Calender Question 3
    public void CalenderQ3(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("Friday")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }

    }

    /**
     * Intent to the Calendar question 4
     */

    public void NextToCalQ4(View view) {
        setContentView(R.layout.calendar_question4);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Calender Question 4
    public void CalenderQ4(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("2018")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }

    }

    /**
     * Intent to the Calendar question 5
     */

    public void NextToCalQ5(View view) {
        setContentView(R.layout.calendar_question5);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Calender Question 5
    public void CalenderQ5(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        if (answer.equals("700")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_4();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_4();
            ButtonShow();
        }

    }

    /**
     * Intent to the Calendar question 6
     */

    public void NextToCalQ6(View view) {
        setContentView(R.layout.calendar_question6);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Calender Question 6
    public void CalenderQ6(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        if (answer.equals("Sunday")) {


            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_3();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_3();
            ButtonShow();
        }

    }

    /**
     * Intent to the Calendar question 7
     */

    public void NextToCalQ7(View view) {
        setContentView(R.layout.calendar_question7);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Calender Question 7
    public void CalenderQ7(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("8x")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }

    }

    /**
     * Intent to the Calendar question 8
     */

    public void NextToCalQ8(View view) {
        setContentView(R.layout.calendar_question8);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Calender Question 8
    public void CalenderQ8(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("Sunday")) {


            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_3();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_3();
            ButtonShow();
        }

    }


    /**
     * Intent to the Calendar question 9
     */

    public  void NextToCalQ9(View view) {
        setContentView(R.layout.calendar_question9);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Calender Question 8
    public void CalenderQ9(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("Saturday")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }

    }

    /**
     * Intent to the Calendar question 10
     */

    public void NextToCalQ10(View view) {
        setContentView(R.layout.calendar_question10);
        ButtonHide();
        viewScore = 1;
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for Calender Question 10
    public void CalenderQ10(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("Friday")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_4();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_4();
            ButtonShow();
        }

    }

    /**
     * intenting to the  Calendar screen final screen
     */
    public void calendar_score(View view) {
        setContentView(R.layout.score_calendar);
        ButtonHide();

        TextView textView = (TextView) findViewById(R.id.diA);
        textView.setText(String.valueOf(CalculatePer(essential_question_score) + "%"));
    }

    // TODO /////////////----------------/////////////////--------------/////////////////////--------------/////////////////// ---- information about sentence formation

    //Messages of Verbal Classification question 1 - 10
    String verbal_msg_Q1 = "An index, glossary and chapter are all parts of a book.\n\n" +
            "Choice a does not belong because the book is the whole, not a part";

    String verbal_msg_Q2 = "The cornea, retina and pupil are parts of the eye";

    String verbal_msg_Q3 = "The couch, table and chair are pieces of furniture.\n\n" +
            "The rug is not";

    String verbal_msg_Q4 = "A leopard,cougar and lion all belong to the cat family\n\n" +
            "An elephant does not";

    String verbal_msg_Q5 = "The yarn, twine and cord are all used for trying.\n\n" +
            "The tape is not used in the same way";

    String verbal_msg_Q6 = "The guitar, violin and cello are stringed instruments\n\n" +
            "The flute is a wind instrument";

    String verbal_msg_Q7 = "Dodge, duck and avoid are all synonyms meaning to evade\n\n " +
            "Flee means to run away from.";

    String verbal_msg_Q8 = "A branch, leaf and root are all the parts of tree\n\n" +
            "The dirt underneath is not a part of the tree.";

    String verbal_msg_Q9 = "Heading, body and closing are closing are all parts of a letter.\n\n" +
            "The letter is the whole, not a part";

    String verbal_msg_Q10 = "Tulip, rose daisy are all types of flowers.\n\n" +
            "A bud is not";

    //When the (SHOW ANSWER )Button is clicked in :Verbal Classification Q 1 - 10
    public void AnswerVerbalQ1(View view) {
        solution(verbal_msg_Q1);
    }

    public void AnswerVerbalQ2(View view) {
        solution(verbal_msg_Q2);
    }

    public void AnswerVerbalQ3(View view) {
        solution(verbal_msg_Q3);
    }

    public void AnswerVerbalQ4(View view) {
        solution(verbal_msg_Q4);
    }

    public void AnswerVerbalQ5(View view) {
        solution(verbal_msg_Q5);
    }

    public void AnswerVerbalQ6(View view) {
        solution(verbal_msg_Q6);
    }

    public void AnswerVerbalQ7(View view) {
        solution(verbal_msg_Q7);
    }

    public void AnswerVerbalQ8(View view) {
        solution(verbal_msg_Q8);
    }

    public void AnswerVerbalQ9(View view) {
        solution(verbal_msg_Q9);
    }

    public void AnswerVerbalQ10(View view) {
        solution(verbal_msg_Q10);

    }

    /**
     * Intenting to the Verbal Classification question 1
     */

    public void verbal_classification(View view) {
        setContentView(R.layout.verbal_classification_question1);
        ButtonHide();
    }

    /**
     * Intenting to the verbal classification question 1,when doing a second a attempt
     */

    public void retryAgainVerbal(View view) {
        verbal_classification(view);

        this.viewScore = 0; //Resetting to display next question on the Toast
        this.essential_question_score = 0; //Resetting the score to zero for replaying the game
    }

    //logic of the Radio Group and Button for verbal classification Question 1
    public void VerbalQ1(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("book")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }
    }

    /**
     * Intenting to the Verbal Classification question 2
     */

    public void NextToVerbalQ2(View view) {
        setContentView(R.layout.verbal_classification_question2);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for verbal classification Question 2
    public void VerbalQ2(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        if (answer.equals("vision")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_4();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_4();
            ButtonShow();
        }
    }


    /**
     * Intenting to the Verbal Classification question 3
     */

    public void NextToVerbalQ3(View view) {
        setContentView(R.layout.verbal_classification_question3);
        ButtonHide();
        onclickedOnce = true;
    }


    //logic of the Radio Group and Button for verbal classification Question 3
    public  void VerbalQ3(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("rug")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }
    }

    /**
     * Intenting to the Verbal Classification question 4
     */

    public void NextToVerbalQ4(View view) {
        setContentView(R.layout.verbal_classification_question4);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for verbal classification Question 4
    public void VerbalQ4(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value

        if (answer.equals("elephant")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_3();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_3();
            ButtonShow();
        }
    }

    /**
     * Intenting to the Verbal Classification question 5
     */

    public void NextToVerbalQ5(View view) {
        setContentView(R.layout.verbal_classification_question5);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for verbal classification Question 5
    public void VerbalQ5(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("tape")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_1();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_1();
            ButtonShow();
        }
    }

    /**
     * Intenting to the Verbal Classification question 6
     */

    public void NextToVerbalQ6(View view) {
        setContentView(R.layout.verbal_classification_question6);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for verbal classification Question 6
    public void VerbalQ6(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("flute")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }
    }

    /**
     * Intenting to the Verbal Classification question 7
     */

    public void NextToVerbalQ7(View view) {
        setContentView(R.layout.verbal_classification_question7);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for verbal classification Question 7
    public void VerbalQ7(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("flee")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }
    }

    /**
     * Intenting to the Verbal Classification question 8
     */

    public void NextToVerbalQ8(View view) {
        setContentView(R.layout.verbal_classification_question8);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for verbal classification Question 8
    public void VerbalQ8(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("dirt")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_2();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_2();
            ButtonShow();
        }
    }

    /**
     * Intenting to the Verbal Classification question 9
     */

    public void NextToVerbalQ9(View view) {
        setContentView(R.layout.verbal_classification_question9);
        ButtonHide();
        onclickedOnce = true;
    }

    //logic of the Radio Group and Button for verbal classification Question 9
    public  void VerbalQ9(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("letter")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_3();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_3();
            ButtonShow();
        }
    }

    /**
     * Intenting to the Verbal Classification question 10
     */

    public void NextToVerbalQ10(View view) {
        setContentView(R.layout.verbal_classification_question10);
        ButtonHide();
        onclickedOnce = true;
        viewScore = 1;
    }

    //logic of the Radio Group and Button for verbal classification Question 10
    public void VerbalQ10(View view) {

        //Referencing the RadioGroup from the XML id
        rg = (RadioGroup) findViewById(R.id.rggroup);

        //Getting the ID of the Radio Buttin that was Clicked
        int radioButton = rg.getCheckedRadioButtonId();

        //Referencing the RadioButton from the XML id ,which was clicked
        rb = (RadioButton) findViewById(radioButton);

        //Getting the name(text) of the Radio Button
        String answer = rb.getText().toString();

        //Comparing the clicked Radio Button (Text) with the correct value
        //
        if (answer.equals("bud")) {

            //TRYING TO MAKE THIS A METHOD
            if (onclickedOnce == true) {
                CorrectDisplay();
                onclickedOnce = false;
                essential_question_score += 1;
            } else {

                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, "You can only tab once on a radio button ", Toast.LENGTH_SHORT).show();
                    lockAnswer_3();
                }
                onclickedOnce = true;
            }
        } else {
            IncorrectDisplay();
            lockAnswer_3();
            ButtonShow();
        }
    }

    /**
     * intenting to the final screen of verbal classification
     */

    public void verbal_score(View view) {
        setContentView(R.layout.score_verbal_classification);
        ButtonHide();

        TextView textView = (TextView) findViewById(R.id.diA);
        textView.setText(String.valueOf(CalculatePer(essential_question_score) + "%"));
    }



    public void call_new_Man(View view) {
        setContentView(R.layout.new_main_menu);
    }

















    /**
     * Creating my methods Zone
     */
    //Disabling the correct   RadioButton  if the user choose an wrong answer
    //Q 1 - 10
    public void lockAnswer_1() {
        RadioButton lock = (RadioButton) findViewById(R.id.numberSeriesQ1_correct);
        lock.setEnabled(false);
        lock.setTextColor(Color.GREEN);
    }

    public void lockAnswer_2() {
        RadioButton lock = (RadioButton) findViewById(R.id.numberSeriesQ1_incorrect1);
        lock.setEnabled(false);
        lock.setTextColor(Color.GREEN);
    }

    public void lockAnswer_3() {
        RadioButton lock = (RadioButton) findViewById(R.id.numberSeriesQ1_incorrect2);
        lock.setEnabled(false);
        lock.setTextColor(Color.GREEN);
    }

    public void lockAnswer_4() {
        RadioButton lock = (RadioButton) findViewById(R.id.numberSeriesQ1_incorrect3);
        lock.setEnabled(false);
        lock.setTextColor(Color.GREEN);
    }


    //Making the Hide answer
    void ButtonHide() {
        Button showAnswer = (Button) findViewById(R.id.showAnswer);
        showAnswer.setVisibility(View.INVISIBLE);
    }

    //Making the show answer
    public void ButtonShow() {
        Button showAnswer = (Button) findViewById(R.id.showAnswer);
        showAnswer.setVisibility(View.VISIBLE);
    }

    //Showing the correct answer to the user
    //Alert Dialog Box
    public void solution(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("solution");
        builder.setMessage(msg);

        builder.setPositiveButton("GOT IT? ,IF YES PRESS HERE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                if (viewScore == 0) {
                    Toast.makeText(MainActivity.this, "Press NEXT QUESTION to continue", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Press VIEW SCORE to see  your results ", Toast.LENGTH_SHORT).show();
                }
                ButtonHide();
            }
        });
        builder.show();
    }

    //When user choose a CORRECT answer this should be displayed
    public void CorrectDisplay() {
        TextView txt_results = (TextView) findViewById(R.id.txt_results);
        txt_results.setTextColor(Color.parseColor("#00ff00"));
        txt_results.setText("correct answer");
        rb.setTextColor(Color.GREEN);
        Toast.makeText(this, "1 point earned", Toast.LENGTH_SHORT).show();
    }

    //When user choose a INCORRECT answer this should be displayed
     public void  IncorrectDisplay() {
        TextView txt_results = (TextView) findViewById(R.id.txt_results);
        txt_results.setTextColor(Color.parseColor("#ff0000"));
        txt_results.setText("incorrect answer");
        rb.setTextColor(Color.RED);
    }

    //calculating the percentage ranging from 0 - 100%
    //@param final score
   public int CalculatePer(int finalScore) {
        double per = (((double) finalScore / 10.0) * 100);
        return (int) per;
    }


    public void upcomingCategory(View view){
        Toast.makeText(this, "ERROR : unable to load the categories", Toast.LENGTH_LONG).show();
    }

}




