class Table{
	public synchronized void printTable(int n){
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
class SynchronisationDemo{
	public static void main(String[] args){
		Table tb = new Table();
		MyThread t = new MyThread(tb,5);
		t.start();
		MyThread t2 = new MyThread(tb,50);
		t2.start();
	}
}