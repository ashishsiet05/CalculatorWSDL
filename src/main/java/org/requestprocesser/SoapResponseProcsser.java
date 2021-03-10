package org.requestprocesser;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tempuri.AddResponse;


public class SoapResponseProcsser implements Processor {
	Logger log = LoggerFactory.getLogger(SoapResponseProcsser.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		AddResponse addr=exchange.getIn().getBody(AddResponse.class);
		log.info("result ================"+addr.getAddResult());
		
		
	}
	
	

}
