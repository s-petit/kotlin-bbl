package com.enjoycode.kotlinbbl

import com.enjoycode.kotlinbbl.documentation.Demonstration

@Demonstration(why = "When kotlin, smart cast")
enum class DepartmentType {
    DAIRY, BAKERY, VEGETABLES, DRINKS;

    companion object {
        fun vegan(departmentType: DepartmentType?): String {
            return when (departmentType) {
                DAIRY -> "Pas vegan"
                BAKERY,VEGETABLES,DRINKS -> "vegan"
                else -> throw IllegalArgumentException()
            }
        }

        // smart cast
        fun increment(obj: Any): Int {
            return when (obj) {
                is Int -> obj + 1
                is String -> obj.toUpperCase().toInt() + 1
                else -> 0
            }
        }

        fun doTheMath(mathOperation: MathOperation): Int {
            return when (mathOperation) {
                is Multiply -> mathOperation.e1 * mathOperation.e2
                is Sum -> mathOperation.e1 + mathOperation.e2
                is Power -> mathOperation.e1 * mathOperation.e1
            }
        }
/*
        fun doTheMath(plop: Plop): Int {
            return when (plop) {
                is String ->
                else ->
            }
        }
        */
    }
}

open class Plop()

//sealed class
sealed class MathOperation
data class Multiply(val e1: Int, val e2: Int) : MathOperation()
data class Sum(val e1: Int, val e2: Int) : MathOperation()
data class Power(val e1: Int) : MathOperation()