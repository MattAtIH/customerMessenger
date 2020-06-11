package dateFunctions

class DateFormattingKtTest extends groovy.util.GroovyTestCase {
    void testConvertToMilliseconds() {
        def dateTime = 1234567890
        def expected = 1234567890000
        assertEquals((dateTime * 1000), expected)
    }

    void testConvertTimeStampToInt() {
    }

    void testConvertDateToInt() {
    }
}
