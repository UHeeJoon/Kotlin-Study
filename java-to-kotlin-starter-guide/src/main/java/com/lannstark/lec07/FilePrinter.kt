package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
// kotlin에서는 exception체크 안함
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile2(path : String){
//        try-with-resources가 없어짐 -> use사용
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}