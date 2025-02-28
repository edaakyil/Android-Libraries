package com.edaakyil.android.lib.util.datetime.module.local

import com.edaakyil.android.lib.util.datetime.module.annotation.CurrentLocalDateInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import java.time.LocalDate

@Module
@InstallIn(ActivityComponent::class)
object CurrentLocalDateModule {
    @Provides
    @CurrentLocalDateInterceptor
    fun provideCurrentLocalDate(): LocalDate = LocalDate.now()
}