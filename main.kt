package main

import stratpat.bird
import stratpat.fish


import obspat.ZooPress
import obspat.ZooKeeper
import obspat.ZooPatron
import factpat.production
import factpat.vehicle
import sngtnpat.feedBox
import bldrpat.baker
import bldrpat.cake
import prttppat.Cell
import dcrtrpat.*
import cmdpat.*



fun main(args: Array<String>) {
    val ship = SpaceShip()
    val cmd1:command = takeOffCMD(ship)
    val spaceCap= captain()
    spaceCap.invoke(cmd1)
}
fun prttpTest(){
    val cell1:Cell=Cell.mitosis(true)
    val cell2:Cell=Cell.mitosis()
    val cell3:Cell=Cell.mitosis()
    cell1.intro()
    cell2.intro()
    cell3.intro()
}
fun dcrtrTest(): Unit {
    val pie_order: Pie= Apple(Orange(Cheese(plainPie())))
    
    println(pie_order.getdescription())
    println(pie_order.getCost())
    
    
}

fun bldrTest(): Unit {
    val bkr = baker()
    val cake1:cake =bkr.makeCake("vanilla", "red", "birth-day")
    val cake2:cake =bkr.makeCake("chocolet", "orange", "haloween")
    val cake3:cake =bkr.makeCake("strawbary", "white", "rose")
    println(cake1.toString())
    println(cake2.toString())
    println(cake3.toString())
}

fun sngtnTest(): Unit {
    val fb = feedBox.getInstance()
    println(fb?.feedAnimal(120))
    println(fb?.feedAnimal(120))
    println(fb?.feedAnimal(120))
    println(fb?.feedAnimal(200))
    println(fb?.feedAnimal(200))
    println(fb?.feedAnimal(200))
    println(fb?.feedAnimal(200))
    println(fb?.feedAnimal(200))
    println(fb?.feedAnimal(4))
    println(fb?.feedAnimal(36))
}

fun factTest(){
    while (true){
        println("pick a vehicle [car(c), truck (k), bike(b)] (q to quit)")
        val usr_input = readLine()
        if (usr_input =="q" || usr_input==null){
            break
        }
        else {
        println("name your brand (q to quit)")

            val usr_input2 = readLine()
            if(usr_input2=="q" || usr_input2==null ){
                break
            }
            else{
            val my_vehicle = production.makeVehicle(usr_input, usr_input2)
            if(my_vehicle!=null) my_vehicle.intro()
            }
        }
    }
}
 
fun testStratPat(){
    val a= bird("raven")
    val b = fish("catfish") 
    a.flyon()
    b.flyon()
}
fun testObsPat(){
    val zp = ZooPress()
    val brian = ZooKeeper("brian")
    val amy = ZooKeeper("amy")
    val anne = ZooPatron("anne")
    zp.register(amy)
    zp.register(brian)
    zp.register(anne)
    zp.tellAll()
    println("__________")
    zp.unregister(brian)
    zp.tellAll()
}