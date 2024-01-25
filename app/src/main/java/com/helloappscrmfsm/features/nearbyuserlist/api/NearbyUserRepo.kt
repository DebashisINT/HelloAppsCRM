package com.helloappscrmfsm.features.nearbyuserlist.api

import com.helloappscrmfsm.app.Pref
import com.helloappscrmfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.helloappscrmfsm.features.newcollection.model.NewCollectionListResponseModel
import com.helloappscrmfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}