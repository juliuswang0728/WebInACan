/**
 * GetScheduledPatternPointsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public class GetScheduledPatternPointsResponse  implements java.io.Serializable {
    private bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult getScheduledPatternPointsResult;

    public GetScheduledPatternPointsResponse() {
    }

    public GetScheduledPatternPointsResponse(
           bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult getScheduledPatternPointsResult) {
           this.getScheduledPatternPointsResult = getScheduledPatternPointsResult;
    }


    /**
     * Gets the getScheduledPatternPointsResult value for this GetScheduledPatternPointsResponse.
     * 
     * @return getScheduledPatternPointsResult
     */
    public bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult getGetScheduledPatternPointsResult() {
        return getScheduledPatternPointsResult;
    }


    /**
     * Sets the getScheduledPatternPointsResult value for this GetScheduledPatternPointsResponse.
     * 
     * @param getScheduledPatternPointsResult
     */
    public void setGetScheduledPatternPointsResult(bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult getScheduledPatternPointsResult) {
        this.getScheduledPatternPointsResult = getScheduledPatternPointsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduledPatternPointsResponse)) return false;
        GetScheduledPatternPointsResponse other = (GetScheduledPatternPointsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduledPatternPointsResult==null && other.getGetScheduledPatternPointsResult()==null) || 
             (this.getScheduledPatternPointsResult!=null &&
              this.getScheduledPatternPointsResult.equals(other.getGetScheduledPatternPointsResult())));
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
        if (getGetScheduledPatternPointsResult() != null) {
            _hashCode += getGetScheduledPatternPointsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduledPatternPointsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledPatternPointsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduledPatternPointsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledPatternPointsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledPatternPointsResponse>GetScheduledPatternPointsResult"));
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
