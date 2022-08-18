package com.example.final_project.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.final_project.R;

public class BlankFragment extends Fragment {
    public static final String TAG = BlankFragment.class.getName();
    TextView textView;
    View view;
    MainActivity mainActivity;
    Button backbutton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blank, container, false);
        textView = view.findViewById(R.id.textview);
        backbutton = view.findViewById(R.id.button2);
        Bundle bundleRecive = getArguments();
        if(bundleRecive!= null) {
            String query= (String) bundleRecive.get("query_for_search");
            if(query!=null) {
                textView.setText(query);
            }
        }
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getParentFragmentManager()!=null) {
                    getParentFragmentManager().popBackStack();
                }
            }
        });
        return view;
    }
}