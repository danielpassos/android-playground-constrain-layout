package me.passos.android.playground.constraintlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MotionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion);

        final Spinner spinner = findViewById(R.id.motionOptions);

        final ArrayAdapter<Motion> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,
                Arrays.asList(
                        new Motion("Motion 01", R.layout.motion_01),
                        new Motion("Motion 02", R.layout.motion_02),
                        new Motion("Motion 03", R.layout.motion_03),
                        new Motion("Motion 04", R.layout.motion_04),
                        new Motion("Motion 05", R.layout.motion_05),
                        new Motion("Motion 06", R.layout.motion_06),
                        new Motion("Motion 07", R.layout.motion_07)
                )
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int position, long id) {
                Bundle bundle = new Bundle();
                bundle.putSerializable(MotionFragment.MOTION_LAYOUT, adapter.getItem(position));

                MotionFragment motionFragment = new MotionFragment();
                motionFragment.setArguments(bundle);

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.motion, motionFragment)
                        .commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }

}
