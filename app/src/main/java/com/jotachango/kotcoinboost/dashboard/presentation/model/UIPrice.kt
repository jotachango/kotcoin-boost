package com.jotachango.kotcoinboost.dashboard.presentation.model

data class UIPrice(
    var price: Double,
    var marketCap: Double,
    var volume24h: Double,
    var percentChange1h: Double,
    var percentChange24h: Double,
    var percentChange7d: Double,
    var lastUpdated: String
)