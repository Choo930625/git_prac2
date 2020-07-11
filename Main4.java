import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main4 main = new Main4();
		
		String s1 = "abddff";
		String s2 = "abcdefghijkl";
		
		System.out.println(main.isUnique(s1));
		System.out.println(main.isUnique(s2));
	}

	public int maxProfit2(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			}
			if (prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}

		return maxProfit;
	}

	public int reverse(int x) {
		int result = 0;

		while (x != 0) {
			int remain = x % 10;
			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && remain > 7)) {
				return 0;
			}
			if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && remain < -8)) {
				return 0;
			}

			result = result * 10 + remain;
			x /= 10;
		}

		return result;
	}

	public int reverse2(int x) {
		boolean negative = false;

		if (x < 0) {
			negative = true;
			x = -x;
		}

		long result = 0;
		while (x > 0) {
			result = result * 10 + (x % 10);
			x = x / 10;
		}

		if (result > Integer.MAX_VALUE) {
			return 0;
		}

		return negative ? (int) (-1 * result) : (int) (result);
	}

	public boolean isSubstring(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			String s3 = s1.substring(i + 1, s1.length()) + s1.substring(0, i + 1);
			if (s3.equals(s2)) {
				return true;
			}
		}
		return false;
	}

	public boolean solution(String[] name_list) {

		for(int i=0;i<name_list.length;i++) {
			for(int j=0;j<name_list.length;j++) {
				if(i!=j) {
					if(name_list[i].contains(name_list[j])) {
						return true;
					}
					if(name_list[j].contains(name_list[i])) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	//another way
	public boolean isUnique2(String s) {
		
		int checker = 0;
		
		
		for(int i=0;i<s.length();i++) {
			int val = s.charAt(i)-'a';
			if((checker & 1<<val)>0) {
				return false;
			}
			
			checker |= 1<<val;
		}
		
		return true;
	}

	
}
