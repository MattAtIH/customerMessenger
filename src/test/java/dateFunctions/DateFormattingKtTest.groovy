package dateFunctions

class DateFormattingKtTest extends groovy.util.GroovyTestCase {
    void testConvertToMilliseconds() {
        def dateTime = 1234567890
        def expected = 1234567890000
        assertEquals((dateTime * 1000), expected)
    }

    void testConvertTimeStampToInt() {
        def stringDate = '1211'
        def expectedDateInt = 1211
        assertEquals((stringDate.toInteger()), expectedDateInt)
    }

    void testConvertDateToInt() {

    }
}
