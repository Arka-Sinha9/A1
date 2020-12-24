class Threadt implements Runnable {
  String name;
  Thread t;
  int time;
  Threadt(String threadname,int time) {
    name = threadname;
    this.time=time;
    t = new Thread(this, name);
    System.out.println("thread:"+ t);
    t.start();
  }
  public void run() {
    try {
      for(int i = 5; i > 0; i--) {
        System.out.println(name);
        Thread.sleep(time);
      }
    } catch (InterruptedException e) {
      System.out.println(name + "Interrupted");
    }
    System.out.println(name + " exiting.");
  }
}
class Week11 {
  public static void main(String args[]) {
    Threadt t1=new Threadt("BMS COLLEGE OF ENGINEERING",10000);
    Threadt t2=new Threadt("COMPUTER SCIENCE OF ENGINEERING",2000);
  }
}
