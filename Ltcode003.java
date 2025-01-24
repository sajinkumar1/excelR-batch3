public class Ltcode003 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int index = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        int result = 0;
        while (index < s.length()) {
            char currentChar = s.charAt(index);
            if (!Character.isDigit(currentChar)) {
                break;
            }

            int digit = currentChar - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        Ltcode003 solution = new Ltcode003();
        System.out.println(solution.myAtoi("42"));
        System.out.println(solution.myAtoi("   -42"));
        System.out.println(solution.myAtoi("4193 with words"));
        System.out.println(solution.myAtoi("words and 987"));
        System.out.println(solution.myAtoi("-91283472332"));
        System.out.println(solution.myAtoi("91283472332"));
    }
}