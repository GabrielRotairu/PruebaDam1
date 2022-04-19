package primerTrimestr;
import java.util.Calendar;
import java.util.Random;
public class Clase {
private int codClase;
private String sala;
private String horaComienzo;
private Calendar fechaComienzo;
static Random rnd= new Random();
public Clase(int codClase, String sala, String horaComienzo, Calendar fechaComienzo) {
	super();
	this.codClase = codClase;
	this.sala = sala;
	this.horaComienzo = horaComienzo;
	this.fechaComienzo = fechaComienzo;
}
public Clase() {
	super();
	
}
public int getCodClase() {
	return codClase;
}
public void setCodClase(int codClase) {
	this.codClase = codClase;
}
public String getSala() {
	return sala;
}
public void setSala(String sala) {
	this.sala = sala;
}
public String getHoraComienzo() {
	return horaComienzo;
}
public void setHoraComienzo(String horaComienzo) {
	this.horaComienzo = horaComienzo;
}


public Calendar getFechaComienzo() {
	return fechaComienzo;
}
public Calendar setFechaComienzo(Calendar fechaComienzo) {
	Calendar fecha= Calendar.getInstance();
	fecha.set(Calendar.DAY_OF_WEEK, Calendar.WEEK_OF_MONTH);
	return fecha;
}

}
