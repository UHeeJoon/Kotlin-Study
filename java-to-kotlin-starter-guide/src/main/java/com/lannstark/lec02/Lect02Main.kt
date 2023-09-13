package com.lannstark.lec02

import java.lang.IllegalArgumentException

fun main() {
// safe call
    val str: String? = "ABC"
//    str.length // 불가능
    str?.length // 가능
    println(str)

//    Elvis 연산자 ?: 앞의 연산 결과가 null이면 뒤에 값 반환
    val str2: String? = "ABC"
    str?.length ?: 0
    println(str2?.length ?: 0)

}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어옴")
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWith4(str: String?) : Boolean {
    return str!!.startsWith("A")
}