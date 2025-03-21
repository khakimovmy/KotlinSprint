package lesson_13

class UserInfo(
    val name: String,
    val phone: Long,
    val company: String?
)

fun main(){
    val user = UserInfo("Bob", 1234567890L, null)
    println(user.name)
    println(user.phone)
    println(user.company)
}