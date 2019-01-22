/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerPositionApiServiceImpl implements CustomerPositionApiService {

	public CustomerPositionRecordResponse record(String crReferenceId, CustomerPositionRecordRequest request){
		return JsonReader.read("record-CustomerPositionRecordResponse.json",new TypeReference<CustomerPositionRecordResponse>(){});
	}
	
	public CustomerPositionAnalysisWithIdAndRoot requestPost(CustomerPositionAnalysisBase request){
		return JsonReader.read("requestPost-CustomerPositionAnalysisWithIdAndRoot.json",new TypeReference<CustomerPositionAnalysisWithIdAndRoot>(){});
	}
	
	public CustomerPositionAnalysisWithIdAndRoot requestPut(String crReferenceId, CustomerPositionAnalysisBase request){
		return JsonReader.read("requestPut-CustomerPositionAnalysisWithIdAndRoot.json",new TypeReference<CustomerPositionAnalysisWithIdAndRoot>(){});
	}
	
	public CustomerPositionAnalysisWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CustomerPositionAnalysisWithIdAndRoot.json",new TypeReference<CustomerPositionAnalysisWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerPositionCashflowWithIdAndRoot retrieveCashflows(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerPositionCashflowWithIdAndRoot.json",new TypeReference<CustomerPositionCashflowWithIdAndRoot>(){});
	}
	
	public CustomerPositionCollateralWithIdAndRoot retrieveCollaterals(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerPositionCollateralWithIdAndRoot.json",new TypeReference<CustomerPositionCollateralWithIdAndRoot>(){});
	}
	
	public CustomerPositionCreditWithIdAndRoot retrieveCredits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerPositionCreditWithIdAndRoot.json",new TypeReference<CustomerPositionCreditWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
