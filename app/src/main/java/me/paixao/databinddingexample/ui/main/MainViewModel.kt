package me.paixao.databinddingexample.ui.main

import android.databinding.BaseObservable
import android.databinding.Bindable


class MainViewModel : BaseViewModel() {

    class State : BaseObservable() {
        var testString : String = "OLE"
            set(value) {
                field = value
                notifyChange()
            }
    }

    @Bindable
    val state = State()

    fun changeString() {
        state.testString = "oiiii2"
    }
}
