import java.sql.SQLOutput;

public class MultipleConstraintApp {
    public interface CanSayHello
    {
        void sayHello(String name);
    }

    public static abstract class Employee /* implements CanSayHello */ {

    }
    public static class Manager extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Hello dari manager");
        }
    }

    public static class VicePresident extends Employee implements CanSayHello{

        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    //Multiple bound, harus EMployee dan implement canSayHello
    public static class Data<T extends Employee & CanSayHello>{
        private  T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        //Kalo manager ga implement salah satu maka ga bakaln bisa
        Data<Manager> manager = new Data<>(new Manager());
        Data<VicePresident>  vp= new Data<VicePresident>(new VicePresident());

        //Harus implement sayHello juga baru bisa Employee
//        Data<Employee> employeeData = new Data<Employee>(new Employee() {
//            @Override
//            public void sayHello(String name) {
//                System.out.println("Harus");
//            }
//        });

    }

}
