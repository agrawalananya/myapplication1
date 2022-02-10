package com.example.myapplication

fun main() {
solve()
    print(finall(5,10,::add ))
}
fun solve()
{
    println("this is a normal mesage")
    print(add(3,5))
}

 inline fun add(x:Int,y:Int):Int
{
    print(" hi, this is inline function ")
    return x+y
}
fun finall(a:Int,b:Int,add:(Int,Int)->Int):Int
{
  val result=add(a,b)
    return (result)
}