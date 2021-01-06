package javaµÚËÄ¿Î;

public class question724 {

	public static void main(String[] args) {
		int[] Hearts=new int[14];
		int[] Spades=new int[14];		
		int[] Clubs=new int[14];		
		int[] Diamonds=new int[14];
		int[] enough=new int[4];
		int i,j;
		for(i=0;i<=3;i++) {
			enough[i]=0;
		}
		for(i=0;i<=3;i++) {
			for(j=0;j<=12;j++) {
				if(i==1) {
					Hearts[j]=j+1;
				}
				else if(i==2) {
					Spades[j]=j+1;
				}
				else if(i==3) {
					Clubs[j]=j+1;
				}
				else {
					Diamonds[j]=j+1;
				}
			}
		}
		Boolean flag=true;
		while(flag) {
			int kind=(int)(Math.random()*4)+1;
			int number=(int)(Math.random()*13)+1;
			if(kind==1) {
				System.out.print("  Hearts"+Hearts[number]);
				enough[0]=1;
			}
			else if(kind==2) {
				System.out.print("  Spades"+Spades[number]);
				enough[1]=1;
			}
			else if(kind==3) {
				System.out.print("  Clubs"+Clubs[number]);
				enough[2]=1;
			}
			else{
				System.out.print("  Diamonds"+Diamonds[number]);
				enough[3]=1;
			}
			if(enough[1]+enough[2]+enough[3]+enough[0]==4) {
				flag=false;
			}
		}
	}
}
