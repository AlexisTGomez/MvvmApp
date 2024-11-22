package com.alexis.mvvmapp.model
class QuoteProvider {
    companion object {

        fun random(): QuoteModel {
            val position = (0..10).random()
            return quotes[position]
        }

        val quotes = listOf(
            QuoteModel(
                quote = "Al que madruga Dios le ayuda",
                author = "Mi abuela"
            ),
            QuoteModel(
                quote = "Esta mas largo que una semana sin carne",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "Mas vale pajaro en mano que ciento volando",
                author = "Edsger Dijkstra"
            ),
            QuoteModel(
                quote = "A buen entendedor, pocas palabras.",
                author = "Pascal"
            ),
            QuoteModel(
                quote = "No me abra esos ojos que no le voy a echar gotas",
                author = "Vidiu Platon"
            ),
            QuoteModel(
                quote = "A caballo regalado no se le mira el colmillo",
                author = "Bill Gates"
            ),
            QuoteModel(
                quote = "Salte aqui y reclame dos moscas",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "El que tenga tienda que la atienda",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "Le cuento el milagro pero no el santo",
                author = "Linus Torvalds"
            ),

            QuoteModel(
                quote = "Dios le da pan al que no tiene dientes",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "Con hambre, no hay pan duro",
                author = "AristiDevs"
            )
        )
    }
}