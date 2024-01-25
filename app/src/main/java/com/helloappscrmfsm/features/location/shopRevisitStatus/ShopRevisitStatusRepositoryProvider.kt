package com.helloappscrmfsm.features.location.shopRevisitStatus

import com.helloappscrmfsm.features.location.shopdurationapi.ShopDurationApi
import com.helloappscrmfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}