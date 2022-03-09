import kotlin.math.pow
import kotlin.math.sqrt

/*fun main() {
    /*
    Faça um programa que receba a idade de uma pessoa e mostre na saída em
     qual categoria ela se encontra: 10-14 infantil /  15-17 juvenil / 18-25 adulto
     */
    println("SISTEMA DE IDADE DE CLASSIFICAÇÃO\n\n")
    println("Digite sua idade: ")
    val age = readLine()!!.toInt()
    println("Sua idade é de: $age anos")

    when (age){
        in 10..14 -> println("Você está na Liga Infantil")
        in 15..17 ->println("Você está na Liga Juvenil")
        in 18 ..25 -> println("Você está na Categoria Adulto!")
        else -> println ("Você não se encaixa em nenhuma categoria")}

            }*/
/*
fun main (){

//Faça um programa que o usuário digite um número e o programa retorne o mês referente ao valor.}

    print("Digite um número para ter o mês correspondente: ")
    val mes = readLine()!!.toInt()

    when(mes) {

        1 -> println("JANEIRO")
        2 -> println("FEVEREIRO")
        3 -> println("MARÇO")
        4 -> println("ABRIL")
        5 -> println("MAIO")
        6 -> println("JUNHO")
        7 -> println("JULHO")
        8 -> println("AGOSTO")
        9 -> println("SETEMBRO")
        10 -> println("OUTUBRO")
        11 -> println("NOVEMBRO")
        12 -> println("DEZEMBRO")
        else -> println("Valor Incorreto!") }
    }*/

/*
fun main () {
    /*
    Faça um programa em que permita a entrada de um número qualquer e exiba se este
     número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
     ímpar exiba o número elevado ao quadrado.
     */

    print("Digite um número: ")
    val num = readLine()!!.toDouble()

    if ((num %2 == 0.0) && (num %3 != 0.0)) {println ("O número digitado foi $num, e sua raiz quadrada " +
            "é ${sqrt(num)}")}
        else { println ("O número digitado foi $num, e seu número ao quadrado é ${num.pow(2)}") }
}
*/
/*
fun main (){
//Faça um programa que entre com três números e coloque em ordem crescente.
    var temp = 0

    print("Digite o primeiro número: ")
    var n1 = readLine()!!.toInt()
    print("Digite o segundo número: ")
    var n2 = readLine()!!.toInt()
    print("Digite o terceiro número: ")
    var n3 = readLine()!!.toInt()

    if((n1 > n3 || n1 > n2 ||n3 > n2)) {

        if(n1 > n2) {
            temp = n1
            n1 = n2
            n2= temp
        }

        if(n1 > n3) {
            temp = n1
            n1 = n3
            n3= temp

        }
        if(n2 > n3) {
            temp = n3
            n3 = n2
            n2= temp
        }


    }
    //while(n1 > n3 || n1 > n2 ||n3 > n2)

    println ("$n1,$n2,$n3")
*/

/*
    print("Digite o primeiro número: ")
    val n1 = readLine()!!.toInt()
    print("Digite o segundo número: ")
    val n2 = readLine()!!.toInt()
    print("Digite o terceiro número: ")
    val n3 = readLine()!!.toInt()

    if (n3 > n1)
        if (n1 > n2)
            println("A ordem crescente $n2, $n1, $n3")
        else if (n2 < n3)
            println("A ordem crescente:$n1, $n2, $n3")
    if (n1 > n2)
        if (n2 > n3)
            println("A ordem crescente:$n3, $n2, $n1")
        else if (n3 < n1)
            println("A ordem crescente:$n2, $n3, $n1")
    if (n1 < n2)
        if (n3 < n1)
            println("A ordem crescente: $n3, $n1, $n2")
        else if (n3 < n2)
            println("A ordem crescente:$n1, $n3, $n2")
}
*/
fun main (){
//Faça um programa que receba três inteiros e diga qual deles é o maior.

    var maior : Int= 0

    for (qua in 1..3) {

        print("Digite um número: ")
        val n1 = readLine()!!.toInt()

            if (n1 > maior) { maior = n1}
    }

            print("$maior")

    }




