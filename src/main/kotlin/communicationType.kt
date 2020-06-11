import weatherConditions.getRainyDays
import weatherConditions.getSunnyDays
import weatherConditions.getTemperatureRanges

fun getCommunicationType(): ArrayList<String> {
    val listOfTemperatureRanges = getTemperatureRanges()
    val listOfSunnyDays = getSunnyDays()
    val listOfRainyDays = getRainyDays()
    val listOfCommunications: ArrayList<String> = ArrayList()
    for (i in 0..4) {
        if (listOfSunnyDays[i] && (listOfTemperatureRanges[i] === 3)) {
            listOfCommunications.add("text")
        } else if (listOfTemperatureRanges[i] === 2) {
            listOfCommunications.add("email")
        } else if (listOfRainyDays[i] || (listOfTemperatureRanges[i] === 1)) {
            listOfCommunications.add("call")
        } else {
            listOfCommunications.add("do not contact")
        }
    }
    return listOfCommunications
}

fun printCommunicationTypeByDate() {
    val listOfDates = datesAsStrings()
    val listOfCommunicationTypes = getCommunicationType()
    for (i in 0..4) {
        println(listOfDates[i] + ": " + listOfCommunicationTypes[i])
    }
}