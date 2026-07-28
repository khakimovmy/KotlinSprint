package org.example.lesson_16

class Order(
    private val orderNumber: Int,
    private var orderStatus: String,
) {

    fun changeOrderStatus(newStatus: String) {
        if (newStatus.isBlank()) {
            println("Status cannot be empty!")
            return
        }

        if (newStatus == orderStatus) {
            println("Order already has this status")
            return
        }
        approveOrderStatus(newStatus)
    }

    private fun approveOrderStatus(newStatus: String) {
        orderStatus = newStatus
        println("Status changed to: $orderStatus")
    }
}

fun main() {
    val order = Order(1, "New")
    order.changeOrderStatus("Delivered")
}