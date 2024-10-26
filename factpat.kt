package factpat
abstract class vehicle(val brand: String, val wheels: Int, val load:Int){
    fun intro(): Unit {
        println("i am a "+ this.javaClass.simpleName + " from brand "+ brand +" i have "+wheels+" wheels ")
    }
}
class car(brand:String):vehicle(brand, 4, 400)
class truck(brand:String):vehicle(brand, 6, 800)
class bike(brand:String):vehicle(brand, 2, 120)
class production (){
    companion object{
        fun makeVehicle(type:String, brand:String):vehicle?{
            when(type){
                "c"-> return car(brand)
                "t"-> return truck(brand)
                "b"-> return bike(brand)
                else->{
                    return null
                }
            }
        }
    }
}