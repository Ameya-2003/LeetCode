class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet();

        for(int i=0;i<arr.length;i++){
                map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }

       //if all the values are same of map then return true

           // Integer checkValue=map.get(arr[0]);
            for( Map.Entry<Integer,Integer> element: map.entrySet()){
                   set.add(element.getValue());
            }

            if(map.size() ==set.size() ) {
                return true;
            }
            


         return false;
    }
}
