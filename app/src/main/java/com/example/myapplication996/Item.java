package com.example.myapplication996;

import androidx.fragment.app.Fragment;

public class Item {


    private Fragment fragment;
    private String name;

    public Item(String name, Fragment fragment) {
        this.fragment = fragment;
        this.name = name;
    }

    public Fragment getFragment() {
        return fragment;
    }


    public String getName() {
        return name;
    }


}
