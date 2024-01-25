package com.helloappscrmfsm.features.newcollectionreport

import com.helloappscrmfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}