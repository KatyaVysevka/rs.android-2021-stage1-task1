package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        /* throw NotImplementedError("Not implemented") */
        val sum = bill.sum()
        val divide = (sum - bill [k]) / 2
        val billAnna = b - divide
        if (billAnna == 0) {
            return "Bon Appetit"
        } else {
            val moneyAnna = billAnna.toString()
            return moneyAnna
        }
    }
}

