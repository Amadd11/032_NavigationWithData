package com.example.pengelolahalaman

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitButtonClicked : (MutableList<String>) -> Unit,
    onCancelButtonClicked : () -> Unit
){
    var nama by rememberSaveable { mutableStateOf(value = "") }
    var noHp by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var listData: MutableList<String> = mutableListOf(nama, noHp, alamat)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()) {
        OutlinedTextField(
            value = nama,
            onValueChange = {nama = it},
            label = { Text(text = "Nama") })
        OutlinedTextField(
            value = noHp,
            onValueChange = {noHp = it},
            label = { Text(text = "No Hp") })
        OutlinedTextField(
            value = alamat,
            onValueChange = {alamat = it},
            label = { Text(text = "Alamat") })
        Spacer(modifier = Modifier.padding(16.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.padding_medium))
            .weight(1f, false),
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
            verticalAlignment = Alignment.Bottom){
            
            OutlinedButton( modifier = Modifier.weight(1f),
                onClick = onCancelButtonClicked) {
                Text(text = stringResource(id = R.string.cancel))
            }
            OutlinedButton (onClick = { onSubmitButtonClicked(listData) }) {
                Text(text = stringResource(id = R.string.btn_submit))
            }
        }
    }

}