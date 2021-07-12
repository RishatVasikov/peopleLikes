package ru.netology

fun main() {
    println("Введите количество лайков")
    val likesString = readLine()
    val likes: Int = likesString!!.toInt()
    if (likes % 10 != 1) {
        println("Пост понравился " + likes + " людям")
    } else {
        println("Пост понравился " + likes + " человеку")
    }
}