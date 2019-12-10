package leetcode149;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxPoints(int[][] points) {
        if(points.length==0) return 0;
        if(points.length==1) return 1;
        if(points.length==2) return 2;
        int length=points.length,res=0,count,countx,eq;
        Double temp;
        Map<Double,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++){
            map.clear();
            eq=0;
            countx=0;
            for(int j=i+1;j<length;j++){
                if(points[i][0]==points[j][0]  && points[i][1]==points[j][1]){
                    eq++;
                }
                else if(points[i][1]==points[j][1]){
                    countx++;
                }
                else{
                    temp=1.0*(points[i][0]-points[j][0])/(points[i][1]-points[j][1])+0.0;
                    if(map.containsKey(temp)){
                        count=map.get(temp)+1;
                        res=Math.max(res,count);
                        map.put(temp,count);
                    }
                    else{
                        map.put(temp,1);
                        res=Math.max(res,1);
                    }
                }
            }
            res=Math.max(res,countx)+eq+1;
            if(res>length/2) return res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] a=new int[][]{{5,2},{2,5},{0,-5},{1,5}};
        Solution solution=new Solution();
        solution.maxPoints(a);
    }
}