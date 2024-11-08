package com.jotachango.kotcoinboost.dashboard.presentation.model

import com.jotachango.kotcoinboost.dashboard.presentation.model.UIPrice

data class UICryptoPopular(
    val id: Int,
    val name: String,
    val symbol: String,
    val historicalUIPrice: List<UIPrice>
)