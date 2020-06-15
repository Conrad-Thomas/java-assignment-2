package thomcs4.bit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ResultsActivity extends AppCompatActivity {

    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("results");
    }

}
