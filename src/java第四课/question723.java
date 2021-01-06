package javaµÚËÄ¿Î;

public class question723 {

	public static void main(String[] args) {
		int[] box=new int[100];
		int i=1,j=1;
		for(i=0;i<=99;i++) {
			box[i]=0;
		}
		for(i=1;i<=100;i++) {
			for(j=1;j<=100;j++) {
				if(j%i==0) {
					if(box[j-1]==0)
						box[j-1]=1;
					else
						box[j-1]=0;
				}
			}
		}
		for(i=0;i<=99;i++) {
			System.out.print(box[i]+" ");
		}
	}

}
