package com.alexis.mvvmapp.data.repositories

import com.alexis.mvvmapp.data.model.QuoteModel
import com.alexis.mvvmapp.data.model.QuoteProvider
import com.alexis.mvvmapp.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}