import com.popsicle.model.Player
import com.popsicle.model.Room

/**
 * Created by popsicle on 4/15/17.
 */
fun main(args: Array<String>) {
    val room = Room("Easy room")

    val p1 = Player("P1").getInto(room)
    val p2 = Player("P2").getInto(room)
    val p3 = Player("P3").getInto(room)

    println(room)

    p1.ready()
    p2.ready()
    p3.ready()

    println(room)

    room.startGame()

    p1.printCards()
    p2.printCards()
    p3.printCards()

}