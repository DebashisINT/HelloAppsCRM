package com.helloappscrmfsm.features.viewAllOrder.interf

import com.helloappscrmfsm.app.domain.NewOrderProductEntity
import com.helloappscrmfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}