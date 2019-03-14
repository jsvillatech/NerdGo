package apps.practico.nerdgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CanjeActivity extends AppCompatActivity {


    private TextView puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canje);
        puntos=(TextView) findViewById(R.id.pointstot);
        puntos.setText("");
    }



    public void buttonClick(View v){

        finish();


    }
}
