package com.example.retrofit;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface retrofit_Interface {

         @GET("movie/now_playing?api_key=32c913288edad9470662db02b7263518&language=en-US&page=1")
           Call<List<movieModel>>getMovies();
}
