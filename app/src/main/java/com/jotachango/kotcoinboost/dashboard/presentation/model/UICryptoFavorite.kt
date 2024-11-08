package com.jotachango.kotcoinboost.dashboard.presentation.model

import com.jotachango.kotcoinboost.dashboard.presentation.model.UIPrice

data class UICryptoFavorite(
    val id: Int,
    val name: String,
    val symbol: String,
    val price: UIPrice,
    val trending: UICryptoFavoriteTrending
)