package com.enjoycode.kotlinbbl

import com.enjoycode.kotlinbbl.documentation.Demonstration
import com.enjoycode.location.LocationDetails

fun List<String>.isNotBlank(): Boolean = this != null && !this.isEmpty()

class Supermarket(@Demonstration(why = "named param + default value")
                  private val departments: List<Department>,
                  private val locationDetails: LocationDetails,
                  private val phoneNumber: String,
                  @Demonstration(why = "nullable field + default value")
                  private val gasStation: GasStation? = null
) {

    @Demonstration(why = "template string, extension methods")
    fun contact(): String {
        val address = locationDetails.address()
        return """
                |{
                    |"tel" : "$phoneNumber",
                    |"address" : "$address"
                |}
            """.trimMargin().trimIndent()
    }

    fun toto(list: List<String>): String = if (list.isNotBlank()) "ok" else "ko"

    @Demonstration(why = "multiline string")
    private fun LocationDetails.address(): String {
        return "${this.number}, ${this.street} ${this.zipCode} ${this.city}"
    }

    @Demonstration(why = "collection and lambdas")
    fun supermarketSales(): Int = departments.sumBy { it.sales }

    @Demonstration(why = "null safe operations")
    fun gasStationSales(): Double = gasStation?.gasPrice?.totalSales() ?: 0.0

    @Demonstration(why = "collection and lambdas")
    fun allStock(): Int = departments.flatMap { it.stocks }.sumBy { it.quantity }

}