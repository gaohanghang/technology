/**
 *
 *
 * @author: Gao HangHang
 * @date 2018/10/09
 */
class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Greeter("World!").greet()     // 创建一个对象不用 new 关键字
}