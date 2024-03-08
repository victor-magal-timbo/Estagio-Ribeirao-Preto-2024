/*
5.Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;
*/

fun main(){
  var palavra = "bom dia"
  var contrario = " "
  var j:Int = 0
  for(i in (palavra.length-1) downTo 0){
    contrario[j] = palavra[i]
    j++
  }
}
