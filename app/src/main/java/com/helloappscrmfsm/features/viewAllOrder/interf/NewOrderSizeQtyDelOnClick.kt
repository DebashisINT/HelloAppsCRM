package com.helloappscrmfsm.features.viewAllOrder.interf

import com.helloappscrmfsm.app.domain.NewOrderGenderEntity
import com.helloappscrmfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}