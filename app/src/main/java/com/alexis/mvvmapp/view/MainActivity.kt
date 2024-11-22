package com.alexis.mvvmapp.view

import android.graphics.drawable.StateListDrawable
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.alexis.mvvmapp.databinding.ActivityMainBinding
import com.alexis.mvvmapp.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    private lateinit var background: StateListDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        background = binding.viewContainer.background as StateListDrawable

        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->
            binding.tvQuote.text = currentQuote.quote
            binding.tvAuthor.text = currentQuote.author

            val index = quoteViewModel.quotes.indexOf(currentQuote)
            val state = when (index) {
                0 -> intArrayOf(android.R.attr.state_activated)
                1 -> intArrayOf(android.R.attr.state_pressed)
                2 -> intArrayOf(android.R.attr.state_focused)
                3 -> intArrayOf(android.R.attr.state_enabled)
                4 -> intArrayOf(android.R.attr.state_selected)
                5 -> intArrayOf(android.R.attr.state_checkable)
                6 -> intArrayOf(android.R.attr.state_checked)
                7 -> intArrayOf(android.R.attr.state_window_focused)
                8 -> intArrayOf(android.R.attr.state_hovered)
                9 -> intArrayOf(-android.R.attr.state_activated)
                // ... agrega más casos para cada frase ...
                else -> intArrayOf()
            }
            background.state = intArrayOf()
            background.state = state
            })


        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }

    }

}
