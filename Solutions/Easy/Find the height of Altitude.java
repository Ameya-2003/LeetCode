class Solution {
public:
    int largestAltitude(vector<int>& gain) 
    {
        int ht = 0;
        vector<int> alt;
        alt.push_back(0);
        
        for (int i = 0; i < gain.size(); i++)
        {
            ht += gain[i];
            alt.push_back(ht);
        }
        
        int maxht = alt[0];
        
        for(int j = 0; j < alt.size();j++)
        {
            if(alt[j] >= maxht) maxht = alt[j];
        }
        return maxht;
    }
};
