class Solution {
    public int solution(String s) {
        int min_length = 0;
        for (int i=0; i<s.length(); i++) {
            int length = compressed_length(i, s);
            System.out.println(length);
            if (length < min_length) {
                min_length = length;
            }
        }
        
        return min_length;
    }
    
    private static int compressed_length(int n, String s) {
        int length = 0;
        int count = 1;
        String prev_string = s.substring(0, n);
        String current_string;
        
        // compare substrings 
        for (int i=0; i<s.length(); i+=n) {
            if (i != 0) {
                current_string = s.substring(i*n, i*n+n);
                if (prev_string.equals(current_string)) {
                    count++; 
                }
                else {
                    if (count == 1) {
                        length += n;
                    }
                    else {
                        length += digit(count);
                        length += n;
                    }
                    count = 1;
                }
            }
            prev_string = s.substring(i*n, i*n+n); 
        }
    
        return length; 
    }
    
    private static int digit(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number/10;
        }
        return count;
    }
}