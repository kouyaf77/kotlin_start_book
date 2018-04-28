/* Basic types
Double, Float, Long, Int, Short, Byte
Boolean, Char, String
 */

// Variable
val foo: Int = 123
val bar: String = "Hello"

val baz: Long = "Hello" // Fail compile

// Use var instead of val if you want to assign something to the variable
var a: Int  = 5
a = 3

// You can write like
val name = "Taro"
"Hello $name!"

// Array
val ints = arrayOfNulls<Int>(5)
val strs = arrayOf("red", "green", "blue")
val ints: IntArray = intArrayOf(1, 2, 3)
val chars: CharArray = charArrayOf('a', 'b')

// List
val ints: List<Int> = listOf<Int>(1, 2, 3)
val chars: MutableList<Char> = mutableListOf('a', 'b')
chars += 'x'
char -= 'x'
chars.removeAt(0)

// Set
val ints: Set<Int> = setOf(1, 2, 1, 3)
val chars: MutableSet<Char> = mutableSetOf('a', 'a', 'b')
chars -= 'a'

// Map
val numberMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
numberMap["one"]
numberMap += "three" to 3

// Range
val range: IntRange = 12..15
5 in range
5 !in range
(1..5).toList()
(1..5).reversed().toList()
(5 downTo 1).toList()
(1..5 step 3).toList()
(100 downTo 0 step 25).toList()

// if
if (true)
    println("hello")

if (5 in 1..10) {
    println("wawa")
    println("hoho")
}

val score = 50
if (score >= 60) {
    println("合格")
} else {
    println("不合格")
}
val message = if (score >= 60) "合格" else "不合格"

val x = if (true) {
    1
    2
} else {
    3
}
x // Output 2

val score = 75
val grade =
        if (score > 90) 'A'
        else if (score >= 80) 'B'
        else if (score >= 70) 'C'
        else if (score >= 60) 'D'
        else 'F'
grade // Output C


when (x) {
    1 -> "one"
    2, 3 -> "two or three"
    else -> {
        "unknown"
    }
}

when (x) {
    1 -> "one"
    myFavoriteInt() -> "Favorite: $x"
    in 2..10 "1 <= x <= 10"
    else -> x.toString()
}

val blank = when (x) {
    is String -> x.isBlank()
    else -> true
}

when {
    score >= 90 -> 'A'
    score >= 80 -> 'B'
    score >= 70 -> 'C'
    score >= 60 -> 'D'
    else        -> 'F'
}

// Loop

var count = 3
while (count-- > 0) {
    println("Hello")
}

do {
    println("Hello")
    val next = Math.random() < 0.5
} while (next)

// For
for (x in arrayOf(1, 2, 3)) {
    println(x)
}

val names = listOf("foo", "bar", "baz")
for (name in names) {
    println(name)
}

for (i in 1..10 step 2) {
    println(i)
}

val names = listOf("foo", "bar", "baz")
var barIndex = -1
for (index in names.indices) {
    if (names[index] == "bar") {
        barIndex = index
        break
    }
}

loop@ for (x in 1..10) {
    for (y in 1..10) {
        if (y == 5)
            break@loop
    }
}
