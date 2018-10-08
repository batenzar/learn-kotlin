package Aquarium.generic

open class WaterSupply(var needsProcessed: Boolean) {

}

class TapWater : WaterSupply(true) {

}

class FishStoreWater : WaterSupply(false) {

}

class LakeWater : WaterSupply(false) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<T>(val waterSupply: T) {
    fun genericExample() {
        val aquarium = Aquarium<TapWater>(TapWater())
        println(aquarium.waterSupply)
    }
}

//
//class A <in IT:Int, out OT:Double>{
//
//    fun f(p1:IT):OT {
//        return 0.0.toDouble()
//    }
//}