public class ExactSearchTester {

    public static void main(String[] args) {
        char[] target = "abracadabra".toCharArray();
        char[] query = "ra".toCharArray();
        System.out.println(ExactSearch.indexOf(query,target)); //2

        char[] target1 = "abracadabra".toCharArray();
        char[] query1 = "abra".toCharArray();
        System.out.println(ExactSearch.indexOf(query1,target1)); //0

        char[] target2 = "abracadabra".toCharArray();
        char[] query2 = "aba".toCharArray();
        System.out.println(ExactSearch.indexOf(query2,target2)); //-1

        char[] target3 = "ab".toCharArray();
        char[] query3 = "aba".toCharArray();
        System.out.println(ExactSearch.indexOf(query3,target3)); //-1

        char[] target4 = "xa".toCharArray();
        char[] query4 = "aba".toCharArray();
        System.out.println(ExactSearch.indexOf(query4,target4)); //-1

        char[] target5 = "abracadabras".toCharArray();
        char[] query5 = "abras".toCharArray();
        System.out.println(ExactSearch.indexOf(query5,target5)); //7
    }
}
