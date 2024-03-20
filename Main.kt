// Page 8
import java.io.File
import jdk.jfr.Name

// Hello World
fun page9() {
    println("Fatih Arslan")
    print("Fatih\n")
    print("Arslan")
}

// Functions
fun page10() {
    fun product(x: Int, y: Int): Int {
        return x * y
    }

    val productLambda: (x: Int, y: Int) -> Int = { x, y -> x * y }

    product(20, 40).also(::println)
    productLambda(30, 40).also(::println)
}

// Variables
fun page11() {
    // Write some primitive types
    val a: Int = 10
    val b: Long = 1000000000000000000
    val c: Float = 10.0f
    val d: Double = 10.0
    var e: String = "Hello"
    val f = 10
    e += " World"
}

// Classes and examples
fun page12() {
    open class Food {
        val name: String = "Food"
        val price: Double = 0.0
    }

    class Burger : Food()
    class Pizza : Food()

    val burger = Burger()
    burger.name.also(::println)
    val pizza: Food = Pizza()
    pizza.price.also(::println)
}

fun page13() {
    open class Car {
        open fun drive() {
            println("Driving a car")
        }
    }

    class BMW : Car() {
        override fun drive() {
            println("Driving a BMW")
        }
    }
}

// String
fun page14() {
    val name = "Fatih"
    val surname = "Arslan"
    val fullName = "$name $surname"
    val fullNameWithDash = "$name-$surname"
}

// Conditionals
fun page15() {
    fun minOf(a: Int, b: Int): Int {
        return if (a < b) {
            a
        } else {
            b
        }
    }

    fun minOfInOneLine(a: Int, b: Int) = if (a < b) a else b
}

// For loops
fun page16() {
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }
    for (index in numbers.indices) {
        println(numbers[index])
    }
}

// While loops
fun page17() {
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}

// When usage
fun page18() {
    fun chooseFood(food: String) {
        when (food) {
            "Burger" -> println("Burger is chosen")
            "Pizza" -> println("Pizza is chosen")
            else -> println("Unknown food")
        }
    }

    chooseFood("Burger")
}

// Ranges
fun page19() {
    val numbers = 1..10
    for (number in numbers) {
        println(number)
    }

    val words = listOf("Fatih", "Arslan", "Kotlin", "Java")
    for (word in words.subList(0, 2)) {
        println(word)
    }

    if (10 in numbers) {
        println("10 is in the range")
    }

    if (20 !in numbers) {
        println("20 is not in the range")
    }
}

// Collections
fun page20() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubledNumbers = numbers.map { it * 2 }
    val evenNumbers = numbers.filter { it % 2 == 0 }
    val sum = numbers.reduce { acc, i -> acc + i }
    println(doubledNumbers)
    println(evenNumbers)
    println(sum)
}

// Null safety and null check
fun page21() {
    fun printLength(str: String?) {
        if (str != null) {
            println(str.length)
        }
    }

    fun printLengthWithElvis(str: String?) {
        println(str?.length ?: 0)
    }

    printLength("Fatih")
    printLengthWithElvis(null)
}

// Type check
fun page22() {
    fun printLength(str: Any) {
        if (str is String) {
            println(str.length)
        }
    }

    printLength("Fatih")
}

// Code Rules
fun page23() {
    // OrderScreen.kt
    // OrderRoute.kt
    // UserRepository.kt
}

// Naming conventions - Page24
const val MAX_LENGTH = 100

class DatabaseService

var counter = 2

// Naming conventions
fun page25() {
    class Test {
        // @Test
        fun `test should return true`() {
            val a = 10
            val b = 20
            val result = a < b
            assert(result)
        }
    }
}

// Naming conventions
fun page26() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
}

// Modifiers order
fun page27() {
    // public - internal - protected - private
    // expect - actual
    // final - open - abstract - sealed - const
    // external - lateinit - tailrec - vararg - suspend - inner
    // enum - annotation - fun
    // companion - inline - infix - operator - data
}

// Annotations - Page28
@Name("Fatih")
fun printName(name: String) {
    println(name)
}

@Target(AnnotationTarget.PROPERTY)
annotation class Name

fun page29() {
    // @file:JvmName("UtilsHello")
    // package utils.hello
}

// long method name
fun page30() {
    fun thisIsAVeryLongMethod() {
        println("Hello")
    }

    // with long parameter
    fun thisIsAVeryLongMethodName(
        thisIsAVeryLongParameterName: Int
    ) {
        println("Hello")
    }
    println(thisIsAVeryLongMethod())
    println(thisIsAVeryLongMethodName(10))
}

// Single expression
fun page31() {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sumInOneLine(a: Int, b: Int) = a + b
    println(sum(10, 20))
    println(sumInOneLine(10, 20))
}

// single expression
fun page32() {
    fun total(numberOne: Int, numberTwo: Int): Int =
        numberOne + numberTwo + 10 * 20
    println(total(10, 20))
}

// get and set method
fun page33() {
    class User {
        var name: String = ""
            get() = field
            set(value) {
                field = value
            }
    }
    val user = User()
    user.name = "Fatih"
    println(user.name)
}

// control flow
fun page34() {
    fun isEven(number: Int): Boolean {
        return if (number % 2 == 0) {
            true
        } else {
            false
        }
    }

    try {
        val result = isEven(10)
        println(result)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("Finally block")
    }
}

// Idioms - Data class
fun page37() {
    data class Car(val name: String, val model: String)

    val car = Car("BMW", "X5")
}

// function with def parameter
fun page38() {
    fun printName(name: String = "Fatih", surname: String = "Arslan") {
        println("$name $surname")
    }
}

// list filtering
fun page39() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)
}

// in expression
fun page40() {
    val numbers = 1..10
    if (10 in numbers) {
        println("10 is in the range")
    }
}

// when expression
fun page41() {
    fun chooseCar(car: String) {
        when (car) {
            "BMW" -> println("BMW is chosen")
            "Mercedes" -> println("Mercedes is chosen")
            else -> println("Unknown car")
        }
    }
}

// read-only list
fun page42() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers)
}

// read-only map
fun page43() {
    val map = mapOf("name" to "Fatih", "surname" to "Arslan")
    println(map)
}

// map traverse with for loop
fun page44() {
    val map = mapOf("name" to "Fatih", "surname" to "Arslan")
    for ((key, value) in map) {
        println("$key -> $value")
    }
}

// lazy
fun page45() {
    val name: String by lazy {
        println("Name is initialized")
        "Fatih"
    }
    println(name)
}

// extension function
fun page46() {
    fun String.printLength() = println(this.length)
    "Fatih".printLength()
}

// Singleton
object Singleton {
    fun printName(name: String) {
        println(name)
    }
}

fun page47() = Singleton.printName("Fatih")

// Abstract class
fun page48() {
    abstract class Car {
        abstract fun drive()
    }

    class BMW : Car() {
        override fun drive() {
            println("Driving a BMW")
        }
    }
    val bmw: Car = BMW()
}

// File operation
fun page49() {
    fun readFile() {
        val file = File("file.txt")
        val text = file.readText()
        file.listFiles()?.forEach(::println)
        println(text)
    }
    readFile()
}

// File operation
fun page50() {
    val files = File("src").listFiles()
    files?.size?.also(::println) ?: run {
        println("No files found")
    }
}

// throw exception in elvis
fun page51() {
    val name: String? = null
    val result = name ?: throw IllegalArgumentException("Name is null")
    println(result)
}

// first or null
fun page52() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val firstOrNull = numbers.firstOrNull { it > 10 }
    println(firstOrNull)
}

// let
fun page53() {
    val name: String? = "Fatih"
    name?.let {
        println(it)
    }
}

// let with default
fun page54() {
    val name: String? = null
    val result = name?.let {
        it
    } ?: "Default"
    println(result)
}

// return from when
fun page55() {
    fun chooseCar(car: String) {
        return when (car) {
            "BMW" -> println("BMW is chosen")
            "Mercedes" -> println("Mercedes is chosen")
            else -> println("Unknown car")
        }
    }
    println(chooseCar("BMW"))
}

// try-catch
fun page56() {
    val sum = try {
        val a = 10
        val b = 20
        a + b
    } catch (e: Exception) {
        0
    }
    println(sum)
}

// if-else to variable
fun page58() {
    val car = if (true) "BMW" else "Mercedes"
    println(car)
}

// apply
fun page59() {
    class Car {
        var name: String = ""
        var model: String = ""
    }

    val car = Car().apply {
        name = "BMW"
        model = "X5"
    }.also(::println)
}

// single expression function
fun page60() = 30

// with function
fun page61() {
    class Car {
        var name: String = ""
        var model: String = ""
    }

    val car = Car()
    with(car) {
        name = "BMW"
        model = "X5"
    }
}

// apply
fun page62() {
    class Car {
        var name: String = ""
        var model: String = ""
    }

    val car = Car().apply {
        name = "BMW"
        model = "X5"
    }
    println(car.name)
}

// files input stream
fun page63() {
    val file = File("file.txt")
    val inputStream = file.inputStream()
    val text = inputStream.bufferedReader().use { it.readText() }
    println(text)
}

// generic with inline - page64
inline fun <reified T> printType() {
    println(T::class.isData)
}

// also
fun page65() {
    val name = "Fatih"
    name.also(::println)
}

// TODO
fun page66() {
    fun calculateSum(a: Int, b: Int): Int = TODO("Not implemented yet")
}

// default parameter and named parameter
fun page67() {
    fun printName(name: String = "Fatih", surname: String) {
        println("$name $surname")
    }

    printName(surname = "Surname")
}

// infix
fun page68() {
    infix fun String.isEqual(other: String) = this == other
    val result = "Fatih" isEqual "Arslan"
    println(result)
}

// operator
fun page69() {
    operator fun Int.times(str: String) = str.repeat(this)
    val result = 3 * "Fatih"
    println(result)
}

// function with vararg
fun page70() {
    fun printNames(vararg names: String) {
        names.forEach(::println)
    }

    printNames("Fatih", "Arslan", "Kotlin")
}

// variables
fun page71() {
    val name: String = "Fatih"
    var surname: String = "Arslan"
    surname = "Kotlin"
    val age: Int = 25
    val isStudent: Boolean = true
    println("$name $surname $age $isStudent")
}

// null safety
fun page72() {
    val name: String? = null
    val result = name?.length ?: 0
    println(result)
}

// null safety with function
fun page73() {
    fun isEven(number: Int?): Boolean {
        return number?.let { it % 2 == 0 } ?: false
    }
    val result = isEven(10)
    println(result)
}

// classes
fun page74() {
    class Car(val name: String, val model: String)
    val car = Car("BMW", "X5")
    println(car.name)
}

// Generics
fun page75() {
    class Box<T>(t: T) {
        var value = t
    }

    // give me more large example
    class Stack<T> {
        var elements: MutableList<T> = mutableListOf()
        fun push(element: T) = elements.add(element)
        fun pop(): T = elements.removeAt(elements.size - 1)
    }

    val stack = Stack<Int>()
    stack.push(10)
    stack.push(20)
    val box = Box(10)
}

// generic function
fun page76() {
    fun <T> printType(t: T) {
        println(t)
    }
}

// inheritance
fun page77() {
    open class Car(val name: String, val model: String)
    class BMW(name: String, model: String) : Car(name, model)
}

// inheritance with parameterized constructor
fun page78() {
    open class Car(val name: String, val model: String)
    class BMW(name: String, model: String, val year: Int) : Car(name, model)
    val bmw = BMW("BMW", "X5", 2021)
    println(bmw.year)
}

// inheritance arguments to super class
fun page79() {
    open class Dog(val name: String, val breed: String)
    class Cat(name: String, val color: String) : Dog(name, "Unknown")
    val cat = Cat("Kitty", "White")
    println(cat.breed)
}

// control flow
fun page80() {
    when (val number = 10) {
        10 -> println("Number is 10")
        else -> println("Number is unknown")
    }
    val number = 11
    if (number == 10) {
        println("Number is 10")
    } else {
        println("Number is unknown")
    }
}

// when assign
fun page81() {
    val number = 10
    val result = when (number) {
        10 -> "Number is 10"
        else -> "Number is unknown"
    }
    println(result)
}

// for loop
fun page82() {
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }
}

// while loop
fun page83() {
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}

// do-while loop
fun page84() {
    var x = 0
    do {
        println(x)
        x++
    } while (x < 10)
}

// ranges
fun page85() {
    val numbers = 1..10
    for (number in numbers) {
        println(number)
    }

    val words = listOf("Fatih", "Arslan", "Kotlin", "Java")
    for (i in 3..<words.size) {
        println(words[i])
    }

}

// range with step
fun page86() {
    val numbers = 1..10 step 2
    for (number in numbers) {
        println(number)
    }
}

// if with in
fun page87() {
    val number = 10
    if (number in 1..10) {
        println("Number is in the range")
    }
}

// equality == , ===
fun page88() {
    val a = 10
    val b = 10
    if (a == b) {
        println("a and b are equal")
    }
    val c = 10
    val d = 10
    if (c === d) {
        println("c and d are equal")
    }
}

// conditional expression
fun page89() {
    val a = 10
    val b = 20
    val result = if (a < b) a else b
    println(result)
}

// data class
fun page90() {
    data class Car(val name: String, val model: String)
    val car1 = Car("BMW", "X5")
    val car2 = Car("BMW", "X5")
    if (car1 == car2) {
        println("Car1 and Car2 are equal")
    }

    if (car1.equals(car2)) {
        println("Car1 and Car2 are equal")
    }

    val car3 = car1.copy(model = "X6")
    println(car3)

    println(car1.toString())
}

// data class with component
fun page91() {
    data class Car(val name: String, val model: String)
    val car = Car("BMW", "X5")
    val (name, model) = car
    println(name)
    println(model)
}
