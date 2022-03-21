import kotlin.random.Random

fun main() {
    print("Waktu Sekarang: ")
    var waktu = readLine()
    print("Nama Anda: ")
    var namaLengkap = readLine()
    print("Umur Anda: ")
    var umur = readLine()
    print("Suhu Tubuh Anda: ")
    var suhu = readLine()

//    var randomSuhu = String.format("%.2f", Random.nextDouble(35.00, 37.00))
//    println("Suhu Tubuh anda $randomSuhu derajat Celcius.")

    println("Selamat $waktu, $namaLengkap.")
    println("Umur anda $umur Tahun.")
    println("Suhu Tubuh anda $suhu derajat Celcius.")

}

