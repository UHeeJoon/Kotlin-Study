package com.lannstark.lec03

/*
    코틀린에만 존재하는 타입 3가지
    
    1. Any
        Java의 Object역할
        
        모든 Primitive Type의 최상의 타입도 Any
        
        Any자체로는 null을 포함할 수 없어 null을 포함하고 싶으면 Any?로 표현
        
        Any에 equals/ hashCode/ toString 존재

    2. Unit
        Unit은 Java void와 동일한 역할.
        
        void와 다르게 Unitd은 그 자체로 타입 인자 사용 가능
        
        함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현


    3. Nothing
        Nothing은 함수가 정상적으로 끝나지 않았다는 것을 의미
        
        무조건 예외를 반환하는 함수 / 무한루프 함수 등

 */

fun main() {
//    코틀린에서는 타입간의 변환이 명시적으로 이루어져야 한다.
//    val number1 = 3L
//    val number2 : Long = number1.toLong()
    val number1 : Int? = 3
    val number2 : Long = number1?.toLong() ?: 0L


//    ================================================

//    String interpolation/ String indexing

    val person = Person("유희준" , 24)
//    String.format대신 ${}사용, 근데 객체 참조변수가 아니라 일반 변수일 경우 {} 생략 가능 하지만 가독성 면에 좋지 않아 비추
    val name = "유희준"
//    val log = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."
    val log = "사람의 이름은 $name \b이고 나이는 ${person.age}세 입니다."

    println(log)


    val message = """
        ASDF
        DFF
        ${name}
        sdfl
    """.trimIndent()

    println(message)

    println(log[4])

}

fun printAgeIfPerson(obj : Any){
//    is는 instanceof
    if(obj is  Person){
//        as Person 은 (Person)으로 하는 것과 같은데 생략 가능
//        val person = obj as Person
//        println(person.age)

//    if에서 타입 체크 해줬으니 스마트 캐스트라함
       println(obj.age)
    }

//    instanceof의 반대는
    if(obj !is Person){

    }

}

// null이 가능할 때
fun printAgeIfPerson2(obj : Any?){
    val person = obj as? Person
    println(person?.age)
}