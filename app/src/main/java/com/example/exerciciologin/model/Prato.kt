package com.example.exerciciologin.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Prato(
    val itemPicture: String = "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/chorizo-mozarella-gnocchi-bake-cropped-9ab73a3.jpg?webp=true&quality=90&resize=620%2C563",
    val itemTitle: String = "Salada com molho Gengibre " ,
    val itemDescription: String = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."
):Parcelable