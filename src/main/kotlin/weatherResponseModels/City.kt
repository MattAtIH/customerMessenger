package weatherResponseModels

class City(val id: Int, val name: String, val coord: Coordinate, val country: String, val population: Int, val timezone: Int, val sunrise: Int, val sunset: Int) {
}