package ru.netology

fun main() {
    println("������� ���������� ������")
    val likesString = readLine()
    val likes: Int = likesString!!.toInt()
    if (likes % 10 != 1) {
        println("���� ���������� " + likes + " �����")
    } else {
        println("���� ���������� " + likes + " ��������")
    }
}