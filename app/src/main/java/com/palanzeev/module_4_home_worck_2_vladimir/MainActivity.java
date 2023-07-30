package com.palanzeev.module_4_home_worck_2_vladimir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edIdIn, edDeparturePointIn, edDepartureDateIn, edArrivalPointIn, edArrivalDateIn;
    TextView coastTicketIn;
    Button button;
    private int id;
    private Float coast = 999.99f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edIdIn = findViewById(R.id.edIdIn);
        edDeparturePointIn = findViewById(R.id.edDeparturePointIn);
        edDepartureDateIn = findViewById(R.id.edDepartureDateIn);
        edArrivalPointIn = findViewById(R.id.edArrivalPointIn);
        edArrivalDateIn = findViewById(R.id.edArrivalDateIn);
        coastTicketIn = findViewById(R.id.coastTicketIn);
        coastTicketIn.setText("Стоимость билета: " + coast + " монет");

        button = findViewById(R.id.button);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = v -> {
        id = Integer.parseInt(edIdIn.getText().toString());
        Ticket ticket = new Ticket(id,
                edDeparturePointIn.getText().toString(),
                edDepartureDateIn.getText().toString(),
                edArrivalPointIn.getText().toString(),
                edArrivalDateIn.getText().toString(),
                coast);

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra(Ticket.class.getSimpleName(), ticket);
        startActivity(intent);
    };
}
