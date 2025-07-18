public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String roman = "MCMXCIV"; // Example Roman numeral
        int result = solution.romanToInt(roman);
        System.out.println("Roman numeral " + roman + " is converted to integer: " + result);
    }
}
