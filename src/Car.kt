class Car(val weight: Int, var speed: Int) {

    fun move(speed: Int) {
        this.speed = speed
        println("Автомобиль движется со скоростью: $speed")
    }

    fun stop() {
        this.speed = 0
        println("Автомобиль остановился")
    }
}