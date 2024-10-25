package obspat

import kotlin.collections.MutableList
import kotlin.collections.mutableListOf
interface publisher{
    fun register(observer:Observer)
    fun unregister(observer:Observer)
    fun tellAll()
}
interface Observer{
    fun update()
}
class ZooPress():publisher {

    val observers = mutableListOf<Observer>()
    override fun register(observer:Observer) {

        observers.add(observer)

     }

    override fun unregister(observer:Observer) {

        observers.remove(observer)

     }
    override fun tellAll() { 
        for (observer in observers) {
            observer.update()
        }
    }
}
class ZooKeeper(val name:String):Observer{

    override fun update() {
        println(name+": I was updated")
     }
    
}
class ZooPatron(val name:String):Observer{

    override fun update() {
        println(name+": I was updated")
     }
    
}