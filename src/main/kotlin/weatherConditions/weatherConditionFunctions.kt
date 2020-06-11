package weatherConditions

import averageTemperatures
import majorityWeather

fun getTemperatureRanges(): ArrayList<Int> {
    val listOfAverageTemperatures = averageTemperatures()
    val listOfTemperatureRanges: ArrayList<Int> = ArrayList()
    for (temp in listOfAverageTemperatures) {
        if (temp < 55) {
            listOfTemperatureRanges.add(1)
        } else if (temp > 55 && temp < 75) {
            listOfTemperatureRanges.add(2)
        } else {
            listOfTemperatureRanges.add(3)
        }
    }
    return listOfTemperatureRanges
}

fun getSunnyDays(): ArrayList<Boolean> {
    val listOfWeatherConditions = majorityWeather()
    val listOfSunnyConditions: ArrayList<Boolean> = ArrayList()
    for (condition in listOfWeatherConditions) {
        if (condition === "Clear") {
            listOfSunnyConditions.add(true)
        } else {
            listOfSunnyConditions.add(false)
        }
    }
    return listOfSunnyConditions
}

fun getRainyDays(): ArrayList<Boolean> {
    val listOfWeatherConditions = majorityWeather()
    val listOfRainyConditions: ArrayList<Boolean> = ArrayList()
    for (condition in listOfWeatherConditions) {
        if (condition === "Rain") {
            listOfRainyConditions.add(true)
        } else {
            listOfRainyConditions.add(false)
        }
    }
    return listOfRainyConditions
}