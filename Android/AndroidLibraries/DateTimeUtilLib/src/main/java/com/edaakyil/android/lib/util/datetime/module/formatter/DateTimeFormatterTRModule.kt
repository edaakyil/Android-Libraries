package com.edaakyil.android.lib.util.datetime.module.formatter

import com.edaakyil.android.lib.util.datetime.module.annotation.DateTimeFormatterTRInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import java.time.format.DateTimeFormatter
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DateTimeFormatterTRModule {
    @Provides
    @Singleton
    @DateTimeFormatterTRInterceptor
    fun provideDateTimeFormatterTR(): DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm.ss")
}