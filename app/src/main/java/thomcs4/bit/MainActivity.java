package thomcs4.bit;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Runs the home screen on the app, shows logo and start quiz
 * button.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Creates the activity and defines the startButton and assigns
     * the listener.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startB = findViewById(R.id.startButton);
        startB.setOnClickListener(new ButtonClickHandler());
    }

    /**
     * The button click handler listens for the startButton to be clicked,
     * when it is, switch to a new activity (which is the QuestionActivity)
     */
    public class ButtonClickHandler implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.startButton)
            {
                Intent changeActivity = new Intent(MainActivity.this, QuestionActivity.class);
                startActivity(changeActivity);
            }
        }
    }
}
