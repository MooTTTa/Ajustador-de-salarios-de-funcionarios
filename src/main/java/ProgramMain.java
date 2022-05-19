import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe quantos funcionarios: ");
        int n = sc.nextInt();

        List<DadosFuncionario> list = new ArrayList<>();

        for(int i = 0; i < n; i++){

            System.out.println("Funcionario " + (i + 1) + ": ");

            System.out.println();
            System.out.println("informe o ID: ");
            int id = sc.nextInt();

            while (hasId(list, id)){
                System.out.println("Id já existente, por favor inerir outro! ");
                id = sc.nextInt();
            }

            sc.nextLine();

            System.out.println("informe o Nome: ");
            String nome = sc.nextLine();

            System.out.println("informe o Salario: ");
            double Salary = sc.nextDouble();

            System.out.println();

            DadosFuncionario dadosFuncionario = new DadosFuncionario(id, nome, Salary);

            list.add(dadosFuncionario);
        }
        System.out.println();
        System.out.println("Entre com o Id do funcionario que deseja incrementar: ");
        int idSalary = sc.nextInt();

        DadosFuncionario dadosFuncionario = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if(dadosFuncionario == null) {
            System.out.println("Id não existe!");
        } else {
            System.out.println("Entre com a porcentagem: ");
            double porcentagem = sc.nextDouble();
            dadosFuncionario.increaseSalary(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionarios: ");
        for (DadosFuncionario dadosFuncionarios : list){
            System.out.println(dadosFuncionarios);
        }

        sc.close();

    }

    public static boolean hasId(List<DadosFuncionario> list, int id){
        DadosFuncionario dadosFuncionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return dadosFuncionario != null;
    }
}
