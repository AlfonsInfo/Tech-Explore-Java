public class MyData<T> {
    private T Data;

    public MyData(T data) {
        Data = data;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "Data=" + Data +
                '}';
    }
}
