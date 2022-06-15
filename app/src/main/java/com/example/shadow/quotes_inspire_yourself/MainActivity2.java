package com.example.shadow.quotes_inspire_yourself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener
{
    Button share21,share22,next1,prev;
    TextView quote21,quote22;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        share21 = findViewById(R.id.share21);
        quote21 = findViewById(R.id.quote21);
        share22 = findViewById(R.id.share22);
        quote22 = findViewById(R.id.quote22);
        next1 = findViewById(R.id.btnnext1);
        prev = findViewById(R.id.prev);

        share21.setOnClickListener(this);
        share22.setOnClickListener(this);
        next1.setOnClickListener(this);
        prev.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.share21:
                String sharetxt21 = quote21.getText().toString();
                Intent sendIntent21 = new Intent();
                sendIntent21.setAction(Intent.ACTION_SEND);
                sendIntent21.setType("text/plain");
                sendIntent21.putExtra(Intent.EXTRA_TEXT, sharetxt21);
                startActivity(sendIntent21);
                break;

            case R.id.share22:
                String sharetxt22 = quote22.getText().toString();
                Intent sendIntent22 = new Intent();
                sendIntent22.setAction(Intent.ACTION_SEND);
                sendIntent22.setType("text/plain");
                sendIntent22.putExtra(Intent.EXTRA_TEXT, sharetxt22);
                startActivity(sendIntent22);
                break;

            case R.id.btnnext1:
                Intent intents = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intents);
                break;

            case R.id.prev:
                Intent interpret=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(interpret);
                break;
        }
    }
}