package com.helloappscrmfsm.features.photoReg.present

import com.helloappscrmfsm.app.domain.ProspectEntity
import com.helloappscrmfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}