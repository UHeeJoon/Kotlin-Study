package com.lannstark.lec04

fun main() {
//    val money1 = JavaMoney(2_000L)
//    val money2 = JavaMoney(1_000L)
//
//      객체 비교시 자동으로 compareTo 호출해줌
//    if(money1 > money2){
//        println("money1이 더 큼")
//    }

    
//    ===은 주소비교 (동일성)/ ==은 값 비교 (동등성)
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 === money2)
    println(money2 === money3)
    println(money2 == money3)

//  in /!in 연산자
//  컬렉션이나 범위에 포함되어 있다. 포함되어 있지 않다.

//   a..b
//    a부터 b까지의 범위 객체를 생성한다
    
    
//   연산자 오버로딩
    val money4 = Money(1_000L)
    val money5 = Money(1_000L)

    println(money4 + money5)

}