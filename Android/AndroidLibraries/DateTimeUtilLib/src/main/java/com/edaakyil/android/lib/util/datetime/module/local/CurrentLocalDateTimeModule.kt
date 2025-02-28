package com.edaakyil.android.lib.util.datetime.module.local

import com.edaakyil.android.lib.util.datetime.module.annotation.CurrentLocalDateTimeInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import java.time.LocalDateTime

@Module
@InstallIn(ActivityComponent::class)
object CurrentLocalDateTimeModule {
    @Provides
    @CurrentLocalDateTimeInterceptor
    fun provideCurrentLocalDateTime(): LocalDateTime = LocalDateTime.now()
}