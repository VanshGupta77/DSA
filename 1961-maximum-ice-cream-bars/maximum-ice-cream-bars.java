class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int count =0;
        for(int i=0; i<costs.length; i++){
            if(coins < costs[i]) return count; //If coins are less than the ice cream on 'i' index then return count immediately cause array sorted is sorted and coins can not afford anything after that 'i' index also
            coins = coins - costs[i]; //Subtract the coins used to buy the ice cream on 'i' index if you can afford it
            count++; //Store the number of already bought Ice creams
        }
        return count;
    }
}