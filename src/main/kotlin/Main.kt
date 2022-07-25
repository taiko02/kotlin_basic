fun  main(){
    val array: Array<Any>
    array = arrayOf(2,3,4,5,"sasa",true)

    val list: List<Any>
    list = listOf(2,3,4,5,"sasa",true)

    val set: Set<Any>
    set = setOf(2,3,4,5,"sasa",true)

    //Atau cara simple nya dibawah ini
    val data = listOf<Any>("string",12,"mantap") //Tambahkan tipe data dalam <> untuk deklarisikan isi array

    // Contoh Map
//    val data1:Map<String, String> //map harus dua tipe data <key, value>
    val data1 = mapOf<String, Any>(
        "a" to 12, //value harus sesuai dengan key dan value
        "b" to "Banana"
    )
    println(data1.keys) //pemanggilan data bisa menggunakan getValue atau [](kurung siku)
                        //atau values untuk tampilkan semua data
                        //atau keys untuk melihat key apa saja dalam data

//    val union = data.union(data1) //union : menggabungkan data lalu mencari nilai yang sama
//    val union = data.intersect(data1) //intersect : hanya mencetak nilai yang sama
//    println(data1[1])
}