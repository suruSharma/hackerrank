public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 26;

		int max = (int) Math.sqrt(n);
		boolean flag = true;
		for (int i = 2; i <= max && flag; i++) {

			int p = n;

			
			
			while(p%i == 0)
			{
				p = p/i;
				if(p==i)
				{
					System.out.println(i);
					//flag = false;
					return;
					//break;
				}
			}
			
			
			
		}
		
		System.out.println("No");
	}

}
