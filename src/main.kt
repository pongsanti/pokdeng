import com.popsicle.model.Deck
import com.popsicle.model.Game

/**
 * Created by popsicle on 4/15/17.
 */
fun main(args : Array<String>) {

    val deck = Deck().shuffle()
    println(deck.cards)
    println(deck.cards.size)

    val g = Game()
}