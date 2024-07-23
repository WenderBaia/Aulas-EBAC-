package com.wenderson.exercicio38.exercicio3

import kotlin.collections.indices
import kotlin.collections.indices as indices1

class exercicio {
}

fun main() {
    //exercicio 1
  /*  var numero = 6
        numero = 5
    println(numero)*/

    //exercicio 2
  /*  val numero = 6
        numero = 7
    println(numero)*/
  //O que aconteceu? Não se pode alterar o valor de uma variável imutável.

    //exercicio 3
   /* var numero = 35984
    var parImpar: String
        /*parImpar = if(numero % 2 == 0) "O número é Par" else "O número é Impar"
          println(parImpar) */

        parImpar = when{
        numero % 2 == 0 -> "O número é Par"
        else -> "O número é Impar"
    }
    println(parImpar)*/

     //exercicio 4
  /*var array : IntArray = IntArray(40)
   for(i in array.indices){
    array[i] = i * 1
    println(array[i])
    } */

    //exercicio 05
 val inteiro: List<Int> = listOf(1, 5 , 6, 8 , 6 ,4 ,7 ,5 ,5 ,8 ,9 , 44 ,88 ,44 ,66 ,33)
 for(i in inteiro.indices)
  println(inteiro[i])
 }

