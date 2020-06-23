package com.Indra.nwtk;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class frag1 extends Fragment {



    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mMessageDatabaseRefrence;
    String temp;

    public frag1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_frag1, container, false);

        mFirebaseDatabase = FirebaseDatabase.getInstance();

        mMessageDatabaseRefrence = mFirebaseDatabase.getReference().child("users");

        temp = "";

        mMessageDatabaseRefrence.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    PersonItem personItem = snapshot.getValue(PersonItem.class);


                    temp = temp + personItem.getName()+ " "+ personItem.getEmail() + " \n";

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        TextView textView = root.findViewById(R.id.text);

        textView.setText(temp);



        return root;

    }
}
