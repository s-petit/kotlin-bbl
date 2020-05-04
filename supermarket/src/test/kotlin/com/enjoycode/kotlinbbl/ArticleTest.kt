package com.enjoycode.kotlinbbl

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArticleTest {

    @Test
    fun `net price`() {
        val rice = Article("Basmati Rice", 100.00)
        assertThat(rice.netPrice()).isEqualTo(120.00)
    }

    @Test
    fun `equals`() {
        val rice = Article("Basmati Rice", 100.00)
        val riceEquals = Article("Basmati Rice", 100.00)
        val riceNotEquals = Article("Basmati Rice2", 100.00)
        val riceNotEquals2 = Article("Basmati Rice", 100.01)

        assertThat(rice.netPrice()).isEqualTo(120.00)
        assertThat(rice).isEqualTo(riceEquals)
        assertThat(rice).isNotEqualTo(riceNotEquals)
        assertThat(rice).isNotEqualTo(riceNotEquals2)
    }

    @Test
    fun `to String`() {
        val rice = Article("Basmati Rice", 100.00)
        assertThat(rice.toString()).isEqualTo("Article(name=Basmati Rice, price=100.0)")
    }

    @Test
    fun `copy`() {
        val rice = Article("Basmati Rice", 100.00)
        val riceCopy = rice.copy()
        assertThat(rice).isEqualTo(riceCopy)
        assertThat(rice).isNotSameAs(riceCopy)
    }

}