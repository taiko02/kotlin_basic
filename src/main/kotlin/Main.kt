fun main () {

    val number = 2
    val result = when (number){ //when bisa dimasukan kedalam variable
        1 -> { //untuk value yang banyak bisa menggunakan {}
            println("bernilai 1")
            print("betul number 1")
        }
        2 -> "Bernilai 2" //bisa langsung ada nilainya
        3 -> print("number bernilai 3")
        else -> print("number tidak ada yang cocok") //wajib menambahkan else jika ada variable
    }
    println(result)

}