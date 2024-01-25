package com.helloappscrmfsm.features.viewAllOrder.interf

import com.helloappscrmfsm.features.viewAllOrder.model.ProductOrder

interface EmptyProductOnClick {
    fun emptyProductOnCLick(emptyFound:Boolean)
    fun delProductOnCLick(isDel:Boolean)
}