
fun main(args: Array<String>) {

    var nama: Array<String> = arrayOf("hilman","makssss","anto")

    // mengubah array menjadi list
    println(nama.toList())

    // cek panjang array
    println(nama.size)

    // memanggil salah satu data array
    println(nama[2]) //anto
    println(nama.get(1)) // bisa juga dengan get

    // ubah data array
    nama[0] = "hilda"
    println(nama[0]) //hilda

    nama.set(0,"hildoss") // atau bisa seperti ini
    println(nama[0]) //hildoss


}