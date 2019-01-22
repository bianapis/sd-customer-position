package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerPositionCashflowWithIdAndRoot
 */
public class CustomerPositionCashflowWithIdAndRoot   {
  private String customerCashflowPositionAnalysisReference = null;

  private String customerPositionAnalysisReference = null;

  private String customerReference = null;

  private String customerProductServiceProfile = null;

  private String customerProductServiceTypeUsage = null;

  private String productInstanceReference = null;

  private String reportInstanceReference = null;

  private String reportType = null;

  private String reportOptionsSelectionCriteria = null;

  private String reportPeriod = null;

  private String reportFormatTemplate = null;

  private Object reportRecord = null;

  private Object customerCashflowPositionAnalysisRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the maintained customer cashflow analysis 
   * @return customerCashflowPositionAnalysisReference
  **/

  public String getCustomerCashflowPositionAnalysisReference() {
    return customerCashflowPositionAnalysisReference;
  }

  public void setCustomerCashflowPositionAnalysisReference(String customerCashflowPositionAnalysisReference) {
    this.customerCashflowPositionAnalysisReference = customerCashflowPositionAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the tracked consolidated position analysis for a customer - cashflow analysis is presented to this position  
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the product/service for which transaction activity is to be obtained 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the product/service activity report 
   * @return reportInstanceReference
  **/

  public String getReportInstanceReference() {
    return reportInstanceReference;
  }

  public void setReportInstanceReference(String reportInstanceReference) {
    this.reportInstanceReference = reportInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: type of product/service activity report - transactional activity used for cashflow analysis  
   * @return reportType
  **/

  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines content/transaction types to be included in extract 
   * @return reportOptionsSelectionCriteria
  **/

  public String getReportOptionsSelectionCriteria() {
    return reportOptionsSelectionCriteria;
  }

  public void setReportOptionsSelectionCriteria(String reportOptionsSelectionCriteria) {
    this.reportOptionsSelectionCriteria = reportOptionsSelectionCriteria;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: from 
   * @return reportPeriod
  **/

  public String getReportPeriod() {
    return reportPeriod;
  }

  public void setReportPeriod(String reportPeriod) {
    this.reportPeriod = reportPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines presentation format 
   * @return reportFormatTemplate
  **/

  public String getReportFormatTemplate() {
    return reportFormatTemplate;
  }

  public void setReportFormatTemplate(String reportFormatTemplate) {
    this.reportFormatTemplate = reportFormatTemplate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: the product/service activity report 
   * @return reportRecord
  **/

  public Object getReportRecord() {
    return reportRecord;
  }

  public void setReportRecord(Object reportRecord) {
    this.reportRecord = reportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: the customer cashflow analysis - past, current position and projected cash flows as derived from all active product/service activity reports  
   * @return customerCashflowPositionAnalysisRecord
  **/

  public Object getCustomerCashflowPositionAnalysisRecord() {
    return customerCashflowPositionAnalysisRecord;
  }

  public void setCustomerCashflowPositionAnalysisRecord(Object customerCashflowPositionAnalysisRecord) {
    this.customerCashflowPositionAnalysisRecord = customerCashflowPositionAnalysisRecord;
  }


}

