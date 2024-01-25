package com.helloappscrmfsm.features.viewAllOrder.interf

import com.helloappscrmfsm.app.domain.NewOrderGenderEntity
import com.helloappscrmfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}