package com.lannstark.lec08

fun main() {
//    이런식으로 default parameter에 넣을 값을 지정해서 넣어줄 수 있음
    repeat("Hello World", useNewLine = false)

    printNamAndGender(name = "유희준", gender = "남자")

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)

}

fun printAll(vararg strings: String) {
    for(str in strings){
        println(str)
    }
}

fun max(a: Int, b: Int) = if (a > b) a else b

// default Parameter가 있음!!!
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
): Unit {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNamAndGender(name: String, gender: String) {
    println("${name} ${gender}")
}