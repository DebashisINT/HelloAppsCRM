package com.helloappscrmfsm.features.orderList.model

import com.helloappscrmfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}