package com.helloappscrmfsm.features.location.api

import com.helloappscrmfsm.app.Pref
import com.helloappscrmfsm.base.BaseResponse
import com.helloappscrmfsm.features.location.model.AppInfoInputModel
import com.helloappscrmfsm.features.location.model.AppInfoResponseModel
import com.helloappscrmfsm.features.location.model.GpsNetInputModel
import com.helloappscrmfsm.features.location.model.ShopDurationRequest
import com.helloappscrmfsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}