package com.project.furnitureapplication.components

import androidx.annotation.DrawableRes
import com.project.furnitureapplication.R


data class PopularProducts(
    val id: Int,
    val title: String,
    @DrawableRes val image: Int,
    val price: String
)

val popularProductList = listOf(
    PopularProducts(
        1,
        "Aeron chair",
        R.drawable.product_one,
        "₹3000"
    ),
    PopularProducts(
        2,
        "Taurus chair and table",
        R.drawable.product_two,
        "₹5000"
    ),
    PopularProducts(
        3,
        "NilKamal 3-seat sofa",
        R.drawable.product_three,
        "₹5488"
    ),
    PopularProducts(
        4,
        "IKEA KIVIK 3-seat sofa",
        R.drawable.product_four,
        "₹7099"
    )
)