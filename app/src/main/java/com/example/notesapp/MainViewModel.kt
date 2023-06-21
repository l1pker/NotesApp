package com.example.notesapp

import android.app.Application
import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.notesapp.model.Note
import com.example.notesapp.utils.TYPE_FIREBASE
import com.example.notesapp.utils.TYPE_ROOM

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val readTest: MutableLiveData<List<Note>> by lazy {
        MutableLiveData<List<Note>>()
    }
    val dbType: MutableLiveData<String> by lazy {
        MutableLiveData<String>(TYPE_ROOM)

    }

    init {
        readTest.value =
            when (dbType.value){
                TYPE_ROOM -> {
                    listOf<Note>(
                        Note(
                            title = "Note",
                            subtitle = "Subtitle"
                        )

                    )
                }
                TYPE_FIREBASE -> listOf()
                else -> listOf()
            }
    }
    fun initDatabase(type: String){
        dbType.value = type
    }
}

class MainViewModelFactory(private val application: Application) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }

}