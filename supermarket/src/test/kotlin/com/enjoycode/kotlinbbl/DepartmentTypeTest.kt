package com.enjoycode.kotlinbbl

import com.enjoycode.kotlinbbl.documentation.Demonstration
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class DepartmentTypeTest {

    @Demonstration(why = "when")
    @Test
    fun `vegan or not vegan`() {
        assertThat(DepartmentType.vegan(DepartmentType.DRINKS)).isEqualTo("vegan")
        assertThat(DepartmentType.vegan(DepartmentType.DAIRY)).isEqualTo("Pas vegan")
        assertThat(DepartmentType.vegan(DepartmentType.BAKERY)).isEqualTo("vegan")
        assertThat(DepartmentType.vegan(DepartmentType.VEGETABLES)).isEqualTo("vegan")
    }

}