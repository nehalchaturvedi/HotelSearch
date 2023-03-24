package com.example.hotelsearch.data.network

import com.example.hotelsearch.data.network.interceptors.ConnectivityInterceptor
import com.example.hotelsearch.data.network.response.search.HotelListResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "9eda302602msh58bd8e7d28516aap15a3b6jsnbc8940bfbfc1"
const val API_HOST = "hotels4.p.rapidapi.com"
const val BASE_URL = "https://hotels4.p.rapidapi.com/"

//"https://hotels4.p.rapidapi.com/locations/v3/search?q=new%20york&locale=en_US&langid=1033&siteid=300000001

interface ApiService {

    @GET("locations/v3/search")
    fun getHotels(
        @Query("q") location: String,
        @Query("locale") locale: String = "en_US"
    ): Deferred<HotelListResponse>



    companion object {
        operator fun invoke(
            connectivityInterceptor: ConnectivityInterceptor
        ): ApiService {
            val requestInterceptor = Interceptor { chain ->
                val request = chain.request()
                    .newBuilder()
                    .addHeader("X-RapidAPI-Key", API_KEY)
                    .addHeader("X-RapidAPI-Host", API_HOST)
                    .build()

                return@Interceptor chain.proceed(request)
            }

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .addInterceptor(connectivityInterceptor)
                .build()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
        }
    }
}