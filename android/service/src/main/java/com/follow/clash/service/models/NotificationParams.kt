package com.follow.clash.service.models

data class NotificationParams(
    val title: String = "KSS-FlClash",
    val stopText: String = "STOP",
    val onlyStatisticsProxy: Boolean = false,
    val showStopAction: Boolean = true,
)
