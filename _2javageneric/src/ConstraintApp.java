public class ConstraintApp  {
    public static void main(String[] args) {
        //NumberData<String> numberData = new NumberData<>(); // Type Parameter '' is not within its bound , should extend java.langNumber
        NumberData<Integer> integerNumberData = new NumberData<>(100);
        NumberData<Long> longNumberData = new NumberData<>(100L);
        NumberData<Float> floatNumberData = new NumberData<>(3232.1F);
        System.out.println(integerNumberData);
        System.out.println(longNumberData);
        System.out.println(floatNumberData);
    }

    public static class NumberData <T extends Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        @Override
        public String toString() {
            return "NumberData{" +
                    "data=" + data +
                    '}';
        }

        public void setData(T data) {
            this.data = data;
        }
    }

}