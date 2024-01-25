package com.helloappscrmfsm.features.photoReg.adapter

import com.helloappscrmfsm.features.photoReg.model.ProsCustom
import com.helloappscrmfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}