package main

import stratpat.bird
import stratpat.fish

fun main(args: Array<String>) {
    testStratPat()
}
fun testStratPat{
    val a= bird("raven")
    val b = fish("catfish") 
    a.flyon()
    b.flyon()
}