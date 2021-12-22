/*가장 큰 수
[문제 설명]
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

[제한 사항]
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.

ex)
numbers      		return
[6, 10, 2]	     	"6210"
[3, 30, 34, 5, 9]	"9534330"
 */
package level_2;

import java.util.Arrays;
import java.util.Comparator;

public class Test211222 {

	public static void main(String[] args) {
		  		int [] numbers = {6, 10, 2};
		        String[] nums = new String[numbers.length];

		        for (int i=0; i<nums.length; i++) 
		            nums[i] = numbers[i] + "";

		        Arrays.sort(nums, new Comparator<String>() {
		            public int compare(String o1, String o2) {
		                return (o2 + o1).compareTo(o1 + o2);
		            }
		        });

		        String ans = "";
		        for (int i=0; i<numbers.length; i++)
		            ans += nums[i];

		        System.out.println(ans.charAt(0) == '0' ? "0" : ans);
		    
	}

}
