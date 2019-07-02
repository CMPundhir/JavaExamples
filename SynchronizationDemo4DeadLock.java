class SynchronizationDemo4DeadLock{
	
	public static void main(String[] args){
		final String res1 = "Icecream";
		final String res2 = "Chocolate";
		Thread t1 = new Thread(){
			public void run(){
				synchronized(res1){
					System.out.println(res1+" is locked by "+getName());
					try{Thread.sleep(200);}catch(Exception e){}
					synchronized(res2){
						System.out.println(res2+" is locked by "+getName());
						try{Thread.sleep(200);}catch(Exception e){}
						System.out.println(res2+" is released by "+getName());
					}
					System.out.println(res1+" is released by "+getName());
				}
			}
		};
		t1.start();
		Thread t2 = new Thread(){
			public void run(){
				synchronized(res2){
					System.out.println(res2+" is locked by "+getName());
					try{Thread.sleep(200);}catch(Exception e){}
					synchronized(res1){
						System.out.println(res1+" is locked by "+getName());
						try{Thread.sleep(200);}catch(Exception e){}
						System.out.println(res1+" is released by "+getName());
					}
					System.out.println(res2+" is released by "+getName());
				}
			}
		};
		t2.start();
	}
}