/* 
정수를 담고 있는 배열 arr의 평균값을 return하는 함수 만들기

<제한사항>
arr은 길이 1 이상, 100 이하인 배열이다.
arr의 원소는 -10,000 이상 10,000 이하인 정수이다.

[1,2,3,4] -> 2.5
[5,5] -> 5
 */

package level_1;

public class Test211026 {

	public static void main(String[] args) {
			int [] arr = {1,2,3,4};
	        double answer = 0;
	        double sum = 0;
	        
	        for(int i=0; i<arr.length; i++){
	                sum += arr[i];
	        }
	        
	        answer = sum/arr.length;
	        System.out.println(answer);
	}
}
