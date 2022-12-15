package com.example.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    private TextView textView;
    private Integer first, second;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = requireActivity().findViewById(R.id.text);
        Button btnPlus = requireActivity().findViewById(R.id.btn_plus);
        Button btnMinus = requireActivity().findViewById(R.id.btn_minus);
        btnPlus.setOnClickListener(view12 -> {
            first = Integer.valueOf(textView.getText().toString());
            second = first + 1;
            textView.setText(second.toString());
        });
        btnMinus.setOnClickListener(view1 -> {
            first = Integer.valueOf(textView.getText().toString());
            second = first - 1;
            textView.setText(second.toString());
        });
    }
}