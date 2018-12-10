package consumer;


import br.com.soc.tardelli.examws.*;

public class AppSocConsumer {

    public static void main(String[] args) {

        ObjectFactory objectFactory = new ObjectFactory();
        GetExamsRequest con = objectFactory.createGetExamsRequest();

        //TODO informar aqui o ID do exame que deseja visualizar
        con.setId(1);

        ExamsPortService service = new ExamsPortService();
        ExamsPort soap = service.getExamsPortSoap11();

        try {
            GetExamsResponse exams = soap.getExams(con);
            System.out.println(
                    "Id: " + exams.getExam().getExamId() +
                    " - Exame: " + exams.getExam().getExamType() +
                    " - Paciente: " + exams.getExam().getName() +
                    " - idate: " + exams.getExam().getAge() +
                    " - Sexo: " + exams.getExam().getGender() +
                    " - Medico: " + exams.getExam().getCrmRequester() +
                    " - Data: " + exams.getExam().getExaminationDate());

        } catch (Exception e) {
            System.out.println("Id não encontrado");
        }

    }

}
