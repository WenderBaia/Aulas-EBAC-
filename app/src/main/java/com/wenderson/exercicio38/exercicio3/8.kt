package com.wenderson.exercicio38.exercicio3

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
    var array : Array<String> = Array(40) {i -> "$i"}
    for(i in array.indices){
        println(array[i])
    }
 }