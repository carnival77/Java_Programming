package day09.quiz;

import java.util.TreeSet;

public class Quiz01 {
	public static void main(String[] args) {
		// 1 ~ 45 �� 6���� ���ڸ� �ߺ� ���� �̱�
		// set.size() : ���� set�� ���� ����
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(lotto.size() != 6) {
			lotto.add( (int)(Math.random() *45) + 1);
		}
		System.out.println(lotto);
		
//		int[] nums = new int[6];
//		for(int i = 0; i < nums.length; ++i) {
//			nums[i] = (int)(Math.random()*45) + 1;
//			for(int j = 0; j < i; ++j) {
//				if(nums[i] == nums[j]) {
//					--i;
//					break;
//				}
//			}
//		}
//		
//		for(int num : nums) {
//			System.out.println(num);
//		}
	}
}
