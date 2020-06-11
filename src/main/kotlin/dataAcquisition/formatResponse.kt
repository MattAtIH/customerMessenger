package dataAcquisition

import com.fasterxml.jackson.module.kotlin.*
import dateFunctions.convertDateToInt
import weatherResponseModels.WeatherData
import weatherResponseModels.WeatherItem

fun formatResponseData (responseBody: String): WeatherData {
    val mapper = jacksonObjectMapper()
    return mapper.readValue(responseBody)
}

fun getFormattedWeatherData(): WeatherData {
    val responseBody = getWeatherData()
    return formatResponseData(responseBody)
}

fun weatherListWithConvertedDateKeys(): List<WeatherItem> {
    return convertDateToInt(getFormattedWeatherData())
}