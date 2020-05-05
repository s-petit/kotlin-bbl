package com.enjoycode.kotlinbbl

import com.enjoycode.kotlinbbl.documentation.Demonstration

@Demonstration(why = "data class, higher order functions")
data class Article(
        private val name: String,
        private val price: Double
) {
    fun vatPrice(): Double = multiply.invoke(price, VAT_RATE)
    fun netPrice(): Double = vatPrice() + price

    val multiply: (Double, Double) -> Double = { x,y -> x * y}
    val add: (Double, Double) -> Double = { x,y -> x + y}

    fun vatPrice(op : (Double, Double) -> Double): Double = op.invoke(price, VAT_RATE)
}

private const val VAT_RATE = 0.2
