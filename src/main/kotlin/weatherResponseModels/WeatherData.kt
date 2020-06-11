package weatherResponseModels

class WeatherData(
        val cod: String,
        val message: Int,
        val cnt: Int,
        val list: List<WeatherItem>,
        val city: City) {
}