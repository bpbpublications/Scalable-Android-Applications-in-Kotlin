import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun doTask(): String {
    delay(1000) // Simulate some asynchronous task
    return "Task completed"
}

fun main(args: Array<String>) {
    println("Start")

    GlobalScope.launch {
        val result = doTask()
        println(result)
    }

    Thread.sleep(3000) // Wait for coroutines to complete
    println("End")
}
