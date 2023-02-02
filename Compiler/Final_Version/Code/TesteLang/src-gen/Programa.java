public class Programa{
	static int argumento;
	static int fatorial;
	
	public static void main(String args[]){
		argumento = Integer.parseInt(System.console().readLine());
		fatorial = argumento;
		if(argumento == 0) fatorial = 1;
		while(argumento > 1) {
			fatorial = fatorial * argumento - 1;
			argumento = argumento - 1;
		}
		System.out.println(fatorial);
	}
}
