package com.sam.kotlinspringbootdemo

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

fun main() {
    val url:String = "jdbc:oracle:thin:@localhost:1521:xe"
    val username:String = "samtest"
    val password:String = "123456"
    var con: Connection? = null
    try {
    println("connect to $url")
        con = DriverManager.getConnection(url,username,password)
    println("connect $con successfully (連線成功！)")
    }catch (e: SQLException){
        e.stackTrace
    }finally {
        con?.close()
    }

}