//buffer reader = use to take the input from the user
//if we direct pass the value it take 'ascai value'
// so we use the 'InputStreamReader' to take the same value

// import => import java.io.*;
// import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class basic{
    public static void main(String[] args) throws IOException {
        InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(io);

        String a = br.readLine();
        System.out.println(a);

        int number = Integer.parseInt(br.readLine()); // this statement conver the asci value into the integer value 
        System.out.println(number);
    }
}
