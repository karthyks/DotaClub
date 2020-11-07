package com.dota.club.engine

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.Channel.Factory.CONFLATED

object DotaEngine {
    private val dispatcher = Dispatchers.Default
    private val parentJob = SupervisorJob()
    private val scope = CoroutineScope(dispatcher + parentJob)

    private val channel = Channel<Int>(CONFLATED)

    fun startSomething() {
        runBlocking {
            scope.launch {
                channel.offer(2)
                delay(500)
                channel.offer(3)
                channel.offer(4)
                channel.offer(5)
            }
            scope.launch {
                pollSomething()
            }.join()
        }
    }

    private suspend fun pollSomething() {
        for (i in channel) {
            println("$i is in process..")
            delay(2000)
        }
    }

}

fun main() {
    DotaEngine.startSomething()
}