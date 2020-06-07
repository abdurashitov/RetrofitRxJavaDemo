package com.example.retrofitrxjavademo.Retrofit;

import com.example.retrofitrxjavademo.Model.Isuues;


import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {
    @GET("repos/ReactiveX/RxJava/issues")
    Observable<List <Isuues>> getIssues();

}
