package com.popsicle.util

import com.popsicle.model.Card

/**
 * Created by popsicle on 4/17/17.
 */
object Draw {

    val WIDTH = 10

    fun card(cs: List<Card>) {
        println()
        for(i in 1..WIDTH) { print("-") }
        println()
        cs.forEach { c -> card(c) }
        println()
        for(i in 1..WIDTH) { print("-") }
    }

    fun card(c:Card) {
        print(String.format("  | %2s ${c.suit.char} |  ", c.pip))
    }
}