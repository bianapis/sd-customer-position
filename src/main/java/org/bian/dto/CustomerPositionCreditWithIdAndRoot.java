package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerPositionCreditWithIdAndRoot
 */
public class CustomerPositionCreditWithIdAndRoot   {
  private String customerCreditPositionAnalysisReference = null;

  private String customerPositionAnalysisReference = null;

  private String customerReference = null;

  private String customerCreditRatingAssessment = null;

  private String customerCreditRatingAssessmentType = null;

  private String customerCreditRatingNarrative = null;

  private String customerProductServiceProfile = null;

  private String customerProductServiceTypeUsage = null;

  private String productInstanceReference = null;

  private String reportInstanceReference = null;

  private String reportType = null;

  private String reportOptionsSelectionCriteria = null;

  private String reportPeriod = null;

  private String reportFormatTemplate = null;

  private Object reportRecord = null;

  private Object customerCreditPositionAnalysisRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the maintained customer credit position analysis 
   * @return customerCreditPositionAnalysisReference
  **/

  public String getCustomerCreditPositionAnalysisReference() {
    return customerCreditPositionAnalysisReference;
  }

  public void setCustomerCreditPositionAnalysisReference(String customerCreditPositionAnalysisReference) {
    this.customerCreditPositionAnalysisReference = customerCreditPositionAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the tracked consolidated position analysis for a customer - credit analysis is presented to this position  
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: internal bank credit rating/assessment 
   * @return customerCreditRatingAssessment
  **/

  public String getCustomerCreditRatingAssessment() {
    return customerCreditRatingAssessment;
  }

  public void setCustomerCreditRatingAssessment(String customerCreditRatingAssessment) {
    this.customerCreditRatingAssessment = customerCreditRatingAssessment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. consumer, small business, corporate 
   * @return customerCreditRatingAssessmentType
  **/

  public String getCustomerCreditRatingAssessmentType() {
    return customerCreditRatingAssessmentType;
  }

  public void setCustomerCreditRatingAssessmentType(String customerCreditRatingAssessmentType) {
    this.customerCreditRatingAssessmentType = customerCreditRatingAssessmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: structured report outlining basis for rating 
   * @return customerCreditRatingNarrative
  **/

  public String getCustomerCreditRatingNarrative() {
    return customerCreditRatingNarrative;
  }

  public void setCustomerCreditRatingNarrative(String customerCreditRatingNarrative) {
    this.customerCreditRatingNarrative = customerCreditRatingNarrative;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: This is the eligibility profile including in - force product terms for the customer - defining sources for credit position tracking/analysis 
   * @return customerProductServiceProfile
  **/

  public String getCustomerProductServiceProfile() {
    return customerProductServiceProfile;
  }

  public void setCustomerProductServiceProfile(String customerProductServiceProfile) {
    this.customerProductServiceProfile = customerProductServiceProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: records the sold/in-force status of a product/service with the customer 
   * @return customerProductServiceTypeUsage
  **/

  public String getCustomerProductServiceTypeUsage() {
    return customerProductServiceTypeUsage;
  }

  public void setCustomerProductServiceTypeUsage(String customerProductServiceTypeUsage) {
    this.customerProductServiceTypeUsage = customerProductServiceTypeUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the product/service for which transaction activity is to be obtained - here to assess credit/balance position utilization  
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: type of product/service activity report - transactional activity used for credit position analysis  
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: from-to dates covered by the report for analysis 
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: the customer credit position analysis - combines credit assessment with product/service available balance/utilised credit position analysis  
   * @return customerCreditPositionAnalysisRecord
  **/

  public Object getCustomerCreditPositionAnalysisRecord() {
    return customerCreditPositionAnalysisRecord;
  }

  public void setCustomerCreditPositionAnalysisRecord(Object customerCreditPositionAnalysisRecord) {
    this.customerCreditPositionAnalysisRecord = customerCreditPositionAnalysisRecord;
  }


}

