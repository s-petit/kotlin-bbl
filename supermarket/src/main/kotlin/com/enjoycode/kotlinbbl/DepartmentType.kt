package com.enjoycode.kotlinbbl

import com.enjoycode.kotlinbbl.documentation.Demonstration

@Demonstration(why = "When kotlin, smart cast")
enum class DepartmentType {
    DAIRY, BAKERY, VEGETABLES, DRINKS;

    companion object {
        fun fromString(string: String): DepartmentType {
            return when (string.toUpperCase()) {
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