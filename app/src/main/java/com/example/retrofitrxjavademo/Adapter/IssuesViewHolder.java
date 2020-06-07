package com.example.retrofitrxjavademo.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitrxjavademo.R;

public class IssuesViewHolder extends RecyclerView.ViewHolder {
    TextView txt_title, txt_body, txt_create_at, txt_state;
    public IssuesViewHolder (View itemView){
        super(itemView);

        txt_title = (TextView) itemView.findViewById(R.id.txt_title);
        txt_body = (TextView) itemView.findViewById(R.id.txt_body);
        txt_create_at = (TextView) itemView.findViewById(R.id.txt_create_at);
        txt_state = (TextView) itemView.findViewById(R.id.txt_state);

    }

}
