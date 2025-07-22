package set1;

public class AddTwoStrings {
        private static void sol(String a, String b) {
            int al = a.length()-1;
            int bl = b.length()-1;

            StringBuilder result = new StringBuilder();
            int c = 0;
            while(al >=0 || bl>=0 || c>0) {
                int result1 = 0;
                result1 += c;
                c = 0;
                if(al<0 && bl>=0) {
                    result1 += (b.charAt(bl) - '0');
                    bl--;
                } else if(bl<0 && al>=0) {
                    result1 += (a.charAt(al) - '0');
                    al--;
                } else if(al>=0 && bl>=0) {
                    int t = (a.charAt(al) - '0') + (b.charAt(bl) - '0');
                    c = t/10;
                    result1 += t%10;
                    al--; bl--;
                }
                result.append(result1);
            }

            System.out.printf("result: %s", result.reverse());
        }

    public static void main(String[] args) {
            sol("200", "40");
    }

}
