package com.example.hotelsearch

import android.app.Application
import com.example.hotelsearch.data.network.ApiService
import com.example.hotelsearch.data.network.HotelsNetworkDataSource
import com.example.hotelsearch.data.network.HotelsNetworkDataSourceImpl
import com.example.hotelsearch.data.network.interceptors.ConnectivityInterceptor
import com.example.hotelsearch.data.network.interceptors.ConnectivityInterceptorImpl
import com.example.hotelsearch.data.repository.HotelsRepository
import com.example.hotelsearch.data.repository.HotelsRepositoryImpl
import com.example.hotelsearch.ui.hotelsearch.HotelSearchViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

//Dependency Injection using Kodein
class HotelSearchApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@HotelSearchApplication))

        bind<ConnectivityInterceptor>() with singleton { ConnectivityInterceptorImpl(instance()) }
        bind() from singleton { ApiService(instance()) }
        bind<HotelsNetworkDataSource>() with singleton { HotelsNetworkDataSourceImpl(instance()) }
        bind<HotelsRepository>() with singleton { HotelsRepositoryImpl(instance()) }

        bind() from provider { HotelSearchViewModelFactory(instance()) }
    }
}