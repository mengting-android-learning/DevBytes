package com.example.android.devbyteviewer.domain

import com.example.android.devbyteviewer.util.smartTruncate

private const val DESCRIPTION_LENGTH = 200

data class DevByteVideo(
    val title: String,
    val description: String,
    val url: String,
    val updated: String,
    val thumbnail: String
) {

    val shortDescription: String
        get() = description.smartTruncate(DESCRIPTION_LENGTH)
}
