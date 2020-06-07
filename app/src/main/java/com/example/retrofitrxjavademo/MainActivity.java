package com.example.retrofitrxjavademo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.retrofitrxjavademo.Adapter.IssuesAdapter;
import com.example.retrofitrxjavademo.Model.Isuues;
import com.example.retrofitrxjavademo.Retrofit.IMyAPI;
import com.example.retrofitrxjavademo.Retrofit.RetrofitClient;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    IMyAPI myAPI;
    RecyclerView recycler_issues;
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //--
        Retrofit retrofit = RetrofitClient.getInstance();
        myAPI = retrofit.create(IMyAPI.class);
        //--
        recycler_issues = findViewById(R.id.recycler_issues);
        recycler_issues.setHasFixedSize(true);
        recycler_issues.setLayoutManager(new LinearLayoutManager(this));

        fetchData();
    }

    private void fetchData() {
        compositeDisposable.add((myAPI.getIssues()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Consumer<List<Isuues>>() {
                @Override
                public void accept(List<Isuues> isuues) throws Exception {
                    displayData(isuues);
                }
            })));
    }

    private void displayData(List<Isuues> isuues){
        IssuesAdapter adapter = new IssuesAdapter(this, isuues);
        recycler_issues.setAdapter(adapter);
    }

    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();
    }
}
