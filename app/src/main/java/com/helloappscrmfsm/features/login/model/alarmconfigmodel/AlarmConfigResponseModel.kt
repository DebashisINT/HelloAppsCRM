package com.helloappscrmfsm.features.login.model.alarmconfigmodel

import com.helloappscrmfsm.base.BaseResponse

/**
 * Created by Saikat on 19-02-2019.
 */
class AlarmConfigResponseModel : BaseResponse() {
    var alarm_settings_list: ArrayList<AlarmConfigDataModel>? = null
}