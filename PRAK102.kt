import java.util.Scanner

fun main() {
    val input: Scanner = Scanner(System.`in`)
    print("Nilai x = ")
    rumus(input.nextInt())
}

fun rumus(nilaiX:Int){
    var hasil = (2 * nilaiX * nilaiX) + (5 * nilaiX) - 8
    print(hasil)
}
