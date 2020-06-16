package thomcs4.bit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * The resultsactivity class is used to display the correct and incorrect
 * guesses.
 */
public class ResultsActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean[] qResults;

    /**
     * Used to define the home button and textview It also gets the intent which is the array filled with true and false
     * options depending if they guessed the question correctly.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Button homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(this);
        Intent intent = getIntent();
        qResults = intent.getBooleanArrayExtra("results-array");
        showResults();
    }

    /**
     * Button listener for the home button,
     * when clicked it sends the user back to the home page.
     * @param view
     */
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.homeButton)
        {
            Intent changeActivity = new Intent(ResultsActivity.this, MainActivity.class);
            startActivity(changeActivity);
        }
    }

    /**
     * The showResults method cycles through qResults boolean array
     * and appends to a string if the question they quessed was correct or not.
     */
    public void showResults() {
        int counter = 0;
        String data = "";
        for (int r = 0 ; r < qResults.length; r++) {
            int updated = r + 1;
            //if correct
            if (qResults[r]) {
                data = data + "Question " + updated + " - Correct\n";
                counter++;
                //if incorrect
            } else {
                data = data + "Question " + updated + " - Incorrect\n";
            }
        }
        //output the strings to the TextViews
        TextView resultsOutput = findViewById(R.id.resultsLayout);
        resultsOutput.setText(data);

        TextView scoreOutput = findViewById(R.id.scoreOutput);
        scoreOutput.setText(counter + " out of 10");
    }
}
