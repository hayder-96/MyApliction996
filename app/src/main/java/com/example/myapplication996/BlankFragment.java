package com.example.myapplication996;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlankFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";

    private int mParam1;

    public BlankFragment() {
        // Required empty public constructor
    }

    public static BlankFragment newInstance(int param1) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_blank, container, false);


    ConstraintLayout co=v.findViewById(R.id.blank);
    co.setBackgroundResource(mParam1);
    co.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(getContext(),DialogHandler.class);
            i.putExtra("name",mParam1);
            getActivity().startActivity(i);
        }
    });

                return v;

    }
}