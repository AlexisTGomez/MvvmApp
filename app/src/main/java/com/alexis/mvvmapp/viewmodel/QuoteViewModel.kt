package com.alexis.mvvmapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alexis.mvvmapp.model.QuoteModel
import com.alexis.mvvmapp.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val quotes = QuoteProvider.quotes

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}