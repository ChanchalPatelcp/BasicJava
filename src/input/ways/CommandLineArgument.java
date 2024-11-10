package input.ways;

public class CommandLineArgument {

	public static void main(String[] args) {
		// 1 2 3 5
		
		System.out.println(args.length);

		for(String str : args)
			System.out.print(str + " ");
		
		int i =0;
		while(i<args.length) {
			System.out.print(args[i]+" ");
			i++;
		}

	}

}
