
public abstract class metodos {
public static void metodoA() throws Exception {
	System.out.println("Iniciando m�todo A");
	try{metodos.metodoB();
	}catch(Exception e) {
		System.out.println("Excess�o capturada pelo m�todo A!");
	}finally {
		System.out.println("Finalizando m�todo A");
	}
}

public static void metodoB() throws Exception {
	System.out.println("Iniciando m�todo B");
	try {
	metodos.metodoC();
	}finally {
	System.out.println("Finalizando m�todo B");
	}
}

public static void metodoC() throws Exception {
	System.out.println("Iniciando m�todo C");
	try {
	metodos.metodoD();
	}finally {
	System.out.println("Finalizando m�todo C");
	}
}

public static void metodoD() throws Exception {
	System.out.println("Iniciando m�todo D");
	try {
	throw new Exception();
}finally {
	System.out.println("Finalizando m�todo D");
}
}
}