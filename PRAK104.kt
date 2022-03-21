class teknologi(){
    var jenis:String = ""
    var nama:String = ""
    var tahun:String = ""
    var produsen:String = ""

    fun printData(){
        println("""
            Detail $jenis
            Nama : $nama
            Tahun Rilis : $tahun
            Produsen : $produsen
            
        """.trimIndent())
    }
}

fun main() {
    var teknologi1 = teknologi()
    teknologi1.jenis = "HP"
    teknologi1.nama = "Realme XT"
    teknologi1.tahun = "2020"
    teknologi1.produsen = "Realme"
    teknologi1.printData()

    var teknologi2 = teknologi()
    teknologi2.jenis = "Laptop"
    teknologi2.nama = "Asus Vivobook K413EQ"
    teknologi2.tahun = "2021"
    teknologi2.produsen = "Asus"
    teknologi2.printData()
}