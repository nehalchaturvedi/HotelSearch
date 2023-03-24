package com.example.hotelsearch.data.network.interceptors

import okhttp3.Interceptor

//Connectivity Interceptor that handles and gives error if there is no internet connection
interface ConnectivityInterceptor : Interceptor {
}