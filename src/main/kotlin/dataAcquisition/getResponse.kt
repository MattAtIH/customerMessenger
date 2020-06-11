package dataAcquisition

import enums.WeatherAPIEnum
import java.net.HttpURLConnection
import java.net.URL

fun URL.getText(): String {
    return openConnection().run {
        this as HttpURLConnection
        inputStream.bufferedReader().readText()
    }
}

fun getWeatherData(): String {
    return URL(WeatherAPIEnum().URL).getText()
}