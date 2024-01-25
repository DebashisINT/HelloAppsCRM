package com.helloappscrmfsm.features.stockAddCurrentStock.api

import com.helloappscrmfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.helloappscrmfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}