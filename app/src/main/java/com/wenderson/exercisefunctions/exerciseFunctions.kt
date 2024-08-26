package com.wenderson.exercisefunctions

class exerciseFunctions {
}

fun main() {
    //CALCULADORA SOMA
    sum(10,5)

    //CALCULADORA COMPACTA
    val resultMult = mult(10,5)
    println(resultMult)

    //CALCULADORA QUE RECEBE UMA FUNÇÃO COMO PARÂMETRO
    val num1 = 10
    val num2 = 5

    val resultadoSoma = calcular(num1, num2, ::soma)
    println("Soma: $resultadoSoma")

    val resultadoSubtracao = calcular(num1, num2, ::subtracao)
    println("Subtração: $resultadoSubtracao")

}

fun sum(val1: Int, val2: Int) {
    val result = val1 + val2
    println(result)
}

fun mult(val1: Int, val2: Int) = val1 * val2

//CALCULADORA QUE RECEBE UMA FUNÇÃO COMO PARÂMETRO
fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(a, b)
}

// Funções de operação
fun soma(a: Int, b: Int): Int {
    return a + b
}

fun subtracao(a: Int, b: Int): Int {
    return a - b
}


