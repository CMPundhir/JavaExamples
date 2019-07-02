class Table{
	public static synchronized void printTable(int n){
		for(int i=1;i<11;i++){
			System.out.println(n*i);
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class MyThread extends Thread{
	Table t;
	int n;
	MyThread(Table t,int n){
		this.t = t;
		this.n = n;
	}
	public void run(){
		t.printTable(n);
	}
}
class SynchronizationDemo2{
	public static void main(String[] args){
		Table tb = new Table();
		MyThread t = new MyThread(tb,5);
		t.start();
		//created another table object so now both thread have different resources so we
		//need static synchronization 
		Table tb2 = new Table();
		MyThread t2 = new MyThread(tb2,50);
		t2.start();
	}
}