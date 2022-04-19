package primerTrimestr;

public class Baile {
private int codBaile;
private String tipoBaile;
public Baile() {
	super();

}
public Baile(int codBaile, String tipoBaile) {
	super();
	this.codBaile = codBaile;
	this.tipoBaile = tipoBaile;
}
public int getCodBaile() {
	return codBaile;
}
public void setCodBaile(int codBaile) {
	this.codBaile = codBaile;
}
public String getTipoBaile() {
	return tipoBaile;
}
public void setTipoBaile(String tipoBaile) {
	this.tipoBaile = tipoBaile;
}

}
