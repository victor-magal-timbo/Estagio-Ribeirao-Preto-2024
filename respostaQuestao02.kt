fun main() {
    try {
        print("Digite um número da sequência de Fibonacci: ")
        val num = readLine()?.toInt()!! ?: 0
        val pos = fib(num)
        if(pos != -1){
            println("\nEntrada: $num Posição: ${pos}")
        }else{
            throw Exception("\nO número digitado não pertence a sequência de Fibonacci")
        }
    }catch (e: Exception){
        println(e.message)
    }
}

fun fib(valor: Int):Int{
    var a = 0
    var b = 1
    var c: Int
    val vet = IntArray(40,{i -> 0})
    for(i in 1 until 41){
        c = a + b
        a = b
        b = c
        vet[i-1] = c
    }
    var vev = 0
    for(i in vet){
        if(valor == vet[i]){
            vev = i+2
            break
        }else{
            vev = -1
        }
    }
    return vev
}
