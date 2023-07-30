package com.palanzeev.module_4_home_worck_2_vladimir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    ///////////////////////////////////////////////////////////////////////////
    // Поля
    ///////////////////////////////////////////////////////////////////////////
    private TextView infoTicket;
    private Button btFixTicket, btNewTicket;
    private Ticket ticket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        infoTicket = findViewById(R.id.infoTicket);
        btFixTicket = findViewById(R.id.btFixTicket);
        btNewTicket = findViewById(R.id.btNewTicket);

        Bundle bundleTicket = getIntent().getExtras();
        if (bundleTicket != null) {
            ticket = (Ticket) bundleTicket.getSerializable(Ticket.class.getSimpleName());

            infoTicket.setText(ticket.toString());
        }
        btFixTicket.setOnClickListener(listener);
        btNewTicket.setOnClickListener(listener);
    }

    private View.OnClickListener listener = v -> {
        switch (v.getId()) {
            case R.id.btFixTicket:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                break;
            case R.id.btNewTicket:
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent2);
                break;
        }

    };
}