import java.io.*;
class thorwsss{
    public static void findfile() throws IOException {
    File newFile=new File("text.csv");
    FileInputStream stream=new FileInputStream(newFile);
    }
}


/* Throw Exception*/

class thorww{
    public static void main(String[] args) {
        throw new ArithmeticException("Trying to divide by zero");
    }
}
