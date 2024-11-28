package com.alexis.mvvmapp.domain

import com.alexis.mvvmapp.data.model.QuoteModel
import com.alexis.mvvmapp.data.repositories.QuoteRepository

class GetQuotesUseCase {
    private val quoteRepository = QuoteRepository()
    //    suspend operator fun invoke(): List<QuoteModel>? {
//        return quoteRepository.getAllQuotes()
//    }
    suspend operator fun invoke(): List<QuoteModel>? = quoteRepository.getAllQuotes()
}