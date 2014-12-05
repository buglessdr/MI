package com.amex.mi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AccountSummary extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_summary);


        Button paymentsBtn = (Button) findViewById(R.id.payments_button);
        paymentsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPayments();
            }
        });

        Button inqiuriesBtn = (Button) findViewById(R.id.inquries_button);
        inqiuriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInquiries();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_account_summary, menu);



        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showPayments() {

        Intent intent = new Intent(this, PaymentListActivity.class);
        startActivity(intent);


    }

    public void showInquiries() {

        Intent intent = new Intent(this, InquiryListActivity.class);
        startActivity(intent);


    }
}
