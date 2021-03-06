package com.popsicle.model

import java.util.*

/**
 * Created by popsicle on 4/15/17.
 */
class Deck {
    companion object {
        val pips: IntRange = 1..13
    }

    val cards = mutableListOf<Card>()

    init {
        for (suit: Suit in Suit.values()) {
            pips.forEach { pip -> cards.add(Card(pip, suit)) }
        }
    }

    fun shuffle(): Deck {
        Collections.shuffle(cards)
        return this
    }

    fun pull(): Card {
        return cards.removeAt(cards.size - 1)
    }

    override fun toString(): String {
        return "Deck(cards=$cards)"
    }

}