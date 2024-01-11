import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());

    for (int i = 1; i <= a; i++) {
      int q = i * i;
      int c = i * i * i;
      System.out.println(i + " " + q + " " + c);

      if (i == 1) {
        q++;
        c++;
        System.out.println(i + " " + q + " " + c);
      } else {
        q = q + 1;
        c = c + 1;
        System.out.println(i + " " + q + " " + c);
      }

    }

  }
}