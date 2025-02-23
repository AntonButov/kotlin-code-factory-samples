class FindTheDifferenceImpl: FindTheDifference {
    override fun getDifference(first: String, second: String): String {
        val frequencyMap = first.groupingBy { it }.eachCount().toMutableMap()

        for (char in second) {
            val count = frequencyMap[char] ?: 0
            if (count == 0) {
                return char.toString()
            } else {
                frequencyMap[char] = count - 1
            }
        }

        return ""
    }
}