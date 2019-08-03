package me.passos.android.playground.constraintlayout;

import androidx.annotation.LayoutRes;

import java.io.Serializable;

public class Motion implements Serializable {

    private final String name;
    private final @LayoutRes
    Integer layout;

    public Motion(String name, Integer layout) {
        this.name = name;
        this.layout = layout;
    }

    public String getName() {
        return name;
    }

    public Integer getLayout() {
        return layout;
    }

    @Override
    public String toString() {
        return name;
    }

}
