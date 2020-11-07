package com.dota.club.engine

import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class Interactor {
    private val job = Job()

    private suspend fun cancelableJob(i: Int) {
        withContext(job) {
            println("$i others are in process..")
        }
        job.cancelAndJoin()
    }

    suspend fun doSomeOtherWithAJob() {
        for (i in 0..10) {

            println("$i others are in process..")

            if (i == 7) {
                break
            }
            delay(1_000)
        }
    }
}