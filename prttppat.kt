package prttppat
class Cell {
    
    companion object{
        private val cell:Cell = Cell()
        public fun mitosis(cancer:Boolean=false):Cell{
            return cell.copy().setCancerous(cancer)
        }
    }
    private var isCancerous = false
    
    public fun setCancerous(cancer:Boolean):Cell{
        isCancerous=cancer
        return this
    }
    fun intro(): Unit {
        if(isCancerous){
            println("i am a cancerous cell")
        }
        else{
            println("i am a healthy cell")

        }
    }
    
    private constructor(){

    }
    
    fun copy():Cell { 
        return Cell().setCancerous(this.isCancerous)
    }
}