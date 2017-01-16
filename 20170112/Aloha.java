//constructor

public class Aloha {
  public static void main(String[] args) {
    int num = args.length;

    if (num == 0) {
      am.sayAloha();
    }else if (num == 1) {
      int data1 = Integer.parseInt(args[0]);
      am.sayAloha(data1);
    }else if (num == 2) {
      int data1 = Integer.parseInt(args[0]);
      int data2 = Integer.parseInt(args[1]);
      am.sayAloha(data2);
    }
  }
}
