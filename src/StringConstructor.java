public class StringConstructor {
    public static void main(String[] args) {
        char [] arraychar =  {'b','i','r','t','h', ' ', 'd', 'a','y'};

        String a = "Hello";

        String s1 = "";
        String s3 = new String(arraychar, 6,3);
        String s4 = new String(arraychar,2,4);
        String s2 = new String(arraychar);
        System.out.printf("a= "+a +"%ns2= "+ s2+"%ns1= "+s1+"%ns4= " + s4 +"%ns3= " +s3);

    }

}
