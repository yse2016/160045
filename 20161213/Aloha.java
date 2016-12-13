public class Aloha{
  public static void main(String[] args) {
    String mainMsg;
    String subMsg;
    mainMsg = "test";
    subMsg = "test";


while (true) {
    System.out.println("Please message");
    mainMsg = new java.util.Scanner(System.in).nextLine();
    if(mainMsg.equals("exit")) {
      System.out.println("exit!");
      break;
    }else{
      System.out.println("Your massage:"+mainMsg);
      }
    }
  }
}
