package com.digitalmischief.rickandmortyapp.network

import com.digitalmischief.rickandmortyapp.models.CharacterResponse
import com.facebook.stetho.okhttp3.StethoInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import rx.Observable

interface RickAndMortyService {

    @GET("character/")
    fun getAllCharacters(): Observable<CharacterResponse>

    companion object {
        //in scope creation of this
        fun create(): RickAndMortyService {

            val okHttpClient = OkHttpClient.Builder()
                    .addNetworkInterceptor(StethoInterceptor())
                    .build()

            val retrofit = Retrofit.Builder()
                    .client(okHttpClient)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://rickandmortyapi.com/api/")
                    .build()
            return retrofit.create(RickAndMortyService::class.java)
        }
    }
}


//    fun getAllCharacters(
//            @Query("keywords") keywords: String,
//            @Query("page") page: Int,
//            @Query("api_key") api_key: String = "ob5cp17p7q8hvw37wv4nopuf",
//            @Query("limit") limit: String = "25",
//            @Query("includes") includes: String = "MainImage"
//    ): Observable<ActiveListingResponse>
//}