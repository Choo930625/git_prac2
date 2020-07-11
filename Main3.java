
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,1},{2,2},{1,2}};
		Main3 main = new Main3();
		int[] answer = main.solution(arr);
		
		for(int i=0;i<2;i++) {
			System.out.println(answer[i]);
		}
	}
	
	public int[] solution(int[][] v) {
		int[] xValue = new int[3];
		int[] yValue = new int[3];
		
		for(int i=0;i<v.length;i++) {
			xValue[i] = v[i][0];
			yValue[i] = v[i][1];
		}
		
		int[] answer = new int[2];
		
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

}
