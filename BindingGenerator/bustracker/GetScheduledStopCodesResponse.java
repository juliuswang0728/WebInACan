/**
 * GetScheduledStopCodesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public class GetScheduledStopCodesResponse  implements java.io.Serializable {
    private bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult getScheduledStopCodesResult;

    public GetScheduledStopCodesResponse() {
    }

    public GetScheduledStopCodesResponse(
           bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult getScheduledStopCodesResult) {
           this.getScheduledStopCodesResult = getScheduledStopCodesResult;
    }


    /**
     * Gets the getScheduledStopCodesResult value for this GetScheduledStopCodesResponse.
     * 
     * @return getScheduledStopCodesResult
     */
    public bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult getGetScheduledStopCodesResult() {
        return getScheduledStopCodesResult;
    }


    /**
     * Sets the getScheduledStopCodesResult value for this GetScheduledStopCodesResponse.
     * 
     * @param getScheduledStopCodesResult
     */
    public void setGetScheduledStopCodesResult(bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult getScheduledStopCodesResult) {
        this.getScheduledStopCodesResult = getScheduledStopCodesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduledStopCodesResponse)) return false;
        GetScheduledStopCodesResponse other = (GetScheduledStopCodesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduledStopCodesResult==null && other.getGetScheduledStopCodesResult()==null) || 
             (this.getScheduledStopCodesResult!=null &&
              this.getScheduledStopCodesResult.equals(other.getGetScheduledStopCodesResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetScheduledStopCodesResult() != null) {
            _hashCode += getGetScheduledStopCodesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduledStopCodesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopCodesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduledStopCodesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopCodesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopCodesResponse>GetScheduledStopCodesResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
