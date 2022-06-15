package com.example.shadow.quotes_inspire_yourself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener
{
    Button share31, back;
    TextView quote31;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        share31=findViewById(R.id.share31);
        quote31=findViewById(R.id.quote31);
        back=findViewById(R.id.back);

        share31.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.share31:
                String sharetext31=quote31.getText().toString();
                Intent sendIntent31=new Intent();
                sendIntent31.setAction(Intent.ACTION_SEND);
                sendIntent31.setType("text/plain");
                sendIntent31.putExtra(Intent.EXTRA_TEXT,sharetext31);
                startActivity(sendIntent31);
                break;
            case R.id.back:
                Intent backIntent=new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(backIntent);
        }
    }
}