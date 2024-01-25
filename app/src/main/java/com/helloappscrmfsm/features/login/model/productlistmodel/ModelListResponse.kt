package com.helloappscrmfsm.features.login.model.productlistmodel

import com.helloappscrmfsm.app.domain.ModelEntity
import com.helloappscrmfsm.app.domain.ProductListEntity
import com.helloappscrmfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}