package com.popsicle.model

/**
 * Created by popsicle on 4/15/17.
 */
class Player(name: String) {
    val name: String = name
    var score = 0
    val cards = mutableListOf<Card>()

    fun receives(c: Card) {
        cards.add(c)
    }

    override fun toString(): String {
        return "Player(name='$name', score=$score, cards=$cards)"
    }
}
