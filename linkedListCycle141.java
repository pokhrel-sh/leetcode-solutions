public class Solution {
    Set<ListNode> visited = new HashSet<>();
    public boolean hasCycle(ListNode head) {
        //checking the end.
        if(head == null) {
            return false;
        }
        if(visited.contains(head)) {
            return true;
        }
        visited.add(head);
        return hasCycle(head.next);

            
        }
}