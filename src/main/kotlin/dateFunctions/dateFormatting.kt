package dateFunctions

import weatherResponseModels.WeatherData
import weatherResponseModels.WeatherItem
import java.text.SimpleDateFormat
import java.util.*

fun convertToMilliseconds(dateTime: Int): Long {
    val dateTimeLong = dateTime.toLong()
    return dateTimeLong.times(1000)
}

fun convertTimeStampToInt(timeStamp: Long): Int {
    val formatter = SimpleDateFormat("MMdd")
    val dateString: String = formatter.format(Date(timeStamp))
    return dateString.toInt()
}

fun convertDateToInt(formattedResponse: WeatherData): List<WeatherItem> {
    formattedResponse.list.forEach() {
        val dateInMilliseconds = convertToMilliseconds(it.dt)
        val convertedDate = convertTimeStampToInt(dateInMilliseconds)
        it.dt = convertedDate
    }
    return formattedResponse.list
}