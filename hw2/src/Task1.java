public class Task1 {
    static boolean equals(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); ++i){
            if(s.toLowerCase().charAt(i) != t.toLowerCase().charAt(i)){
                return false;
            }
        }
        return true;
    }

    static String replace(String str, String oldStr, String newStr) {
       int m = oldStr.length();
       int k = 0;
       String a = "";
       for(int i = 0; i <= str.length()-m; ++i){
           //System.out.println(str.substring(i, i+m));
           if(str.substring(i, i+m).equals(oldStr)){
               a = str.substring(0, i) + newStr + str.substring(i+m);
               i += newStr.length()-1;
               str = a;
           }
        }
       return str;
    }
    static String format(String surname, int mark, String subject) {
        return("Студент " + surname + " получил " + mark + " по " + subject);
    }
    static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
