class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int s=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0;
        while(i<players.length&&j<trainers.length){
          if(players[i]<=trainers[j]){
            i++;
            j++;
            s++;
          }else{
            if(players[i]>trainers[j]){
                j++;
            }
          }
        }
        return s;
    }
}