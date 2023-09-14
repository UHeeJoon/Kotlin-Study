package com.lannstark.lec09

import java.lang.IllegalArgumentException


fun main() {
    val person = Person("유희준", 100)
//    getter 호출할 필요 없이 그냥 씀
    println("${person.name} ${person.age}")
//    setter도 그냥 쓰면 됨
    person.age = 10
    println("${person.name} ${person.age}")

    val person2 = Person()
    println("${person2.age}   ${person2.name}")

}

// getter, setter 자동으로 만들어줌!!
/*
class Person constructor(name: String, age: Int) {
    val name: String = name;
    var age: Int = age;
}
 */
// 생성자 만들 때 위에 선언하는데 constructor 생략 가능
// 생성자로 선언과 동시에 초기화 가능
// 바디 비어있으면 생략 가능

// 결과
class Person(
//    주 생성자 | 반드시 존재 해야함
    val name: String = "유희준",
    var age: Int = 1
) {

    val uppercaseName: String
        get() = this.name.uppercase()

    //    init은 초기화 블럭 // 객체가 호출될 때 가장 먼저 호출
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블럭 호출")
    }

    /*
        //    클래스 내 함수 선언
        fun isAdult(): Boolean {
            return this.age >= 20
        }
    */
//  위 함수를 프로퍼티처럼 만들기
    val isAdult: Boolean
        get() = this.age >= 20
//    표현 식이 여러개일 때 = 말고 {}로 표현 가능


    /*
    //    아래의 부 생성자보다는 주 생성자에서 직접 선언하는 default parameter를 권장함
    //    ================
    //    부 생성자
        constructor(name: String) : this(name, 1) {
            println("첫 번째 부 생성자")
        }

    //    부 생성자가 주 생성자를 호출하기만 하면 중간에 다른 부 생성자 가도 상관 없음
        constructor() : this("홍길동") {
            println("두 번째 부 생성자")
        }
    //    ================
     */
}

// 필드가 없다면 괄호 생략 가능
class Student