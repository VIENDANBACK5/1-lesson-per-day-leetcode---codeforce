class Solution {
    public boolean isPalindrome(int x) {
        String sodaonguoc = (new StringBuilder(x + "")).reverse().toString();
        // new StringBuilder tạo 1 đổi tượng mới với x cụ thể là : chuỗi kí tự x (121 => "121")
        // reverse đảo ngược chuỗi
        // toString đổi đổi tượng Stringbuilder thành chuỗi 
        return (x + "").equals(sodaonguoc);
    }
}
//cách 2
// public boolean isPalindrome(int x) {
//     if (x < 0 || (x % 10 == 0 && x != 0)) {
//         return false;
//     }

//     int reversed = 0;
//     int original = x;

//     while (x > reversed) {
//         reversed = reversed * 10 + x % 10;
//         x /= 10;
//     }

//     return x == reversed || x == reversed / 10;
// }
