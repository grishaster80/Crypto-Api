package com.example.cryptoapi

import io.reactivex.Observable
import retrofit2.http.GET

interface GetData {

    @GET("prices?key=")
    fun getData() : Observable<List<RetroCrypto>>
}