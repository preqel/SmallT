package com.imooc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.mSearch);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Small.setUp(MainActivity.this, new Small.OnCompleteListener() {
                    @Override
                    public void onComplete() {
                        Small.openUri("main", MainActivity.this);
                    }
                });
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Small.openUri("search", MainActivity.this);
            }
        });


    }
}
