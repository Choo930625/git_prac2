import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main5 main = new Main5();
		
		int[] arr = {1,2,3,3,3,3,4,4};
		int[] arr1 = {3,2,4,4,2,5,2,5,5};
		int[] arr2 = {3,5,7,9,1};
		
		int[] ans = main.solution(arr2);
		
		for(int num : ans) {
			System.out.println(num);
		}
	}
	
	public int[] solution(int[] arr) {
		
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				int count = 1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				if(count!=1) {
					list.add(count);
				}
			}
			
		}
		
		if(list.size()==0) {
			int[] ans = {-1};
			return ans;
		}
		
		int[] ans = new int[list.size()];
		
		for(int i=0;i<list.size();i++) {
			ans[i] = list.get(i);
		}
		
		return ans;
	}
	
	public int maxSubArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			int sum = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(sum + )
			}
		}
	}

}
