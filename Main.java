import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] v = {{1,1},{2,2},{1,2}};
		
		Main main = new Main();
		
		int[] arr = {3,5,7,9,1};
		
		main.solution2(arr);

	}
	
	public int[] solution(int[][] v) {
        int[] answer = new int[2];
        int[] xValue = new int[3];
        int[] yValue = new int[3];
        
        for(int i=0;i<v.length;i++) {
            xValue[i] = v[i][0];
            yValue[i] = v[i][1];
        }
        
        if(xValue[0]==xValue[1]) {
        	answer[0] = xValue[2];
        }
        else {
        	if(xValue[0]==xValue[2]) {
        		answer[0] = xValue[1];
        	}
        	else {
        		answer[0] = xValue[0];
        	}
        }
        
        if(yValue[0]==yValue[1]) {
        	answer[1] = yValue[2];
        }
        else {
        	if(yValue[0]==yValue[2]) {
        		answer[1] = yValue[1];
        	}
        	else {
        		answer[1] = yValue[0];
        	}
        }
        

        
        return answer;
    }
	
	public int[] solution2(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length-1;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				int count = 0;
				for(int j=i;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				if(count>1) {
					list.add(count);
				}
			}
		}
		
		if(list.size()==0) {
			int[] ans = new int[1];
			ans[0] = -1;
			return ans;
		}
		
		int[] answer = new int[list.size()];
		
		for(int i=0;i<answer.length;i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
	

}