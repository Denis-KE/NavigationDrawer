package com.deno.mynavigationdrawerapp.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.deno.mynavigationdrawerapp.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    Spinner mUsers;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
      textView.setText("Hello From Slide Show");

      //Find the View by Id On the spinner
        mUsers = root.findViewById(R.id.spinnerid);

        //Set an OnitemClicklistener on the spinner
        mUsers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item_data =parent.getItemAtPosition(position).toString();
                Toast.makeText(getContext(),item_data, Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}