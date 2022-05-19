public class DadosFuncionario {

    private int id;
    private String nome;
    private Double salary;

    public DadosFuncionario() {

    }

    public DadosFuncionario(int id, String nome, double salary) {
        this.id = id;
        this.nome = nome;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salary;
    }

    public void setSalario(Double salario) {
        this.salary = salario;
    }

    public void increaseSalary(double percentege) {
        salary += salary * percentege / 100.0;
    }

    public String toString(){
        return id + ",  " + nome + ", " + salary;
    }


}
