//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.08.17 at 01:20:51 PM BST 
//


package psidev.psi.ms.mzml.mapping.jaxb;

import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.ByteArrayInputStream;


/**
 * Expansible description of the sample used to generate the dataset, named in sampleName.
 * 
 * <p>Java class for SampleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/schema_revision/mzML_0.93}ParamGroupType">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleType")
public class SampleType
    extends ParamGroupType
{

    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute
    protected String name;


    private String elementName = "sample";

    public SampleType() {}

    public SampleType(String xmlSnippet) {
        parseXml(xmlSnippet);
    }

    public SampleType(Element element) {
        create(element);
    }

    ///////////////////
    // utilities

    private void parseXml(String xmlSnippet) {
        Document document = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            ByteArrayInputStream str = new ByteArrayInputStream(xmlSnippet.getBytes());
            document = builder.parse( str );
        } catch ( Exception e ) {
            e.printStackTrace();
        }


        // we always expect a String representing a single xml tag, not a list of xml tags!
        if (document != null) {
            NodeList nl = document.getElementsByTagName(elementName);
            if (nl.getLength() == 1) {
                Element ele = (Element) nl.item(0);
                create(ele);
            } else {
                throw new IllegalStateException("Expected only one '" + elementName + "' element, but found: " + nl.getLength());
            }
        }

    }

    protected void create(Node node) {
        Element ele = (Element) node;
        if (ele != null) {
            // load attributes
            String id = ele.getAttribute("id");
            if (!id.equals("")) { // getAttribute returns empty String if no value was specified
                setId(id);
            }
            String name = ele.getAttribute("name");
            if (!name.equals("")) { // getAttribute returns empty String if no value was specified
                setName(name);
            }
            // load elements
            // inherited form ParamGroupType
            super.create(node);
        }
    }

    ////////////////////
    // Getter + Setter

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
