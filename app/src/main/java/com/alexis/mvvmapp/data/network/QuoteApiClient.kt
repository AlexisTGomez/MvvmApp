package com.alexis.mvvmapp.data.network
import com.alexis.mvvmapp.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun  getAllQuotes(): Response<List<QuoteModel>>
}