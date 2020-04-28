package com.enjoycode.kotlinbbl

data class VideoGame (private val name: String, private val type: String, val price: Double) {

    private val vatRate = 0.2

    private fun vatPrice(): Double = price * vatRate
    fun netPrice(): Double = price + vatPrice()

    //TODO une methode metier qui montre l'avantage du destructuring avec plein de set

}