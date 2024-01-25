package com.helloappscrmfsm.features.weather.api

import com.helloappscrmfsm.base.BaseResponse
import com.helloappscrmfsm.features.task.api.TaskApi
import com.helloappscrmfsm.features.task.model.AddTaskInputModel
import com.helloappscrmfsm.features.weather.model.ForeCastAPIResponse
import com.helloappscrmfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}