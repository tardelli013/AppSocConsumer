
package br.com.soc.tardelli.examws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exam" type="{http://tardelli.soc.com.br/examws}exam"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exam"
})
@XmlRootElement(name = "getExamsResponse")
public class GetExamsResponse {

    @XmlElement(required = true)
    protected Exam exam;

    /**
     * Obtém o valor da propriedade exam.
     * 
     * @return
     *     possible object is
     *     {@link Exam }
     *     
     */
    public Exam getExam() {
        return exam;
    }

    /**
     * Define o valor da propriedade exam.
     * 
     * @param value
     *     allowed object is
     *     {@link Exam }
     *     
     */
    public void setExam(Exam value) {
        this.exam = value;
    }

}
