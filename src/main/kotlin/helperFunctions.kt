import dataAcquisition.weatherListWithConvertedDateKeys
import dateFunctions.groupTemperatureDataByDate
import dateFunctions.groupWeatherConditionsByDate
import java.util.*
import kotlin.collections.ArrayList

fun averageTemperatures(): ArrayList<Double> {
    val mapOfTemperaturesByDate = groupTemperatureDataByDate(weatherListWithConvertedDateKeys())
    val listOfAverages: ArrayList<Double> = ArrayList()
    for (date in mapOfTemperaturesByDate) {
        listOfAverages.add(date.value.average())
    }
    return listOfAverages
}

fun majorityWeather(): ArrayList<String> {
    val mapOfWeatherConditionsByDate = groupWeatherConditionsByDate(weatherListWithConvertedDateKeys())
    val listOfConditions: ArrayList<String> = ArrayList()
    for (date in mapOfWeatherConditionsByDate) {
        var highestFrequency = 0
        var conditionType = ""
        for (condition in date.value.distinct()) {
            val frequency = Collections.frequency(date.value, condition)
            if (frequency > highestFrequency) {
                highestFrequency = frequency
                conditionType = condition
            }
        }
        listOfConditions.add(conditionType)
    }
    return listOfConditions
}

fun datesAsStrings(): ArrayList<String> {
    val mapOfWeatherConditionsByDate = groupWeatherConditionsByDate(weatherListWithConvertedDateKeys())
    val stringDates: ArrayList<String> = ArrayList()
    for (date in mapOfWeatherConditionsByDate) {
        val stringDate = date.key.toString()
        stringDates.add(stringDate)
    }
    return stringDates
}
