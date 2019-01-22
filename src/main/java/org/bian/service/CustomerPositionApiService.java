/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerPositionApiService {

	CustomerPositionRecordResponse record(String crReferenceId, CustomerPositionRecordRequest request);
	
	CustomerPositionAnalysisWithIdAndRoot requestPost(CustomerPositionAnalysisBase request);
	
	CustomerPositionAnalysisWithIdAndRoot requestPut(String crReferenceId, CustomerPositionAnalysisBase request);
	
	CustomerPositionAnalysisWithIdAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CustomerPositionCashflowWithIdAndRoot retrieveCashflows(String crReferenceId, String bqReferenceId);
	
	CustomerPositionCollateralWithIdAndRoot retrieveCollaterals(String crReferenceId, String bqReferenceId);
	
	CustomerPositionCreditWithIdAndRoot retrieveCredits(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
}
