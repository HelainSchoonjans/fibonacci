import fibonacci.FibonacciGenerator
import spock.lang.Specification

class FibonacciGeneratorSpec extends Specification {

    def "It can generate sequences with length"() {
        given:
        def generator = new FibonacciGenerator()

        expect:
        generator.generateWithLength(10) == [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
        generator.generateWithLength(5) == [1, 1, 2, 3, 5]
    }

    def "It can generate the first two numbers of the sequence"() {
        given:
        def generator = new FibonacciGenerator()

        expect:
        generator.generateWithLength(1) == [1]
        generator.generateWithLength(2) == [1, 1]
    }

    // until


    def "It can generate sequences until"() {
        given:
        def generator = new FibonacciGenerator()

        expect:
        generator.generateUntil(10) == [1, 1, 2, 3, 5, 8]
        generator.generateUntil(5) == [1, 1, 2, 3]
    }

    def "It can generate the first two numbers of the sequence until"() {
        given:
        def generator = new FibonacciGenerator()

        expect:
        generator.generateUntil(1) == [1]
        generator.generateUntil(2) == [1, 1]
    }
}
