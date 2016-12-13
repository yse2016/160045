import java.io.*;
public class ShowText{
  public static void main(String[] args) {
    FileReader fr = null;
    BufferedReader in null;
    try{
      fr = new FileReader("data.txt");
  		in = new BufferedReader(fr);
      for(int i = 0;  i < 10;  i++){
  			data = in.readLine();
  			System.out.println(data);
  		}
      in.close();
    }catch(IOException e){
      System.out.println("Error");
    }

  }
}
