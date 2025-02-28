package com.edaakyil.android.lib.util.datetime.module.formatter

import com.edaakyil.android.lib.util.datetime.module.annotation.DateFormatterTRInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import java.time.format.DateTimeFormatter
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DateFormatterTRModule {
    @Provides
    @Singleton
    @DateFormatterTRInterceptor
    fun provideDateFormatterTR(): DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
}