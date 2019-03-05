/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiException;
import Model.CreateCreditRequest;
import Model.PtsV2CreditsPost201Response;
import Model.PtsV2PaymentsPost502Response;
import Model.PtsV2PaymentsRefundPost400Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CreditApi
 */
@Ignore
public class CreditApiTest {

    private final CreditApi api = new CreditApi();

    
    /**
     * Process a Credit
     *
     * POST to the credit resource to credit funds to a specified credit card.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCreditTest() throws ApiException {
        CreateCreditRequest createCreditRequest = null;
        PtsV2CreditsPost201Response response = api.createCredit(createCreditRequest);

        // TODO: test validations
    }
    
}