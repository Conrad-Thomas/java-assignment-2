package thomcs4.bit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean[] qResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();
        qResults = intent.getBooleanArrayExtra("results-array");
        showResults();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.homeButton)
        {
            Intent changeActivity = new Intent(ResultsActivity.this, MainActivity.class);
            startActivity(changeActivity);
        }
    }

    public void showResults() {
        int counter = 0;
        String data = "";
        for (int r = 0 ; r < qResults.length; r++) {
            if (qResults[r]) {
                data = data + "Question " + r+1 + "- Correct\n";
                counter++;
            } else {
                data = data + "Question " + r+1 + "- Incorrect\n";
            }
        }
        TextView resultsOutput = findViewById(R.id.resultsLayout);
        resultsOutput.setText(data);

        TextView scoreOutput = findViewById(R.id.scoreOutput);
        scoreOutput.setText(counter + " out of 10");
    }
}
