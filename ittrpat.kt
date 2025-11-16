package ittrpat
class centapide {
     var lastsegment : centapideSegment = centapideSegment();
     private var length = 1 
     fun addsegment(){
        val new_segment = centapideSegment(lastsegment)
        this.lastsegment = new_segment
        length++
     }
     fun get_head():centapideSegment{
        var tempseg = this.lastsegment
        while (true){
            if(tempseg.centapide_segment==null) {
                return tempseg
            }
            else{
                tempseg = tempseg.centapide_segment!!
            }
        }
     }
    //  ittorate takes a function and applies it to every element
    fun Iterate(action: (centapideSegment) -> Unit){
        var tempseg:centapideSegment? = this.lastsegment
        while (tempseg!=null){
            action(tempseg)
            tempseg = tempseg.get_previous()
        }
    }
    fun get_length():Int{
        return length
    }
    


}
class centapideSegment{
    val legs:Int
    val centapide_segment: centapideSegment?
    constructor(){
        this.legs = 0
        centapide_segment= null
        // is head so no leggs
    }
    constructor( centapide_segment: centapideSegment){
        this.legs = 2
        this.centapide_segment = centapide_segment
    }
    fun get_previous(): centapideSegment? {
        return centapide_segment
    }
    
    
}