//little tough, got through 75% with the logic i had before I looked up the solutions.
//Need to study more.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> storage = new HashMap<>();

        for(String string: strs){
            char[] something = string.toCharArray(); 
            Arrays.sort(something);
            String sortedStrs = new String(something);

            if(!storage.containsKey(sortedStrs)){
                storage.put(sortedStrs, new ArrayList<>());
            }
            
            storage.get(sortedStrs).add(string);
        }

        return new ArrayList<>(storage.values());
    
    }
}