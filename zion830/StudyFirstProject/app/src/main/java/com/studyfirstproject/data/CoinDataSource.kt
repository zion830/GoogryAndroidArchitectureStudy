package com.studyfirstproject.data

import com.studyfirstproject.data.model.TickerModel

interface CoinDataSource {

    interface LoadMarketsCallback {

        fun onMarketsLoaded(markets: String)

        fun onDataNotAvailable(msg: String, reason: String?)
    }

    interface LoadTickersCallback {

        fun onCoinsLoaded(tickers: List<TickerModel>)

        fun onDataNotAvailable(msg: String, reason: String?)
    }

    fun getAllMarkets(callback: LoadMarketsCallback)

    fun getCoinData(markets: String, callback: LoadTickersCallback)
}