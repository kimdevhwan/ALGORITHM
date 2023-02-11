class Solution {
    
    String[] babyWords = {"aya", "ye", "woo", "ma"};
    
    public int solution(String[] babbling) {
        
        int answer = 0;
        
        if(babbling.length < 1 || babbling.length > 100)
            return answer;
        
        for(String inputWord : babbling) {
            if(inputWord.length() < 1 || inputWord.length() > 15) 
                return answer;
            
            for(String word : babyWords) {
                inputWord = inputWord.replace(word, "_");
                
                if(inputWord.replace("_","").length() < 1){
                //if(inputWord.length() < 1) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}