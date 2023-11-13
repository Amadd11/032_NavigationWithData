package com.example.pengelolahalaman

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun HalamanSatu(
    onSubmitButtonClicked : (MutableList<String>) -> Unit
){
    var nama by rememberSaveable { mutableStateOf(value = "") }
    var noHp by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var listData: MutableList<String> = mutableListOf(nama, noHp, alamat)

}