
public abstract class metodos {
public static void metodoA() throws Exception {
	System.out.println("Iniciando método A");
	try{metodos.metodoB();
	}catch(Exception e) {
		System.out.println("Excessão capturada pelo método A!");
	}finally {
		System.out.println("Finalizando método A");
	}
}

public static void metodoB() throws Exception {
	System.out.println("Iniciando método B");
	try {
	metodos.metodoC();
	}finally {
	System.out.println("Finalizando método B");
	}
}

public static void metodoC() throws Exception {
	System.out.println("Iniciando método C");
	try {
	metodos.metodoD();
	}finally {
	System.out.println("Finalizando método C");
	}
}

public static void metodoD() throws Exception {
	System.out.println("Iniciando método D");
	try {
	throw new Exception();
}finally {
	System.out.println("Finalizando método D");
}
}
}