class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums,new ArrayList<>(),0);
        return ans;    
        }

    void dfs(int[] nums,List<Integer> curr,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        dfs(nums,curr,idx+1);

        curr.add(nums[idx]);
        dfs(nums,curr,idx+1
        );
        curr.remove(curr.size() -1);

        return;
    }
}