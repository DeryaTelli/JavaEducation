public class Student {
    public static Student find(String id) throws StudentException{ // busekilde de yazilabilir (throws Exception,ArithmeticException {)
        if (id.equals("123")) {
            System.out.println("New Student");
            return  new Student();

        }else{
            throw new StudentException("Student hasn't been found");
        }

    }
}

