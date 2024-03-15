package com.example.pr5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    public Fragment2() {
        super(R.layout.fragment_2);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            int myInt = bundle.getInt("some_int", 0);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        TextView textView = view.findViewById(R.id.textView6);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String Name = bundle.getString("Example");
            if (Name != null) {
                textView.setText(Name);
            }
        }
        return view;
    }
}