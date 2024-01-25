package com.helloappscrmfsm.features.weather.api

import com.helloappscrmfsm.features.task.api.TaskApi
import com.helloappscrmfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}