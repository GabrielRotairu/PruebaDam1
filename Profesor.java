package primerTrimestr;

public class Profesor {
private int idProfesor;
private String nombreProfesor;
public Profesor() {
	super();
	// TODO Auto-generated constructor stub
}
public Profesor(int idProfesor, String nombreProfesor) {
	super();
	this.idProfesor = idProfesor;
	this.nombreProfesor = nombreProfesor;
}
public int getIdProfesor() {
	return idProfesor;
}
public void setIdProfesor(int idProfesor) {
	this.idProfesor = idProfesor;
}
public String getNombreProfesor() {
	return nombreProfesor;
}
public void setNombreProfesor(String nombreProfesor) {
	this.nombreProfesor = nombreProfesor;
}

}
