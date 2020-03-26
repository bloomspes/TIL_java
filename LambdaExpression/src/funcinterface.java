public class funcinterface {
    public static void main(String[] args) {
        funcinterfaceExp fi;

        fi = (x, y) -> {
            int result = x + y;
            return result;
        };

        System.out.println(fi.method(10, 20));

        fi = (x, y) -> {
            return x + y;
        };

        System.out.println(fi.method(10, 20));


    }

} 
