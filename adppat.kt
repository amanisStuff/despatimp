package adppat
class RailCar {
    public var loadInKg:Int;
    constructor(loadInKg:Int){
        this.loadInKg = loadInKg
    }
}
class car {
    public var loadInKg:Int;
    public var weight:Int;
    
    constructor(loadInKg:Int,weight:Int){
        this.loadInKg = loadInKg
        this.weight = weight
        
    }
}
interface carAdapter{
    fun getRailCar():RailCar
}
class carToRailCar(val car:car):carAdapter{
    override fun getRailCar(): RailCar {
        var totalWeight = car.loadInKg + car.weight
        return RailCar(totalWeight)
    }
}

class train{
    private var cars: Array<RailCar?> = arrayOfNulls(0);
    fun addCar(car:RailCar){
        cars.size
        cars += car

        println(cars.size)

    }
    fun getTotalwheight():Int{
        var totalWeight = 0
        for (car in cars){
            if (car != null) {
                totalWeight += car.loadInKg
            }
        }
        return totalWeight
    }
}
