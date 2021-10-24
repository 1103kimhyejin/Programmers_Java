/* 핸드폰 번호 가리기
 개인정보 보호를 위해 고객들의 전화번호를 가리기 위해
 전화번호가 문자열 phone_number로 주어졌을 때, 
 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴!
 */

package level_1;

public class Test211024 {
	public static void main(String[] args) {
		String phone_number = new Test211024().solution("0100000000");
		System.out.println(phone_number);
	}

	public String solution(String phone_number) {
		String star = "";

		for (int i = 0; i < phone_number.length() - 4; i++) {
			star += "*";
		}
		return star + phone_number.substring(phone_number.length() - 4);
	}
}
