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
import Model.TssV2TransactionsGet200Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionDetailsApi
 */
@Ignore
public class TransactionDetailsApiTest {

    private final TransactionDetailsApi api = new TransactionDetailsApi();

    
    /**
     * Retrieve a Transaction
     *
     * Include the Request ID in the GET request to retrieve the transaction details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionTest() throws ApiException {
        String id = null;
        TssV2TransactionsGet200Response response = api.getTransaction(id);

        // TODO: test validations
    }
    
}