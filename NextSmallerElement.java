public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        int n = A.size();
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : A) {
            while (!stack.isEmpty() && stack.peek() >= num) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res.add(-1);
            } else {
                res.add(stack.peek());
            }
            stack.push(num);
        }
        
        return res;
    }
}
