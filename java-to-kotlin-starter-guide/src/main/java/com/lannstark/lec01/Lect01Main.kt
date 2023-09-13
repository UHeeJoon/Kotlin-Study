package com.lannstark.lec01

fun main() {
//    코틀린은 타입을 컴파일러가 추론해줌
//    근데 : Long과 같이 Typescript처럼 작성해줄 수 있음

//    var number1 : Long  = 10L
//    동적 변수
    var number1 = 10L
//    정적 변수
    val number2 = 11L

//    var number1와 같이 명시적으로 작성해주지 않는 경우 오류
//    var number1 : Long과 같이 타입을 명시해주는 경우 컴파일 단계에서 오류가 나지 않지만 런타임 환경에서 오류남
//    val도 var와 마찬가, 정적 변수입에도 선언 후 초기화 하지 않았으면  최초 한번에 한하여 값 입력 가능함
//    ex) val number1 : Long
//    val = 5L

//    Primitive Type과 Reference Type을 구분하지 않아도 됨 | 자동으로 상황에 맞게 바꿔줌

//    Null이 들어갈 수 있는 변수는 타입 뒤에  ?를 붙어주어야 함
//    ex) var number2 : Long? = null
//        아예 다른타입으로 간주됨
}