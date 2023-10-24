package com.yus.quran.network.quran

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface QuranApiService {
    @GET("surah")
    fun getListSurah(): Call<SurahResponse>

    @GET("surah/{number}/editions/quran-uthmani,ar.alafasy,id.indonesian")
    fun getListAyahBySurah(@Path("number") numberSurah: Int): Call<AyahResponse>

}