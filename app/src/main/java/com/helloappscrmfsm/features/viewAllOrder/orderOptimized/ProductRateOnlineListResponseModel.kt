package com.helloappscrmfsm.features.viewAllOrder.orderOptimized

import com.helloappscrmfsm.app.domain.ProductOnlineRateTempEntity
import com.helloappscrmfsm.base.BaseResponse
import com.helloappscrmfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}