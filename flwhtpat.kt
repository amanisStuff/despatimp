package flwhtpat
class fly {
    val wingColor: String;
    val buzzSound: String;
    constructor(wingColor: String, buzzSound: String) {
        this.wingColor = wingColor;
        this.buzzSound = buzzSound;
    }
    
}
class flyingFly{
    val fly:fly;
    var x_position:Int;
    var y_position:Int;
    val speed:Int;
    constructor(fly:fly, x_position:Int, y_position:Int, speed:Int) {
        this.fly = fly;
        this.x_position = x_position;
        this.y_position = y_position;
        this.speed = speed;
    }
    fun move(){
        this.x_position += (Math.random() * speed * 2 - speed).toInt();
        this.y_position += (Math.random() * speed * 2 - speed).toInt();
        println("the ${this.fly.wingColor} fly moved to: dx = ${this.x_position}, dy = ${this.y_position}");
        println("it says: ${this.fly.buzzSound}");
    }
    
    
}