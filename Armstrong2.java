class Armstrong2{
	public static void main(String[] args){
		int armCounter=0;
		for(int j=1;j<=100000000;j++){
			int num = j;
			int temp = num;
			int res=0;
			int pc=0;
			while(temp>0){
				pc++;
				temp/=10;
			}
			//System.out.println("length of num = "+pc);
			temp=num;
			while(temp>0){
				int rem = temp%10;
				//System.out.println("temp : "+temp+" ,  rem = "+rem);
				int remRes = 1;
				if(pc>1){
					for(int i=0;i<pc;i++){
						remRes *= rem;
						//System.out.println("resRes : "+remRes+" , rem : "+rem);
					}
				}
				temp/=10;
				res +=remRes;
			}
			if(res==num){
				armCounter++;
				System.out.println(num+" is Armstrong number");
			}else{
				//System.out.println("Not Armstrong number");
			}
		}
		System.out.println("total number os armstrong number : "+armCounter);
	}
}