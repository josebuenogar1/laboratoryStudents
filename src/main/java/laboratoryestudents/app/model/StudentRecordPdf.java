package laboratoryestudents.app.model;

import com.lowagie.text.*;
import com.lowagie.text.alignment.HorizontalAlignment;
import com.lowagie.text.alignment.VerticalAlignment;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Font;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

public class StudentRecordPdf {
    private StudentRecord studentRecord;

    public StudentRecordPdf(StudentRecord studentRecord) {
        this.studentRecord =studentRecord;
    }

    public void export(HttpServletResponse response) throws DocumentException, IOException {
        String name= studentRecord.getName();
        String  idStudent    = studentRecord.getIdStudent();
        String  hour_number = studentRecord.getHour_number();
        String workStation = studentRecord.getWorkStation();
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        Paragraph p1 = new Paragraph(new Chunk(
                "Carta de Responsabilidad ",
                FontFactory.getFont(FontFactory.HELVETICA, 18)));
        p1.setAlignment(Element.ALIGN_CENTER);

        Paragraph p2 = new Paragraph(new Phrase(
                "yo " + name.toUpperCase() + " estudiante de la universidad con matrícula "+ idStudent.toUpperCase() +
                " hago constar que estaré trabajando en la estacion de trabajo " + workStation.toUpperCase() +" del laboratorio, junto con mi equipo conformado por:"
                , FontFactory.getFont(
                FontFactory.HELVETICA, 12)));

        Paragraph p3 = new Paragraph("En el horario " + hour_number +":00 h" ,
                FontFactory.getFont(FontFactory.HELVETICA, 12));

        Paragraph p4 =new Paragraph("Para ello se necesita el siguiente material:");

        //structure
        document.open();
        document.add(p1);
        document.add( Chunk.NEWLINE );
        document.add(p2);
        document.add(membersTable());
        document.add(p3);
        document.add(p4);
        document.add(materialTable());
        document.add( Chunk.NEWLINE );
        document.add(new Paragraph("Me comprometo a cumplir con el reglamento del laboratorio"));
        document.add( Chunk.NEWLINE );
        Paragraph p5 =new Paragraph("______________________" + "                                 " + "__________________");
        p5.setAlignment(Element.ALIGN_CENTER);
        document.add(p5);
        Paragraph p6 = new Paragraph("Estudiante responsable" + "                                     " + "Laboratorista");
        p6.setAlignment(Element.ALIGN_CENTER);
        document.add(p6);
        document.close();

    }

    public Table membersTable(){
        //table
        Font font = new Font(Font.HELVETICA, 12, Font.BOLD);
        Table table = new Table(1);
        table.setPadding(5);
        table.setSpacing(1);
        table.setWidth(50);
        // Setting table headers
        Cell cell = new Cell("Integrantes de equipo");
        cell.setHeader(true);
        cell.setVerticalAlignment(VerticalAlignment.CENTER);
        cell.setHorizontalAlignment(HorizontalAlignment.CENTER);
        cell.setColspan(1);
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        table.addCell(cell);
        table.endHeaders();
        table.addCell(studentRecord.getMember1());
        table.addCell(studentRecord.getMember2());
        table.addCell(studentRecord.getMember3());
        table.addCell(studentRecord.getMember4());
        table.addCell(studentRecord.getMember5());
        table.addCell(studentRecord.getMember6());
        table.addCell(studentRecord.getMember7());
        return table;
    }

    public Table materialTable(){
        //table
        Font font = new Font(Font.HELVETICA, 12, Font.BOLD);
        Table table = new Table(1);
        table.setPadding(5);
        table.setSpacing(1);
        table.setWidth(50);
        // Setting table headers
        Cell cell = new Cell("Material extra:");
        cell.setHeader(true);
        cell.setVerticalAlignment(VerticalAlignment.CENTER);
        cell.setHorizontalAlignment(HorizontalAlignment.CENTER);
        cell.setColspan(1);
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        table.addCell(cell);
        table.endHeaders();
        table.addCell(studentRecord.getMaterial());
        return table;
    }
}
