package com.example.pertemuan8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MahasiswaViewModel : ViewModel() {

    private val _mahasiswaStateUI = MutableStateFlow(Mahasiswa())
    val mahasiswaUIState: StateFlow<Mahasiswa> = _mahasiswaStateUI.asStateFlow()
    fun saveDataMahasiswa(ls: MutableList<String>) {
        _mahasiswaStateUI.value = Mahasiswa(
            nim = ls[0],
            nama = ls[1],
            email = ls[2]
        )
    }
    }