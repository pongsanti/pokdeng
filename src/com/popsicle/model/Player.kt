package com.popsicle.model

import com.popsicle.util.Draw

/**
 * Created by popsicle on 4/15/17.
 */
class Player(name: String) {
    val name: String = name
    var credit: Long = 1000
    val cards = mutableListOf<Card>()
    var currentRoom: Room? = null

    fun getInto(r: Room): Player {
        println("$name getting into $r")
        r.addObserver(this)
        currentRoom = r
        return this
    }

    fun leave(r: Room): Player {
        r.removeObserver(this)
        currentRoom = null
        return this
    }

    fun ready(): Player {
        println("$name is getting ready in $currentRoom")
        currentRoom?.readyToPlay(this)
        return this
    }

    fun receives(c: Card) {
        cards.add(c)
    }

    fun printCards() {
        Draw.card(cards)
    }

    override fun toString(): String {
        return "Player(name='$name', credit=$credit, cards=$cards)"
    }
}
