import java.util.*

fun main() {
    val input: Scanner = Scanner(System.`in`)
    print("Input Bilangan = ")

    var bilangan = input.nextInt()
    var kelipatan = 0
    var ulang = 0

    while (ulang < 5) {
        kelipatan += bilangan
        if (kelipatan % 2 == 0 || kelipatan % 3 == 0) {
            print(kelipatan)
            print(" ")
            ulang++
        }
    }
}