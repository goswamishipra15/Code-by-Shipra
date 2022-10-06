class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid:asteroids){
            while(!stack.isEmpty() && stack.peek()>0 && asteroid<0){
                int difference = stack.peek()+asteroid;
                if(difference<0){
                    stack.pop();
                }
                else if(difference == 0){
                    stack.pop();
                    asteroid = 0;
                }
                else{
                    asteroid = 0;
                }
            }
            if(asteroid!=0)
                stack.push(asteroid);
        }
        int[] ans = new int[stack.size()];
        for (int t = ans.length - 1; t >= 0;t--) {
            ans[t] = stack.pop();
        }
        return ans;
    }
}
