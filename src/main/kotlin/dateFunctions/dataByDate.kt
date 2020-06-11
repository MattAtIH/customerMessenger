package dateFunctions

import weatherResponseModels.WeatherItem

fun groupTemperatureDataByDate(convertedWeatherData: List<WeatherItem>): Map<Int, List<Double>> {
    return convertedWeatherData.groupBy({ it.dt }, { it.main.temp })
}

fun groupWeatherConditionsByDate(convertedWeatherData: List<WeatherItem>): Map<Int, List<String>> {
    return convertedWeatherData.groupBy({ it.dt }, { it.weather[0].main })
}