package com.Indra.nwtk;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<PersonItem> {


    private static final String LOG_TAG = PersonAdapter.class.getSimpleName();

    public PersonAdapter(@NonNull Context context,ArrayList<PersonItem> personItems) {
        super(context,0,personItems);
    }





    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.person_item, parent, false);
        }


        PersonItem currentAndroidFlavor = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.person_name);
        name.setText(currentAndroidFlavor.getName());


        TextView email = (TextView) listItemView.findViewById(R.id.person_email);
        email.setText(String.valueOf(currentAndroidFlavor.getEmail()));

        final Button button = (Button) listItemView.findViewById(R.id.followbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button.getText().equals("Follow")) {
                    button.setText("Following");
                } else {
                    button.setText("Follow");
                }
            }
        });


        return listItemView;
    }


}

