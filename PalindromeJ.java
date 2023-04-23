public static boolean isPalindrome1(String s) 
{

    s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
    
    int start = 0;
    
    int end = s.length() - 1;
    
    while (start < end){
    
        if (s.charAt(start) != s.charAt(end)){
    
            return false;
    
        }
    
        start++;
    
        end--;
    
    }
    
    return true;
    
}