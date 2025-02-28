package com.edaakyil.android.lib.util.datetime.module.formatter

import com.edaakyil.android.lib.util.datetime.module.annotation.TimeFormatterTRInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import java.time.format.DateTimeFormatter
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TimeFormatterTRModule {
    @Provides
    @Singleton
    @TimeFormatterTRInterceptor
    fun provideTimeFormatterTR(): DateTimeFormatter = DateTimeFormatter.ofPattern("HH.mm.ss")
}