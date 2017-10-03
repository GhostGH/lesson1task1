package reflectionAnnotation.first;

public class MyClass {
    @Test(var1 = 2, var2 = 5)
    public static int sum(int a, int b){
        int res = 0;
        res = a + b;
        return res;
    }
}
