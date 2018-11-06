package me.paixao.databinddingexample.ui.main

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.util.Log
import me.paixao.databinddingexample.BR


class MainViewModel : BaseObservable() {

    class State : BaseObservable() {
        var testString : String = "OLE"
            set(value) {
                field = value
                Log.e("TEST", "TEST4")
                notifyPropertyChanged(BR.state)
            }
    }

    @Bindable
    val state = State()


    fun changeString() {
        Log.e("TEST", "TEST3")
        state.testString = "oiiii2"
        notifyPropertyChanged(BR.state)
    }
}
