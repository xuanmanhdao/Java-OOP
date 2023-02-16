public class HelloWorld{
	public static void main(String[] args){
		String name;
		float height;
		int age;
		
		String[] family;
		family=new String[3];
		family[0]="Bo";
		family[1]="Me";
		family[2]="Em";
		
		name="Xuan Manh";
		height=1.73f;
		age=23;
		
		String[][] mang2Chieu={
			{"AAA","BBB","CCC"},
			{"AaA","AXZ","ASA"},
			{"BSA","AAG","OOO"}
		};
		
		
		System.out.print("Ten: ");
		System.out.println(name);
		System.out.print("Chieu cao: ");
		System.out.println(height);
		System.out.print("Tuoi: ");
		System.out.println(age);
		System.out.print("Family: ");
		for(int i=0; i<family.length; i++){
			System.out.print(family[i]);
			System.out.print("|");
		}
		
		System.out.println();
		System.out.print("Mang 2 chieu: ");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(mang2Chieu[i][j]+" ");
			}
		}
		
		System.out.println();
		for(String item:family){
			System.out.print(item);
			System.out.print("|");
		}
		
		System.out.println();
		switch(age){
			case 0:
				System.out.print("Day la 1");
				break;
			case 23:
				System.out.print("Day la 23");
				break;
			case 10:
				System.out.print("Day la 10");
				break;
			default:
				System.out.print("Chiu roi day");
		}
		
		System.out.println("\nHello");
	}
}