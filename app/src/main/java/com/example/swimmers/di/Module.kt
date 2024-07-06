package com.example.swimmers.di

import android.content.Context
import androidx.room.Room
import com.example.swimmers.Constants.Swimmers_DataBAse
import com.example.swimmers.data.SwimmersDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    @Singleton
    fun provideTasksDatabase(
        @ApplicationContext context: Context
    )
            = Room.databaseBuilder(
        context,
        SwimmersDatabase::class.java,
        Swimmers_DataBAse
    ).build()

    @Provides
    @Singleton
    fun provideSwimmersDao(database: SwimmersDatabase) = database.swimmersDao()


}