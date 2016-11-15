package quiz;

public class Usuario {
    private int id;
    private String usuario;
    private int testsCount;
    private double testsGradeSum;
    private double lastGrade;

    public Usuario(){}
    
    public Usuario(String usuario){
        this.usuario = usuario;
        this.testsGradeSum = this.lastGrade = this.testsCount = 0;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getTestsCount() {
        return testsCount;
    }

    public double getTestsGradeSum() {
        return testsGradeSum;
    }

    public void setTestsGradeSum(double testsGradeSum) {
        this.testsGradeSum += testsGradeSum;
        this.testsCount++;
    }

    public double getLastGrade() {
        return lastGrade;
    }

    public void setLastGrade(double lastGrade) {
        this.lastGrade = lastGrade;
    }
    
}
