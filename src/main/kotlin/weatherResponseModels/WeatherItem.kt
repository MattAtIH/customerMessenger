package weatherResponseModels

class WeatherItem(
        var dt: Int,
        val main: Temperature,
        val weather: List<WeatherConditions>,
        val clouds: Clouds,
        val wind: Wind,
        val rain: Rain?,
        val sys: Sys,
        val dt_txt: String)