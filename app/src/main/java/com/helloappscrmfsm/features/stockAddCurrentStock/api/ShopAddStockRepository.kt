package com.helloappscrmfsm.features.stockAddCurrentStock.api

import com.helloappscrmfsm.base.BaseResponse
import com.helloappscrmfsm.features.location.model.ShopRevisitStatusRequest
import com.helloappscrmfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.helloappscrmfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.helloappscrmfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.helloappscrmfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}