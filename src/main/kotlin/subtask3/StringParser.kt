package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        //throw NotImplementedError("Not implemented")
        val array = inputString.toCharArray()
        val stringSize = inputString.count() - 1
        val answerArray = ArrayList<String>()
        var isRoundBracket = false
        var roundBracket = ""
        var isSquareBracket = false
        var squareBracket = ""
        var isAngleBracket = false
        var angleBracket = ""
        for (i in 0..stringSize) {

            if (array[i] == ')' && roundBracket.length > 0) {
                isRoundBracket = false
                answerArray.add(roundBracket)
                roundBracket = ""
            }
            if (array[i] == ']' && squareBracket.length > 0) {
                isSquareBracket = false
                answerArray.add(squareBracket)
                squareBracket = ""
            }
            if (array[i] == '>' && angleBracket.length > 0) {
                isAngleBracket = false
                answerArray.add(angleBracket)
                angleBracket = ""
            }
            if (isRoundBracket) roundBracket += array[i]
            if (isSquareBracket) squareBracket += array[i]
            if (isAngleBracket) angleBracket += array[i]
            if (array[i] == '(') {
                isRoundBracket = true
                roundBracket = ""
            }
            if (array[i] == '[') {
                isSquareBracket = true
                squareBracket = ""
            }
            if (array[i] == '<') {
                isAngleBracket = true
                angleBracket = ""
            }


        }
        return answerArray.toTypedArray()
    }
}



