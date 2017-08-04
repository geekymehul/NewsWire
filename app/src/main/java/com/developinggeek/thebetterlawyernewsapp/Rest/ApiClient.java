package com.developinggeek.thebetterlawyernewsapp.Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by DELL-PC on 8/4/2017.
 */

public class ApiClient
{
    public static final String BASE_URL = "http://thebetterlawyer.com/news/api/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient()
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                           .baseUrl(BASE_URL)
                           .addConverterFactory(GsonConverterFactory.create())
                           .build();
        }
        return retrofit;
    }

}
