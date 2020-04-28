package com.enjoycode.kotlinbbl

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoGameTest {

    @Test
    fun `net price`() {
        val ff7 = VideoGame("Final Fantasy", "RPG", 100.00)
        assertThat(ff7.netPrice()).isEqualTo(120.00)

        val ff7Java = VideoGameJava("Final Fantasy", "RPG", 100.00)
        assertThat(ff7Java.netPrice()).isEqualTo(120.00)
    }

    @Test
    fun `equals`() {
        val ff7 = VideoGame("Final Fantasy", "RPG", 100.00)
        val ff7Equals = VideoGame("Final Fantasy", "RPG", 100.00)
        val ff7NotEquals = VideoGame("Final Fantasy2", "RPG", 100.00)
        val ff7NotEquals2 = VideoGame("Final Fantasy2", "RPG", 100.01)
        assertThat(ff7.netPrice()).isEqualTo(120.00)
        assertThat(ff7).isEqualTo(ff7Equals)
        assertThat(ff7).isNotEqualTo(ff7NotEquals)
        assertThat(ff7).isNotEqualTo(ff7NotEquals2)


        val ff7Java = VideoGameJava("Final Fantasy", "RPG", 100.00)
        val ff7JavaEquals = VideoGameJava("Final Fantasy", "RPG", 100.00)
        val ff7JavaNotEquals = VideoGameJava("Final Fantasy2", "RPG", 100.00)
        val ff7JavaNotEquals2 = VideoGameJava("Final Fantasy", "RPG", 100.01)
        assertThat(ff7Java.netPrice()).isEqualTo(120.00)
        assertThat(ff7Java).isEqualTo(ff7JavaEquals)
        assertThat(ff7Java).isNotEqualTo(ff7JavaNotEquals)
        assertThat(ff7Java).isNotEqualTo(ff7JavaNotEquals2)
    }

    @Test
    fun `to String`() {
        val ff7 = VideoGame("Final Fantasy", "RPG", 100.00)
        assertThat(ff7.toString()).isEqualTo("VideoGame(name=Final Fantasy, type=RPG, price=100.0)")

        val ff7Java = VideoGameJava("Final Fantasy", "RPG", 100.00)
        assertThat(ff7Java.toString()).isEqualTo("VideoGameJava(name=Final Fantasy, type=RPG, price=100.0)")
    }

    @Test
    fun `copy`() {
        val ff7 = VideoGame("Final Fantasy", "RPG", 100.00)
        val ff7Copy = ff7.copy()
        val ff7CopyPrice = ff7.copy(price = 90.0)
        assertThat(ff7Copy).isEqualTo(ff7)
        assertThat(ff7CopyPrice).isEqualTo(VideoGame("Final Fantasy", "RPG", 90.00))

        val ff7Java = VideoGameJava("Final Fantasy", "RPG", 100.00)
        val ff7JavaCopy = ff7Java.copy()
        assertThat(ff7Java).isEqualTo(ff7JavaCopy)
    }

}