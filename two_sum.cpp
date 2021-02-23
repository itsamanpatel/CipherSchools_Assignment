class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> tmp;
        vector<int> re;
        for(int i=0;i<nums.size();i++)
        {
            tmp[nums[i]] = i;
        }
        for(int j=0;j<nums.size();j++)
        {
            int t = target - nums[j];
            if(tmp.count(t) && tmp[t]!=j)
            {
                re.push_back(j);
                re.push_back(tmp[t]);
                break;
            }
        }
        return re;
    }
};