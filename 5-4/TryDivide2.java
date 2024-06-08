public class TryDivide2{
  public static void main(String[] args){
    try{
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println("a / b = " + (a / b) + " あまり " + (a % b));
      System.out.println("プログラムを終了します");
    }catch(ArithmeticException e){
      System.out.println("割る数は0以外を入力して下さい");
      e.printStackTrace();
    }catch(NumberFormatException e){
      System.out.println("数値を入力して下さい");
      e.printStackTrace();
    }catch(Exception e){
      System.out.println("例外が発生しました");
      e.printStackTrace();
    }finally{
      System.out.println("プログラムを終了します");
    }
  }
}
