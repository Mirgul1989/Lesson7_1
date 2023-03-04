package com.mirgul.com.di

import android.content.Context
import androidx.room.Room
import com.mirgul.com.data.local.NoteDao
import com.mirgul.com.data.local.NoteDatabase
import com.mirgul.com.data.repository.NoteRepositoryImpl
import com.mirgul.com.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NoteModule {

    @Singleton
    @Provides
    fun provideNoteDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        NoteDatabase::class.java,
        "note_db"
    ).allowMainThreadQueries()

    @Singleton
    @Provides
    fun provideNoteDao(noteDatabase: NoteDatabase)=noteDatabase.noteDao()

    @Singleton
    @Provides
    fun provideRepository(noteDao: NoteDao) : NoteRepository= NoteRepositoryImpl(noteDao)
}
