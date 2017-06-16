package com.example.matah.retrofitgerrit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by matah on 07/06/2017.
 */

public interface GerritAPI {
    @GET("changes/")
    Call<List<Change>> loadChanges(@Query("q") String status);
}
