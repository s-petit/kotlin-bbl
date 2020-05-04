package com.enjoycode.kotlinbbl

@Demonstration(why = "When kotlin, smart cast")
enum class DepartmentType {
    DAIRY, BAKERY, VEGETABLES, DRINKS;

    companion object {
        fun fromString(string: String): DepartmentType {
            val upper = string.toUpperCase()
            return when (upper) {
                "DAIRY" -> DAIRY
                "BAKERY" -> BAKERY
                "VEGETABLES" -> VEGETABLES
                "DRINKS" -> DRINKS
                else -> throw IllegalArgumentException()
            }
        }

        fun vegan(departmentType: DepartmentType?): String {
            return when (departmentType) {
                DAIRY -> "Pas vegan"
                BAKERY,VEGETABLES,DRINKS -> "vegan"
                else -> throw IllegalArgumentException()
            }
        }

        fun increment(obj: Any): Int {
            return when (obj) {
                is Int -> obj + 1
                is String -> obj.toUpperCase().toInt() + 1
                else -> 0
            }
        }
    }
}