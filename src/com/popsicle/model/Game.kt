package com.popsicle.model

/**
 * Created by popsicle on 4/15/17.
 */
class Game {
    val players = mutableListOf<Player>()
    val deck = Deck().shuffle()

    fun addPlayer(player: Player): Game {
        players.add(player)
        return this
    }

    fun distributeCardsToPlayers() {
        for (i in 1..2) {
            players.forEach { player ->
                val c = deck.pull()
                println("$player got $c")
                player.receives(c)
            }
        }
    }

    fun printPlayers() {
        players.forEach(::println)
    }
}