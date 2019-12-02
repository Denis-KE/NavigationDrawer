package com.deno.mynavigationdrawerapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.deno.mynavigationdrawerapp.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Button mBtnHome;
    TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        textView =root.findViewById(R.id.text_home);
        mBtnHome =root.findViewById(R.id.btnHome);
        textView.setText("This is Hello From Fragment");
        //Set the onclick listener on the button
        mBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Home button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}