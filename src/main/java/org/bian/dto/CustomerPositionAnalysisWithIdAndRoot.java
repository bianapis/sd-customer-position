package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerPositionAnalysisWithIdAndRoot
 */
public class CustomerPositionAnalysisWithIdAndRoot   {
  private String customerPositionAnalysisReference = null;

  private String customerReference = null;

  private String customerProductServiceProfile = null;

  private String customerProductServiceTypeUsage = null;

  private Object customerPositionAnalysisRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the tracked position analysis for a customer 
   * @return customerPositionAnalysisReference
  **/

  public String getCustomerPositionAnalysisReference() {
    return customerPositionAnalysisReference;
  }

  public void setCustomerPositionAnalysisReference(String customerPositionAnalysisReference) {
    this.customerPositionAnalysisReference = customerPositionAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the customer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: This is the eligibility profile including in - force product terms for the customer - defining sources for position tracking/analysis 
   * @return customerProductServiceProfile
  **/

  public String getCustomerProductServiceProfile() {
    return customerProductServiceProfile;
  }

  public void setCustomerProductServiceProfile(String customerProductServiceProfile) {
    this.customerProductServiceProfile = customerProductServiceProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: records the sold/in 
   * @return customerProductServiceTypeUsage
  **/

  public String getCustomerProductServiceTypeUsage() {
    return customerProductServiceTypeUsage;
  }

  public void setCustomerProductServiceTypeUsage(String customerProductServiceTypeUsage) {
    this.customerProductServiceTypeUsage = customerProductServiceTypeUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: is the consolidated position analysis tracked for the customer - combines all analyses types defined below  
   * @return customerPositionAnalysisRecord
  **/

  public Object getCustomerPositionAnalysisRecord() {
    return customerPositionAnalysisRecord;
  }

  public void setCustomerPositionAnalysisRecord(Object customerPositionAnalysisRecord) {
    this.customerPositionAnalysisRecord = customerPositionAnalysisRecord;
  }


}

