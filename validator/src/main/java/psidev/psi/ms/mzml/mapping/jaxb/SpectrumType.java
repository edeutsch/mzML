//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.08.17 at 01:20:51 PM BST 
//


package psidev.psi.ms.mzml.mapping.jaxb;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.annotation.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * The structure that captures the generation of a peak list (including the underlying acquisitions)
 * 
 * <p>Java class for SpectrumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpectrumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spectrumDescription" type="{http://psi.hupo.org/schema_revision/mzML_0.93}SpectrumDescriptionType"/>
 *         &lt;element name="binaryDataArray" type="{http://psi.hupo.org/schema_revision/mzML_0.93}BinaryDataArrayType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dataProcessingRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="scanNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="sourceFileRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="spectrumType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpectrumType", propOrder = {
    "spectrumDescription",
    "binaryDataArray"
})
public class SpectrumType extends ParamGroupType {

    @XmlElement(required = true)
    protected SpectrumDescriptionType spectrumDescription;
    @XmlElement(required = true)
    protected List<BinaryDataArrayType> binaryDataArray;
    @XmlAttribute
    protected String dataProcessingRef;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(required = true)
    protected int msLevel;
    @XmlAttribute(required = true)
    protected int scanNumber;
    @XmlAttribute
    protected String sourceFileRef;



    private String elementName = "spectrum";

    public SpectrumType() {}

    public SpectrumType(String xmlSnippet) {
        parseXml(xmlSnippet);
    }

    public SpectrumType(Element element) {
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
            String dataProcessingRef = ele.getAttribute("dataProcessingRef");
            if (!dataProcessingRef.equals("")) { // getAttribute returns empty String if no value was specified
                setDataProcessingRef(dataProcessingRef);
            }
            String sourceFileRef = ele.getAttribute("sourceFileRef");
            if (!sourceFileRef.equals("")) { // getAttribute returns empty String if no value was specified
                setSourceFileRef(sourceFileRef);
            }
            String msLevel = ele.getAttribute("msLevel");
            if (!msLevel.equals("")) { // getAttribute returns empty String if no value was specified
                setMsLevel(Integer.parseInt(msLevel));
            }
            String scanNumber = ele.getAttribute("scanNumber");
            if (!scanNumber.equals("")) { // getAttribute returns empty String if no value was specified
                setScanNumber(Integer.parseInt(scanNumber));
            }

            // load elements
            NodeList nl = ele.getElementsByTagName("spectrumDescription");
            // we only expect one such element!
            if (nl.getLength() == 1) {
                spectrumDescription = new SpectrumDescriptionType((Element) nl.item(0));
            } else {
                throw new IllegalStateException("Expected only one 'spectrumDescription' element, but found: " + nl.getLength());
            }
            nl = null;
            nl = ele.getElementsByTagName("binaryDataArray");
            for ( int i = 0; i < nl.getLength(); i++ ) {
                this.getBinaryDataArray().add(new BinaryDataArrayType((Element) nl.item(i)));
            }
            super.create(node);
        }
    }

    ////////////////////
    // Getter + Setter

    /**
     * Gets the value of the spectrumDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SpectrumDescriptionType }
     *     
     */
    public SpectrumDescriptionType getSpectrumDescription() {
        return spectrumDescription;
    }

    /**
     * Sets the value of the spectrumDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpectrumDescriptionType }
     *     
     */
    public void setSpectrumDescription(SpectrumDescriptionType value) {
        this.spectrumDescription = value;
    }

    /**
     * Gets the value of the binaryDataArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binaryDataArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinaryDataArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryDataArrayType }
     * 
     * 
     */
    public List<BinaryDataArrayType> getBinaryDataArray() {
        if (binaryDataArray == null) {
            binaryDataArray = new ArrayList<BinaryDataArrayType>();
        }
        return this.binaryDataArray;
    }

    /**
     * Gets the value of the dataProcessingRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProcessingRef() {
        return dataProcessingRef;
    }

    /**
     * Sets the value of the dataProcessingRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProcessingRef(String value) {
        this.dataProcessingRef = value;
    }

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
     * Gets the value of the msLevel property.
     * 
     */
    public int getMsLevel() {
        return msLevel;
    }

    /**
     * Sets the value of the msLevel property.
     * 
     */
    public void setMsLevel(int value) {
        this.msLevel = value;
    }

    /**
     * Gets the value of the scanNumber property.
     * 
     */
    public int getScanNumber() {
        return scanNumber;
    }

    /**
     * Sets the value of the scanNumber property.
     * 
     */
    public void setScanNumber(int value) {
        this.scanNumber = value;
    }

    /**
     * Gets the value of the sourceFileRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFileRef() {
        return sourceFileRef;
    }

    /**
     * Sets the value of the sourceFileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFileRef(String value) {
        this.sourceFileRef = value;
    }

 
}