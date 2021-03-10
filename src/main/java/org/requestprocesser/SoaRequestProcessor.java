package org.requestprocesser;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.tempuri.Add;

public class SoaRequestProcessor implements Processor {
	
	public void process(Exchange ex) throws Exception{

	 Add add=new Add();
	  add.setIntA(5);
	  add.setIntB(6);
	  ex.getIn().setBody(add);

	  
		
	}

	
	
}