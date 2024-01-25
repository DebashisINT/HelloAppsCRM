package com.helloappscrmfsm.features.login.model.userconfig

import com.helloappscrmfsm.base.BaseResponse

/**
 * Created by Saikat on 14-01-2019.
 */
class UserConfigResponseModel : BaseResponse() {
    var getconfigure: ArrayList<UserConfigDataModel>? = null
}