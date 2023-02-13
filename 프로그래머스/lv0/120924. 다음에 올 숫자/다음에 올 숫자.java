class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean isArithmetic = true; //등차수열여부
        int commonNum = 0; //공차 또는 공비

        if(common.length <= 2 || common.length >= 1000)
            return answer;

        for(int num : common) {
            if(num < -999 || num > 1999) return answer;
        }

        //등차수열 여부를 판단, 등차수열이 아니라면 무조건 등비수열
        for (int i = 0; i <common.length; i++) {

            if((i+2) >= common.length) break;

            //하나라도 공차가 같지 않다면 등차수열이 아니다
            if(common[i+1]-common[i] != common[i+2]-common[i+1]) {
                isArithmetic = false;
                break;
            }
        }

        if (isArithmetic){
            commonNum = common[1] - common[0]; //공차
            answer = common[common.length-1] + commonNum;
        } else {
            commonNum = common[1] / common[0];
            answer = common[common.length-1] * commonNum;
        }
        return answer;
    }
}