package com.popsicle.model

/**
 * Created by popsicle on 4/15/17.
 */
class Game {
    val players = mutableListOf<Player>()

    fun addPlayer(player: Player): Game {
        players.add(player)
        return this
    }
}