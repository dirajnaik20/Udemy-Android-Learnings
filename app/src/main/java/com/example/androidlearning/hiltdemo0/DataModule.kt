package com.example.androidlearning.hiltdemo0

import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck

@Module
class DataModule {

    @Provides
    fun providesDataSource():DataSource{
        return DataSource()
    }
}