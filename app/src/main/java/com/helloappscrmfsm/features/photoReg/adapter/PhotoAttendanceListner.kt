package com.helloappscrmfsm.features.photoReg.adapter

import com.helloappscrmfsm.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}