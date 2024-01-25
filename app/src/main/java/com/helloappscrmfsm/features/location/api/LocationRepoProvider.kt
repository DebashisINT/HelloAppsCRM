package com.helloappscrmfsm.features.location.api

import com.helloappscrmfsm.features.location.shopdurationapi.ShopDurationApi
import com.helloappscrmfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}