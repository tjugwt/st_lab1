package check;

public class Check {

	char[] a = {50,20,5,5,1,1,1};
	public boolean check(int x) {
		
		for(int i=0;i<7;i++) {
			if(x>=a[i]) {
				x=x-a[i];
			}
			if(x==0) {
				break;
			}
		}
		if(x==0)
			return true;
		else
		    return false;
	}
}


