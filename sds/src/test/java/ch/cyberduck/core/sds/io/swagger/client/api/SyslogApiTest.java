/*
 * Secure Data Space API
 * Version 4.1.2 - built at: 2017-03-02 18:50:25, API server: https://sds.ssp-europe.eu/api/v4
 *
 * OpenAPI spec version: 4.1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.api;

import ch.cyberduck.core.sds.io.swagger.client.ApiException;
import org.joda.time.LocalDate;
import ch.cyberduck.core.sds.io.swagger.client.model.LogOperationList;
import ch.cyberduck.core.sds.io.swagger.client.model.SyslogEventList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SyslogApi
 */
@Ignore
public class SyslogApiTest {

    private final SyslogApi api = new SyslogApi();

    
    /**
     * Get allowed Log Operations
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve syslog (&#x3D; audit log) operation IDs and the associated Log Operation Description.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Role Log Auditor required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogOperationsTest() throws ApiException {
        String xSdsAuthToken = null;
        LogOperationList response = api.getLogOperations(xSdsAuthToken);

        // TODO: test validations
    }
    
    /**
     * Get system events
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve syslog (&#x3D; audit log) events.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Role \&quot;Log Auditor\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Output may be limited to a certain number of entries. Please use filter criteria and paging.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSyslogEventsTest() throws ApiException {
        String xSdsAuthToken = null;
        String xSdsDateFormat = null;
        Integer offset = null;
        Integer limit = null;
        LocalDate dateStart = null;
        LocalDate dateEnd = null;
        List<Integer> type = null;
        List<Integer> userId = null;
        List<Integer> status = null;
        List<String> userClient = null;
        SyslogEventList response = api.getSyslogEvents(xSdsAuthToken, xSdsDateFormat, offset, limit, dateStart, dateEnd, type, userId, status, userClient);

        // TODO: test validations
    }
    
}