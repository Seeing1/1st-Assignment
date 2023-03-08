fun main(args: Array<String>) {
    val end = 15
    var x = 0
    var y = 1

    for(i in 1..end) {
    print("$x ,")
    
    val sum = x + y
    x = y 
    y = sum
}
}