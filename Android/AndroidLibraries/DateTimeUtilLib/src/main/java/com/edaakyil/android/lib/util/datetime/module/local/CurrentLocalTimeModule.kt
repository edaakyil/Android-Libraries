package com.edaakyil.android.lib.util.datetime.module.local

import com.edaakyil.android.lib.util.datetime.module.annotation.CurrentLocalTimeInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import java.time.LocalTime

@Module
@InstallIn(ActivityComponent::class)
object CurrentLocalTimeModule {
    @Provides
    @CurrentLocalTimeInterceptor
    fun provideCurrentLocalTime(): LocalTime = LocalTime.now()
}