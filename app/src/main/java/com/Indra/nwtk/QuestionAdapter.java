package com.Indra.nwtk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder> {

    //this context we will use to inflate the layout
    private frag5 mCtx;

    //we are storing all the products in a list
    private List<Question> questionList;

    //getting the context and product list with constructor
    public QuestionAdapter(frag5 mCtx, List<Question> questionList) {
        this.mCtx = mCtx;
        this.questionList = questionList;
    }

    @NonNull
    @Override
    public QuestionAdapter.QuestionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_question_list, null);
        return new QuestionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionAdapter.QuestionViewHolder holder, int position) {
        //getting the product of the specified position
        Question question = questionList.get(position);

        //binding the data with the viewholder views
        holder.Question.setText(question.getQuestion());
        holder.Answer.setText(question.getAnswer());
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }
    public class QuestionViewHolder extends RecyclerView.ViewHolder {

        TextView Question;
        TextView Answer;

        public QuestionViewHolder(View itemView) {
            super(itemView);

            Question = itemView.findViewById(R.id.question);
            Answer = itemView.findViewById(R.id.answer);
        }
    }
}
