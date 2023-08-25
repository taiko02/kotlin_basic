fun main(args: Array<String>) {
    // contoh input dari user
    println("Masukan nama kamu")
    var umurOrang: String = readln()

    println("Masukan umur kamu")
    val nama:Int = readln().toInt()

    if (nama <= 20){
        println("Maaf minimal 20 tahun")
        return
    }

    println("Umur : $umurOrang Nama : $nama")
}