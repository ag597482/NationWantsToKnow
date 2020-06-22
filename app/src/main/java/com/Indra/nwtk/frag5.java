package com.Indra.nwtk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static com.Indra.nwtk.MainActivity.mUsername;


public class frag5 extends Fragment {

    public frag5() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag5, container, false);

        TextView name = view.findViewById(R.id.username);
        TextView image = view.findViewById(R.id.user_image);

        name.setText(mUsername);
        image.setText(String.valueOf(mUsername.charAt(0)).toUpperCase());




        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(getContext(),Followers.class);
                intent.setData(Uri.parse("Followers"));
                startActivity(intent);

            }
        });
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(getContext(),Followers.class);
                intent.setData(Uri.parse("Following"));
                startActivity(intent);

            }
        });





        return view;
    }
}
