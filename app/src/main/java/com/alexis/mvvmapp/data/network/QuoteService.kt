package com.alexis.mvvmapp.data.network

import com.alexis.mvvmapp.core.RetrofitHelper
import com.alexis.mvvmapp.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class QuoteService {
    private val retrofit:Retrofit = RetrofitHelper.getRetrofit()
    suspend fun getQuotes(): List<QuoteModel> {
       return withContext(Dispatchers.IO){
        val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
        response.body() ?: emptyList()

       }
    }
}