package com.Indra.nwtk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.List;

import android.widget.ImageView;
import android.widget.TextView;

import static com.Indra.nwtk.MainActivity.mUsername;



public class frag5 extends Fragment {

    List<Question> questionList;

    //the recyclerview
    RecyclerView recyclerView;

    public frag5() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_frag5, null);


        TextView name = root.findViewById(R.id.username);
        name.setText(mUsername);

        TextView follow = root.findViewById(R.id.followers);
        TextView followin = root.findViewById(R.id.following);

        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(getContext(),Followers.class);
                intent.setData(Uri.parse("Followers"));
                startActivity(intent);

            }
        });
        followin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(getContext(),Followers.class);
                intent.setData(Uri.parse("Following"));
                startActivity(intent);

            }
        });




        recyclerView = (RecyclerView) root.findViewById(R.id.question_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        questionList = new ArrayList<>();

        questionList.add(new Question(1, "Why god why??", "stupid"));
        questionList.add(new Question(2, "Ask ask ask", "no no no"));
        questionList.add(new Question(3, "Which is best country?", "India"));
        questionList.add(new Question(4, "Who is best??", "Shalini Verma"));
        QuestionAdapter adapter = new QuestionAdapter(this, questionList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
        return root;



    }
}
