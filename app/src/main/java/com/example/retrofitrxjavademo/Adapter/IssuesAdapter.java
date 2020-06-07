package com.example.retrofitrxjavademo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitrxjavademo.Model.Isuues;
import com.example.retrofitrxjavademo.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class IssuesAdapter extends RecyclerView.Adapter<IssuesViewHolder> {

    Context context;
    List<Isuues> issuesList;

    public IssuesAdapter(Context context, List<Isuues> isuuesList) {
        this.context = context;
        this.issuesList = isuuesList;
    }

    @NonNull
    @Override
    public IssuesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.issues_card, parent, false);
        return new IssuesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IssuesViewHolder holder, int position) {
        holder.txt_title.setText(String.valueOf(issuesList.get(position).title));
        holder.txt_body.setText(new StringBuilder(issuesList.get(position).body.substring(0, 100)).append("...").toString());
        DateFormat df = new SimpleDateFormat("HH:mm dd-MM-yyyy");
        holder.txt_create_at.setText((df.format(issuesList.get(position).created_at)));
        holder.txt_state.setText(String.valueOf(issuesList.get(position).state));

    }

    @Override
    public int getItemCount() {
        return issuesList.size();
    }
}
