package strings;

public class strcompress {

    public static String strCompress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.length() < str.length() ? compressed.toString() : str;

        // String newStr="";
        // for(int i=0; i<str.length(); i++){
        //     Integer count=1;
        //     while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     newStr+=str.charAt(i);
        //     if(count>1){
        //         newStr+=count.toString();
        //     }
        // }
        // return newStr;
    }

    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(strCompress(str));
    }
}
