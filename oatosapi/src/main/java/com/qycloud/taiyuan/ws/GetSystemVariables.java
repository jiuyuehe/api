
package com.qycloud.taiyuan.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdt" type="{http://oup.rockontrol.com}systemVariableCdt" minOccurs="0"/>
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
    "cdt"
})
@XmlRootElement(name = "getSystemVariables")
public class GetSystemVariables {

    protected SystemVariableCdt cdt;

    /**
     * 获取cdt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SystemVariableCdt }
     *     
     */
    public SystemVariableCdt getCdt() {
        return cdt;
    }

    /**
     * 设置cdt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SystemVariableCdt }
     *     
     */
    public void setCdt(SystemVariableCdt value) {
        this.cdt = value;
    }

}
