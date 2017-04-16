package com.popsicle.model

/**
 * Created by popsicle on 4/17/17.
 */
class Room(name: String) {
    init {
        println("A room ${hashCode()}:'$name' created.")
    }
    var name = name
    val observers = mutableListOf<Player>()
    var game: Game = Game()

    fun addObserver(p: Player) {
        observers.add(p)
    }

    fun removeObserver(p: Player) {
        observers.remove(p)
    }

    fun readyToPlay(p: Player) {
        observers.remove(p)
        game.addPlayer(p)
    }

    fun startGame() {
        game.distributeCardsToPlayers()
    }

    override fun toString(): String {
        return "Room(name=$name, observers=$observers,\n in game=$game)"
    }
}