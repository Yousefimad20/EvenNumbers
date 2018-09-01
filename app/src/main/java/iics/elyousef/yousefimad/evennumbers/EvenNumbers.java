package iics.elyousef.yousefimad.evennumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EvenNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_numbers);

        Button pressButton = (Button) findViewById(R.id.pressButton);
        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textDisplay = (TextView) findViewById(R.id.textDisplay);
                final TextView textViewResult = (TextView) findViewById(R.id.textDisplay);
                for (int i = 0; i<=19; i++){
                    if ((i % 2) == 0){
                        textViewResult.append(i + ", ");
                    }

                }
            }
        });
    }
}
