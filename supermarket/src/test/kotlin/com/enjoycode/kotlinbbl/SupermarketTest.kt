package com.enjoycode.kotlinbbl;

import com.enjoycode.location.LocationDetails
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class SupermarketTest {

    @Demonstration(why = "String templates, Multi-lines strings, Method extension")
    @Test
    fun `format address`() {
        val location = LocationDetails("23", "rue Gambetta", "75001", "Paris")
        val supermarket = Supermarket(emptyList(), location, "0612345667")

        assertThat(supermarket.contact())
                .isEqualTo("Tel: 0612345667 - Address:\n" +
                        "23, rue Gambetta\n" +
                        "75001 Paris\n")
    }

    @Demonstration(why = "concise lambdas")
    @Test
    fun `total supermarket sales`() {
        val location = LocationDetails("23", "rue Gambetta", "75001", "Paris")

        val dairy = Department(emptyList(), DepartmentType.DAIRY, 1200)
        val drink = Department(emptyList(), DepartmentType.DRINKS, 3500)
        val supermarket = Supermarket(listOf(dairy, drink), location, "0612345667")

        assertThat(supermarket.supermarketSales()).isEqualTo(4700)
    }


    @Demonstration(why = "concise lambdas")
    @Test
    fun `total stock`() {
        val location = LocationDetails("23", "rue Gambetta", "75001", "Paris")

        val milk = Article("Lait entier", 10.50)
        val yoghurt = Article("Panier de yoplait", 4.43)
        val dairy = Department(listOf(Stock(milk, 30), Stock(yoghurt, 23)), DepartmentType.DAIRY, 1200)

        val soda = Article("Fanta", 1.5)
        val juice = Article("Jus de pomme", 3.21)
        val drink = Department(listOf(Stock(soda, 34), Stock(juice, 67)), DepartmentType.DRINKS, 3500)


        val supermarket = Supermarket(listOf(dairy, drink), location, "0612345667")

        assertThat(supermarket.allStock()).isEqualTo(154)
    }

    @Demonstration(why = "null safety")
    @Test
    fun `total gas station sales`() {
        val location = LocationDetails("23", "rue Gambetta", "75001", "Paris")

        val gasStation = GasStation(GasPrice(1.5, 10.0))
        val supermarket = Supermarket(emptyList(), location, "0612345667", gasStation)

        assertThat(supermarket.gasStationSales()).isEqualTo(15.0)
    }

    @Demonstration(why = "null safety")
    @Test
    fun `total gas station sales null`() {
        val location = LocationDetails("23", "rue Gambetta", "75001", "Paris")

        val supermarketWithoutGasStation = Supermarket(emptyList(), location, "0612345667", null)
        assertThat(supermarketWithoutGasStation.gasStationSales()).isEqualTo(0.0)

        val gasStationNoPrice = GasStation(null)
        val supermarket = Supermarket(emptyList(), location, "0612345667", gasStationNoPrice)
        assertThat(supermarket.gasStationSales()).isEqualTo(0.0)
    }

    //val multiply: (Int, Int) -> Int = { x: Int, y: Int -> x * y }

}