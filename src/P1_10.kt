fun main(){
    val car1 = Car("Sedan", "Honda City", 1000000.0, "Sampreeti", 25000.0)
    println(car1.getCarInfo())
    println("Original Price: ${car1.getOriginalPrice()}")
    println("Current Price: ${car1.getCurrentPrice()}")
    car1.displayCarInfo()
}
class Car(t:String, m:String, p:Double, o:String, mile:Double){
    var type: String =""
    var model: String =""
    var price: Double =0.0
    var owner: String =""
    var miles: Double =0.0

    init{
        type=t
        model=m
        price=p
        owner=o
        miles=mile
    }

    fun getCarInfo(): String{
        return "Model: $model\nOwner: $owner\nMiles Driven: $miles"
    }

    fun getOriginalPrice(): Double {
        return price
    }

    fun getCurrentPrice(): Double {
        val depreciation = (miles / 10000) * 0.1 * price
        return price - depreciation
    }

    fun displayCarInfo() {
        println("Car Information:")
        println("Type: $type")
        println("Model: $model")
        println("Owner: $owner")
        println("Miles Driven: $miles")
        println("Original Price: $price")
        println("Current Price: ${getCurrentPrice()}")
    }
}