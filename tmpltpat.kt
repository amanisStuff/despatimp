package tmpltpat
abstract class ChefTemplate {
    abstract fun cookMeal()
    abstract fun washDishes()
    abstract fun getPaid()
    
}
class frenchchef : ChefTemplate(){
    override fun cookMeal() {
        println("Cooking French cuisine.")
    }

    override fun washDishes() {
        println("Washing dishes the French way.")
    }

    override fun getPaid() {
        println("Getting paid for French culinary excellence.")
    }
    
}
class ItalianChef : ChefTemplate() {
    override fun cookMeal() {
        println("Cooking Italian pasta.")
    }

    override fun washDishes() {
        println("Washing dishes the Italian way.")
    }

    override fun getPaid() {
        println("Getting paid for Italian culinary excellence.")
    }
}

