package apps.practico.nerdgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OpActivity extends AppCompatActivity {


    private Operation op;
    private TextView solve;
    private EditText textEnter;
    private String actual;
    private int points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op);
        actual = "";
        solve = (TextView) findViewById(R.id.textViewSolve);
        textEnter = (EditText) findViewById(R.id.getOp);
        op = new Operation();
        actual = op.generateOperation();
        solve.setText(actual);
        points=0;

    }


    public void buttonClick(View v) {

        String entrada = textEnter.getText().toString();
        int numChallenge = Integer.parseInt(entrada);
        if (op.getOperand() == '+') {

            int numVer = op.getNumA() + op.getNumB();

            if (numVer == numChallenge) {

                points=points+1;
                Toast.makeText(this, "!!CORRECTO!! "  + points + "puntos",
                        Toast.LENGTH_LONG).show();
                textEnter.setText("");
                finish();

            } else {

                Toast.makeText(this, "INCORRECTO :(",
                        Toast.LENGTH_LONG).show();
                textEnter.setText("");
                finish();

            }
        } else if (op.getOperand() == '*') {
            int numVer = op.getNumA() * op.getNumB();

            if (numVer == numChallenge) {

                points=points+1;
                Toast.makeText(this, "!!CORRECTO!! " + points + "puntos",
                        Toast.LENGTH_LONG).show();
                textEnter.setText("");
                finish();

            } else {

                Toast.makeText(this, "INCORRECTO :(",
                        Toast.LENGTH_LONG).show();
                textEnter.setText("");
                finish();

            }

        } else if (op.getOperand() == '-') {


            int numVer = op.getNumA() - op.getNumB();

            if (numVer == numChallenge) {

                points=points+1;
                Toast.makeText(this, "!!CORRECTO!! "  + points + "puntos",
                        Toast.LENGTH_LONG).show();
                textEnter.setText("");
                finish();

            } else {

                Toast.makeText(this, "INCORRECTO :(",
                        Toast.LENGTH_LONG).show();
                textEnter.setText("");
                finish();

            }


        } else {


            int numVer = op.getNumA() / op.getNumB();

            if (numVer == numChallenge) {

                points+=1;
                Toast.makeText(this, "!!CORRECTO!! "  + points + "puntos",
                        Toast.LENGTH_LONG).show();
                textEnter.setText("");
                finish();

            } else {

                Toast.makeText(this, "INCORRECTO :(",
                        Toast.LENGTH_LONG).show();
                textEnter.setText("");
                finish();

            }

        }


    }


}
