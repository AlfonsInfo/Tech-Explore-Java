    package passbyvaluebyreference;
    
    public class VisualizeStaticMethod {
    
        public static void main(String[] args) {
            String data = "Data awal";
            data = ubahData(data);
            System.out.println(data);
    
            TestingClass testingClass = new TestingClass("","",0);
            processingObject(testingClass);
            System.out.println(testingClass);
        }
    
        public static String ubahData(String data){
            return "data telah diubah";
        }
    
    
        public static void processingObject(TestingClass anObject){
                anObject.var1 = "var1";
                anObject.var2 = "var2";
                anObject.var3 = 3;
        }
    }
    
    class TestingClass{
        String var1;
        String var2;
        int var3;
    
        public TestingClass(String var1, String var2, int var3) {
            this.var1 = var1;
            this.var2 = var2;
            this.var3 = var3;
        }
    
        @Override
        public String toString() {
            return "TestingClass{" +
                    "var1='" + var1 + '\'' +
                    ", var2='" + var2 + '\'' +
                    ", var3=" + var3 +
                    '}';
        }
    }
