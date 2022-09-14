package com.frhnfath.suitmedia.network

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserModel(
    var firstname: String? = null,
    var lastname: String? = null,
    var email: String? = null,
    var image: String? = null
): Parcelable