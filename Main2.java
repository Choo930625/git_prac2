import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,4,4,2,5,2,5,5};
		
		Main2 main = new Main2();
		
		int[] answer = main.solution(arr);
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
	
	public int[] solution(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				int count = countOf(arr[i], arr);
				if(count>1) {
					list.add(count);
				}
			}
		}
		
		if(list.size()==0) {
			return new int[] {-1};
		}
		
		int[] answer = new int[list.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
	
	public int countOf(int num, int[] arr) {
		
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		
		return count;
	}

}
