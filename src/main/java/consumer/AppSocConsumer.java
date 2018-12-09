package consumer;


import br.com.soc.tardelli.examws.*;

public class AppSocConsumer {

    public static void main(String[] args) {

        ObjectFactory objectFactory = new ObjectFactory();
        GetExamsRequest con = objectFactory.createGetExamsRequest();

        //setar o ID do exame
        con.setId(1);

        ExamsPortService service = new ExamsPortService();
        ExamsPort soap = service.getExamsPortSoap11();

        GetExamsResponse exams = soap.getExams(con);

        System.out.println(exams.getExam().getName());
    }

}
