package com.enjoycode.kotlinbbl

import com.enjoycode.kotlinbbl.documentation.Demonstration

@Demonstration(why = "data class, higher order functions")
data class Article(private val name: String, private val price: Double) {
    fun vatPrice(): Double = multiply.invoke(price, VAT_RATE)
    fun netPrice(): Double = vatPrice() + price

    private val multiply: (Double, Double) -> Double = { x, y -> x * y }
}

private const val VAT_RATE = 0.2
