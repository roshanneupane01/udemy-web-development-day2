class RecursivePalindrome {
    public static void main(String[] args) {
        System.out.println(recursivePalindrome("racecar"));
    }

    private static Boolean recursivePalindrome(String word) {

        if(word.length() <= 1){
            return true;
        }

        if(word.charAt(0) != word.charAt(word.length()-1)){
            return false;
        }
       

        return recursivePalindrome(word.substring(1, word.length()-1));
    }
}