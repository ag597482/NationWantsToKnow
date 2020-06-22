package com.Indra.nwtk;

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


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link frag5#newInstance} factory method to
 * create an instance of this fragment.
 */


public class frag5 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    List<Question> questionList;

    //the recyclerview
    RecyclerView recyclerView;

    public frag5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment frag5.
     */
    // TODO: Rename and change types and number of parameters
    public static frag5 newInstance(String param1, String param2) {
        frag5 fragment = new frag5();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_frag5, null);
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
