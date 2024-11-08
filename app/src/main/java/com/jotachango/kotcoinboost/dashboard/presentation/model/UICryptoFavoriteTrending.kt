package com.jotachango.kotcoinboost.dashboard.presentation.model

sealed interface UICryptoFavoriteTrending {
    object TrendingUp : UICryptoFavoriteTrending
    object TrendingDown : UICryptoFavoriteTrending
    object NotTrending : UICryptoFavoriteTrending
}