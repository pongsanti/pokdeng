import com.popsicle.model.Game
import com.popsicle.model.Player

/**
 * Created by popsicle on 4/15/17.
 */
fun main(args : Array<String>) {
    val g = Game()
    println(g.deck.cards)

    val p1 = Player("P1")
    val p2 = Player("P2")
    val p3 = Player("P3")

    g.addPlayer(p1).addPlayer(p2).addPlayer(p3)
    g.distributeCardsToPlayers()
    g.printPlayers()
}