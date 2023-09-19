fun main(args: Array<String>) {

    //задание 1
    fun printFullName(firstName: String, lastName: String) {
        println(firstName + " " + lastName)
    }
    printFullName("Алина", "Черкашина")

//задание 2
    var firstName = "Алина"
    var lastName = "Черкашина"
    printFullName(firstName, lastName)

    //задание 3
    fun calculateFullName(firstName: String, lastName: String) : String // для возращения
    {
        return "$lastName $firstName"
    }
    val myFullName = calculateFullName(lastName, firstName)

    //задание 4
    fun calculateFullNameAndLength (firstName:String, lastName:String): Pair<String,Int> {
        return Pair("$firstName $lastName", (firstName + lastName).length)
    }

    //задание 5
    fun function (number: Int): Boolean//позволяет возращать false и true
    {
        if (number <= 1) {
            println("число не является простым")
            return false }

        for (i in 2..<number) {

            if (number % i == 0) {
                return false }
        }
        println("число является простым")
        return true
    }
    println(function(-3)) //вводим число какое хотим проверить
    //
    //задание 6
    fun fibonacci(n: Int): Int {
        if (n <= 0) return 0
        if (n == 1 || n == 2) return 1

        var prev = 1
        var current = 1

        for (i in 3..n) {
            val next = prev + current
            prev = current
            current = next
        }

        return current
    }
    val n = 10 //Номер элемента последовательности, который надо найти
    val fibValue = fibonacci(n)
    println("Значение $n-го элемента последовательности Фибоначчи: $fibValue")
}
