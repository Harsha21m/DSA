class Solution {
    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        int digit1 = 0;
        int digit2 = 0;

        StringBuilder str = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                digit1 = num1.charAt(i) - '0';
                i--;
            } else {
                digit1 = 0;
            }

            if (j >= 0) {
                digit2 = num2.charAt(j) - '0';
                j--;
            } else {
                digit2 = 0;
            }

            int sum = digit1 + digit2 + carry;

            str.append(sum % 10);

            carry = sum / 10;

        }

        return str.reverse().toString();
    }
}
