package com.helloappscrmfsm.features.viewAllOrder.model

import com.helloappscrmfsm.app.domain.NewOrderColorEntity
import com.helloappscrmfsm.app.domain.NewOrderGenderEntity
import com.helloappscrmfsm.app.domain.NewOrderProductEntity
import com.helloappscrmfsm.app.domain.NewOrderSizeEntity
import com.helloappscrmfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

