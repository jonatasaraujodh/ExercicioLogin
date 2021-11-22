package com.example.exerciciologin.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Restaurante(
    val itemPicture: String,
    val itemTitle: String,
    val itemAdress: String = "",
    val itemTime: String = "",
    val lpratoes: MutableList<Prato>
): Parcelable


