package org.example.lesson_15

interface Movable {
    fun move()
}

interface PassengerTransport {
    var currentCapacity: Int
    val maxCapacity: Int

    fun loadPassenger(passengerAmount: Int) {
        if (currentCapacity + passengerAmount <= maxCapacity) {
            currentCapacity += passengerAmount
        } else {
            println("No seats available")
        }
    }

    fun unloadPassenger(passengerAmount: Int) {
        if (passengerAmount in 1..currentCapacity) {
            currentCapacity -= passengerAmount
        } else {
            println("Cannot unload")
        }
    }
}

interface CargoTransport {
    fun loadCargo(cargoAmount: Int)
    fun unloadCargo(cargoAmount: Int)
}

class Truck(
    override var currentCapacity: Int,
    var currentCargo: Int,
) : Movable, PassengerTransport, CargoTransport {

    override val maxCapacity: Int = 1
    val maxCargo: Int = 2

    override fun move() {
        println("Driving a truck")
    }

    override fun loadCargo(cargoAmount: Int) {
        if ((currentCargo + cargoAmount) <= maxCargo) {
            currentCargo += cargoAmount
        } else {
            println("Cargo is full")
        }
    }

    override fun unloadCargo(cargoAmount: Int) {
        if (cargoAmount in 1..currentCargo) {
            currentCargo -= cargoAmount
        } else {
            println("Cannot unload cargo")
        }
    }
}

class Car(
    override var currentCapacity: Int
) : Movable, PassengerTransport {

    override val maxCapacity: Int = 3

    override fun move() {
        println("Driving a car")
    }
}

fun main() {
    val car1 = Car(0)
    val car2 = Car(0)
    val truck1 = Truck(0, 0)

    car1.loadPassenger(3)
    car2.loadPassenger(2)
    truck1.loadPassenger(1)
    truck1.loadCargo(2)

    car1.move()
    car2.move()
    truck1.move()

    car1.unloadPassenger(3)
    car2.unloadPassenger(2)
    truck1.unloadPassenger(1)

    truck1.unloadCargo(2)
}