package fr.yakacoder.android.mytestableapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText mDataEditText;
    public Button mValidButton;
    public TextView mDataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mDataEditText = (EditText) findViewById(R.id.dataEditText);
        mValidButton = (Button) findViewById(R.id.validButton);
        mValidButton.setOnClickListener(this);
        mDataTextView = (TextView) findViewById(R.id.dateTextView);
    }

    @Override
    public void onClick(View view) {
        String data = mDataEditText.getText().toString();
        mDataTextView.setText(data);
    }
}
