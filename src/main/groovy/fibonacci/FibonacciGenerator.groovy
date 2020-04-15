package fibonacci

class FibonacciGenerator {

    List<Integer> generateWithLength(Integer length, List<Integer> sequence = [1, 1]) {
        if(length == 1) {
            [1]
        } else if (length < 1) {
            throw new RuntimeException("Invalid value!! Length can't be under 1")
        } else if(sequence.size() < length) {
            def lastTwoNumbers = sequence.takeRight(2)
            sequence.add(lastTwoNumbers.first() + lastTwoNumbers.last())
            generateWithLength(length, sequence)
        } else {
            sequence
        }
    }

    List<Integer> generateUntil(Integer max, List<Integer> sequence = [1, 1]) {
        if(max == 1) {
            [1]
        } else if (max < 1) {
            throw new RuntimeException("Invalid value!! Length can't be under 1")
        } else {
            def lastTwoNumbers = sequence.takeRight(2)
            def newValue = lastTwoNumbers.first() + lastTwoNumbers.last()
            if (newValue >= max) {
                sequence
            } else {
                sequence.add(newValue)
                generateUntil(max, sequence)
            }
        }
    }
}
