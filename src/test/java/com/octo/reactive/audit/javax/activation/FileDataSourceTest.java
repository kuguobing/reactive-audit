package com.octo.reactive.audit.javax.activation;

import com.octo.reactive.audit.AuditReactive;
import com.octo.reactive.audit.IOTestTools;
import com.octo.reactive.audit.lib.AuditReactiveException;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileDataSourceTest
{
	@Test(expected = AuditReactiveException.class)
	public void append() throws InterruptedException, IOException
	{
		AuditReactive.strict.commit();
		Appendable app = new FileWriter(IOTestTools.getTempFile());
		app.append("a");
	}
}