package org.example.lesson_15

interface Movable {
    fun move()
}

interface PassengerTransport {
    fun loadPassenger(passengerAmount: Int)
    fun unloadPassenger(passengerAmount: Int)
}

interface CargoTransport {
    fun loadCargo(cargoAmount: Int)
    fun unloadCargo(cargoAmount: Int)
}

class Truck(
    var currentCapacity: Int,
    var currentCargo: Int,
) : Movable, PassengerTransport, CargoTransport {
    val maxCapacity: Int = 1
    val maxCargo: Int = 2

    override fun move() {
        println("Driving truck")
    }

    override fun loadPassenger(passengerAmount: Int) {
        if (currentCapacity < maxCapacity) {
            if (currentCapacity + passengerAmount <= maxCapacity) {
                currentCapacity += passengerAmount
            } else {
                println("Max 1 passenger!")
            }
        } else {
            println("No seats available!")
        }
    }

    override fun unloadPassenger(passengerAmount: Int) {
        if (currentCapacity > 0) {
            if (passengerAmount <= currentCapacity) {
                currentCapacity -= passengerAmount
            } else {
                println("There is only $currentCapacity passenger")
            }
        } else {
            println("Empty")
        }
    }

    override fun loadCargo(cargoAmount: Int) {
        if (currentCargo < maxCargo) {
            if ((currentCargo + cargoAmount) <= maxCargo) {
                currentCargo += cargoAmount
            } else {
                println("Max 2 t.")
            }
        } else {
            println("Full")
        }
    }

    override fun unloadCargo(cargoAmount: Int) {
        if (cargoAmount in 1..currentCargo) {
            currentCargo -= cargoAmount
        } else {
            println("Cannot unload $cargoAmount t, only $currentCargo t available")
        }
    }
}

class Car(
    var currentCapacity: Int
) : Movable, PassengerTransport {
    val maxCapacity: Int = 3

    override fun move() {
        println("Driving a car")
    }

    override fun loadPassenger(passengerAmount: Int) {
        if (currentCapacity < maxCapacity) {
            if (currentCapacity + passengerAmount <= maxCapacity) {
                currentCapacity += passengerAmount
            } else {
                println("Max 3 passengers!")
            }
        } else {
            println("No seats available!")
        }
    }

    override fun unloadPassenger(passengerAmount: Int) {
        if (passengerAmount in 1..currentCapacity) {
            currentCapacity -= passengerAmount
        } else {
            println("Cannot unload $passengerAmount passengers, only $currentCapacity passengers available")
        }
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