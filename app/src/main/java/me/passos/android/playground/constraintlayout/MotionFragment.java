package me.passos.android.playground.constraintlayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MotionFragment extends Fragment {

    public static final String MOTION_LAYOUT = "MOTION_LAYOUT";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        assert this.getArguments() != null;
        Motion motion = (Motion) this.getArguments().getSerializable(MOTION_LAYOUT);

        return inflater.inflate(motion.getLayout(), container, false);
    }


}
