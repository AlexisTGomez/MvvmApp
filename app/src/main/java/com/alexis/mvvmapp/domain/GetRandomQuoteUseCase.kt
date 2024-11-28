package com.alexis.mvvmapp.domain

import com.alexis.mvvmapp.data.model.QuoteModel
import com.alexis.mvvmapp.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke():QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}