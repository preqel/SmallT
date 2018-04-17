package com.imooc.appmain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import net.wequick.small.Small;

public class HomeActivity extends AppCompatActivity {


    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Small.setUp(view.getContext(), new Small.OnCompleteListener() {
                    @Override
                    public void onComplete() {
                        Small.openUri("search",HomeActivity.this);
                    }
                });
            }
        });
    }
}
