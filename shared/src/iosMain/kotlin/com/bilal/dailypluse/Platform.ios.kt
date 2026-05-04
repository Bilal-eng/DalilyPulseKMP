package com.bilal.dailypluse

import platform.Foundation.NSLog
import platform.UIKit.UIDevice
import platform.UIKit.UIScreen


actual class Platform() {
    actual val osName = UIDevice.currentDevice.systemName

    actual val osVersion = UIDevice.currentDevice.systemVersion

    actual val deviceModel = UIDevice.currentDevice.model

    actual val density = UIScreen.mainScreen.scale.toInt()


    actual fun logSystemInfo() {
        NSLog(
            "($osName, $osVersion, $deviceModel, $density"
        )
    }

}

