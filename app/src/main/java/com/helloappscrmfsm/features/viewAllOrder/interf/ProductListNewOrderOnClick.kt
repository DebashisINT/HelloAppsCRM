package com.helloappscrmfsm.features.viewAllOrder.interf

import com.helloappscrmfsm.app.domain.NewOrderGenderEntity
import com.helloappscrmfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}