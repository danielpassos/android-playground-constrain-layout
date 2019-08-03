package me.passos.android.playground.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.collapsing_toolbar).setOnClickListener(this);
        findViewById(R.id.motion).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Class activity = null;
        switch (view.getId()) {
            case R.id.collapsing_toolbar:
                activity = CollapsingToolbarActivity.class;
                break;
            case R.id.motion:
                activity = MotionActivity.class;
                break;
        }
        startActivity(new Intent(this, activity));
    }

}
