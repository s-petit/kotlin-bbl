package com.enjoycode.kotlinbbl

import com.enjoycode.kotlinbbl.documentation.Demonstration
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class DepartmentTypeTest {

    @Demonstration(why = "when")
    @Test
    fun `department from string`() {
        assertThat(DepartmentType.fromString("dairy")).isEqualTo(DepartmentType.DAIRY)
        assertThat(DepartmentType.fromString("DRINKS")).isEqualTo(DepartmentType.DRINKS)
        assertThat(DepartmentType.fromString("vegetables")).isEqualTo(DepartmentType.VEGETABLES)
        assertThat(DepartmentType.fromString("BaKeRy")).isEqualTo(DepartmentType.BAKERY)
        Assertions.assertThatThrownBy { DepartmentType.fromString("fish") }.isInstanceOf(IllegalArgumentException::class.java)
    }

    @Demonstration(why = "when")
    @Test
    fun `vegan or not vegan`() {
        assertThat(DepartmentType.vegan(DepartmentType.DRINKS)).isEqualTo("vegan")
        assertThat(DepartmentType.vegan(DepartmentType.DAIRY)).isEqualTo("Pas vegan")
        assertThat(DepartmentType.vegan(DepartmentType.BAKERY)).isEqualTo("vegan")
        assertThat(DepartmentType.vegan(DepartmentType.VEGETABLES)).isEqualTo("vegan")
    }

}