package com.enjoycode.kotlinbbl

import com.enjoycode.location.LocationDetails

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
        return "Tel: $phoneNumber - Address:$address"
    }

    fun toto(list: List<String>): String = if (list.isNotBlank()) "ok" else "ko"

    private fun List<String>.isNotBlank(): Boolean = this != null && !this.isEmpty()

    @Demonstration(why = "multiline string")
    private fun LocationDetails.address(): String {
        return """
            
            ${locationDetails.number}, ${locationDetails.street}
            ${locationDetails.zipCode} ${locationDetails.city}
            
            """.trimIndent()
    }

    @Demonstration(why = "collection and lambdas")
    fun supermarketSales(): Int = departments.sumBy { it.sales }

    @Demonstration(why = "null safe operations")
    fun gasStationSales(): Double = gasStation?.gasPrice?.totalSales() ?: 0.0

    @Demonstration(why = "collection and lambdas")
    fun allStock(): Int = departments.flatMap { it.stocks }.sumBy { it.stock }
}