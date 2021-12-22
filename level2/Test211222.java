/*���� ū ��
[���� ����]
0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.

���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.

0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.

[���� ����]
numbers�� ���̴� 1 �̻� 100,000 �����Դϴ�.
numbers�� ���Ҵ� 0 �̻� 1,000 �����Դϴ�.
������ �ʹ� Ŭ �� ������ ���ڿ��� �ٲپ� return �մϴ�.

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
