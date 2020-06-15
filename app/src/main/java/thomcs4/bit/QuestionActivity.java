package thomcs4.bit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private String[] q;
    private Questions questions;
    private int qIndex = 0;
    private int score = 0;
    private Boolean firstAttempt = true;
    private boolean[] qResults = new boolean[10];
//    private boolean[] qResults = {true, false, true, true ,true, false, false ,false ,false, true};

    private Button option1;
    private Button option2;
    private Button option3;
    private Button option4;
    private TextView questionInfo;
    private ImageView picture;
    private AlertDialog.Builder answerDesc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
//         q = getApplicationContext().getResources().getStringArray(R.array.questions);
        questions = new Questions();
//        Declaring objects on questions page.
        questionInfo = findViewById(R.id.questionTitle);
        picture = findViewById(R.id.questionPicture);
        option1 = findViewById(R.id.o1);
        option1.setOnClickListener(this);
        option2 = findViewById(R.id.o2);
        option2.setOnClickListener(this);
        option3 = findViewById(R.id.o3);
        option3.setOnClickListener(this);
        option4 = findViewById(R.id.o4);
        option4.setOnClickListener(this);
        answerDesc = new AlertDialog.Builder(this).setCancelable(false);
        loadQuestion();
    }

    private void loadQuestion() {
        if (qIndex < questions.getLength()) {
            questionInfo.setText(questions.getQuestion(qIndex));
            option1.setText(questions.getOption(qIndex, 1));
            option2.setText(questions.getOption(qIndex, 2));
            option3.setText(questions.getOption(qIndex, 3));
            option4.setText(questions.getOption(qIndex, 4));
            picture.setImageResource(questions.getImage(qIndex));
        } else {
            Intent changeActivity = new Intent(QuestionActivity.this, ResultsActivity.class);
            changeActivity.putExtra("results-array", qResults);
            startActivity(changeActivity);
        }

    }

    @Override
    public void onClick(View view) {

        Button clicked = (Button) view;
        if (clicked.getText().equals(questions.getAnswer(qIndex))){
            clicked.setBackgroundColor(Color.GREEN);
            showDesc();
            clicked.setBackgroundResource(R.drawable.roundedbuttoncorrect);
            if (firstAttempt) {
                score++;
                qResults[qIndex] = true;
            }
            qIndex++;
        }
        else {
            clicked.setBackgroundResource(R.drawable.roundedbuttonincorrect);
            firstAttempt = false;
        }

    }


    private void showDesc(){
        //creates a pop up message with answer.
        answerDesc.setMessage(questions.getAnswerDesc(qIndex))
                .setTitle("Answer: " + questions.getAnswer(qIndex))
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        //resets buttons to normal format.
                        clearButtons();
                        //loads next question.
                        firstAttempt = true;
                        loadQuestion();
                    }
                })
                .create();
        answerDesc.show();
    }

    private void clearButtons() {
        option1.setBackgroundResource(R.drawable.roundedbutton);
        option2.setBackgroundResource(R.drawable.roundedbutton);
        option3.setBackgroundResource(R.drawable.roundedbutton);
        option4.setBackgroundResource(R.drawable.roundedbutton);
    }

}
