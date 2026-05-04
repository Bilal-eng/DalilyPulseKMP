package com.bilal.dailypluse

import android.content.res.Resources
import android.os.Build
import android.util.Log
import kotlin.math.round

actual class Platform() {

    actual val osName = "Android"

    actual val osVersion = "${Build.VERSION.SDK_INT}"

    actual val deviceModel = "${Build.MANUFACTURER} ${Build.MODEL}"

    actual val density = round(Resources.getSystem().displayMetrics.density).toInt()

    actual fun logSystemInfo() {
        Log.d(
            "Daily Pulse",
            "($osName, $osVersion, $deviceModel, $density)"
        )
    }
}