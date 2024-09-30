class Outer
{
      public void display()
      {
        Inner in=new Inner();
        System.out.println("In outer");
        in.show();
      }

      class Inner
      {
        public void show()
        {
          System.out.println("Inside inner");
        }
      }
}

class Test
{
  public static void main(String[] args)
  {
    Outer ot = new Outer();
    System.out.println("inner of main");
    ot.display();
  }
}