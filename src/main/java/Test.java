import java.util.Arrays;


public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        
        Integer i1 = getObject(Integer.class);
        System.out.println("i=" + i1);
        
        int i2 = getObject(Integer.class);
        System.out.println("i=" + i2);
        
        
//        int i = getObject(int.class);
//        System.out.println("i=" + i);
        
        int[] ints = getObject(int[].class);
        System.out.println("ints=" + Arrays.toString(ints));
        
        Integer[] ints2 = getObject(Integer[].class);
        System.out.println("ints=" + Arrays.toString(ints2));
        
        
    }
    
    public static <T> T getObject(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        System.out.println("getObject clazz.getCanonicalName()=" + clazz.getCanonicalName());
        switch (clazz.getCanonicalName()) {
        
        case "java.lang.Integer":
            return  clazz.cast(1);
            
        case "int":
            return clazz.cast(2);

        case "int[]":
            int[] ints = new int[1];
            ints[0] = 1;
        return clazz.cast(ints);
        
        case "java.lang.Integer[]":
            Integer[] ints1 = new Integer[1];
            ints1[0] = 2;
        return clazz.cast(ints1);
        default:
            break;
        }
        
        return null;
    }
}
