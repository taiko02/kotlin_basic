
fun main(args: Array<String>) {

    var harta = arrayOf("emas", "perak", "zonk")

    // contoh looping, .. spesial untuk kotlin menandakan <=
    for (i in 5..10){
        println("baris ke $i")
    }

    for (item in harta){
        println("Yeay dapat : $item")
    }

    // looping array menggunakan foreach
    harta.forEach { hartas -> println("contoh foreach : $hartas") }
    harta.forEachIndexed { index, hartas -> println("contoh foreach : $hartas index ke : $index") } // looping dan index

    // contoh looping variable
    var indeks: Int = 0

    for (i in 1..10){
        indeks++
        println("Counter ke $indeks")
    }
}