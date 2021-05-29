package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        // throw NotImplementedError("Not implemented")
        var answer = sadArray
        while (!isHappy(answer)) {
            answer = oneStep(answer)
        }
        return answer
    }

    private fun isHappy(answer: IntArray): Boolean {
        for (i in 1 .. answer.size - 2) {
            if (answer[i] > answer[i-1]+answer[i+1])
                return false
        }
        return true
    }

    private fun oneStep(sadArray: IntArray): IntArray {
        // throw NotImplementedError("Not implemented")
        var filtered = sadArray
            .filterIndexed { index, it
                ->
                index == 0
                        || index == sadArray.size - 1
                        || it < sadArray[index - 1] + sadArray[index + 1]
            }
            .toIntArray()
        return filtered
    }
}
