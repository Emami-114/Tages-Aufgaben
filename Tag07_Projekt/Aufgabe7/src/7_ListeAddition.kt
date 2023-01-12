fun main() {
    // todo: Erstelle hier deinen Code.

    var list:MutableList<Int> = mutableListOf(4,8,3)
    var list2 : MutableList<Int> = mutableListOf(2,4,9)
    list.add(5)
    list2.add(6)
    val index = list.last() + list2[list2.size -1]
    println(index)
}