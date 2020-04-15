package fibonacci

import grails.converters.JSON

class FibonacciController {
    static responseFormats = ['json', 'xml']

    def show(Integer id) {
        def generator = new FibonacciGenerator()
        render([
                'with-length': generator.generateWithLength(id),
                until        : generator.generateUntil(id)
        ]) as JSON
    }
}
