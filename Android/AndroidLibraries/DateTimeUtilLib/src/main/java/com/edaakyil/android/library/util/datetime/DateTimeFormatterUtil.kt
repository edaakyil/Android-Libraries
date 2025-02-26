package com.edaakyil.android.library.util.datetime

import java.time.format.DateTimeFormatter

object DateTimeFormatterUtil {
    val DATETIME_FORMATTER_TR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
    val DATE_FORMATTER_TR = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val TIME_FORMATTER_TR = DateTimeFormatter.ofPattern("HH:mm:ss")
}