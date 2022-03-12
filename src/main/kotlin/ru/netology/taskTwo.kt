package ru.netology

fun main() {
    val likes = 11
    val peoples = "людям"
    if (likes in 2..20) {
        println("Понравилось $likes $peoples")
    } else if (likes.toString().endsWith("1")) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes $peoples")
    }
}