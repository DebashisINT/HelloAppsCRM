package com.helloappscrmfsm.features.location.shopRevisitStatus

import com.helloappscrmfsm.base.BaseResponse
import com.helloappscrmfsm.features.location.model.ShopDurationRequest
import com.helloappscrmfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}