package com.helloappscrmfsm.features.viewAllOrder.interf

import com.helloappscrmfsm.app.domain.NewOrderColorEntity
import com.helloappscrmfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}