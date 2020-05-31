package kr.co.tjoeun.jickbangcopy_20200531.datas

class Room(val price:Int, val address:String, val floor:Int, val description:String) {

    fun getFormattedPrice() : String {
        if (this.price < 10000) {
            return "${this.price}"
        }
        else {
//            정수 / 정수 = 정수 => 28500 / 10000 = 2
//            28500 % 10000 => 만으로 나눈 나머지 => 8500
            val uk = this.price / 10000
            val underUk = this.price % 10000
            return "${uk}억 ${underUk}"
        }
    }

    fun getFormattedFloor() : String {
        if (this.floor > 0) {
            return "${this.floor}층"
        }
        else if (this.floor == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }
    }

}