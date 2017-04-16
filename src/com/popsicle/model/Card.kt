package com.popsicle.model

/**
 * Created by popsicle on 4/15/17.
 */
data class Card(
        var pip: Int,
        var suit: Suit

) {
    override fun toString(): String {
        return "Card(pip=$pip, ${suit.char} ${suit})"
    }
}
