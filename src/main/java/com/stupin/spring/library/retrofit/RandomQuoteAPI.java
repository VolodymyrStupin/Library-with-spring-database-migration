package com.stupin.spring.library.retrofit;

import com.stupin.spring.library.retrofit.model.RandomQuoteResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RandomQuoteAPI {

	@GET("/api/quotes/random/")
	public Call<RandomQuoteResponse> getRandomQuote();
}
