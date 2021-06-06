import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class calculos {
public static Optional<Double> fatorial(double x) {
	Long y = (long) x;
	Stream<Double>factor = Stream.iterate(1.0, w ->w+1).limit(y);
	return factor.reduce((acum, corr) -> acum*corr);
}

public static List<Double> parc(double y){
	Long lg = (long) 10;
	Stream<Double> numbers = Stream.iterate(2.0, x->x+2).limit(lg);
	List<Double> l1 = numbers.map(x -> x = (Math.pow(-1, (x/2))/(calculos.fatorial(x).get()))*Math.pow(y, x)).collect(Collectors.toList());
	return l1;
}
}
