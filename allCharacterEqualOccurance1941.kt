class Solution {
    fun areOccurrencesEqual(s: String): Boolean {
        val count = mutableMapOf<Char, Int>()

        for(x in s){
                count[x]= 1 + count.getOrDefault(x, 0)
            } 
            //checks if all charavter occues the same # of times.
            val allTheLetter = count.values
            return allTheLetter.toSet().size == 1
        }
}