package com.example.shadow.quotes_inspire_yourself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button share,next;
    TextView quote;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        share=findViewById(R.id.share);
        quote=findViewById(R.id.quote);
        next=findViewById(R.id.btnnext);

        share.setOnClickListener(this);
        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.share:
                String sharetxt=quote.getText().toString();
                Intent sendIntent=new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT,sharetxt);
                startActivity(sendIntent);
                break;
            case R.id.btnnext:
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                break;
        }
    }
}
