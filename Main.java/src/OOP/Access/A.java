package OOP.Access;

public class A {
  private int num;
  String name;
  public int[] arr;
  protected int age;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name,int age) {
        this.num=num;
        this.name=name;
        this.age=age;
        this.arr=new int[num];
    }


}
