package Zadacha2;

public class Timer extends Thread{
    private int interval;
    private int n;
    private String timerName;

    public Timer(int interval, int n, String timerName){
        this.interval = interval;
        this.n = n;
        this.timerName = timerName;
    }
    public void run(){
        for (int i=0; i<n; i++){
          System.out.println(i + "" + this.timerName);
          try{
              sleep(interval);
          } catch (InterruptedException e){
              e.printStackTrace();
          }
        }
        System.out.println("Kraj na " + this.timerName);
    }
}
