package Utilities;

import java.util.List;

import org.testng.ISuite;
import org.testng.reporters.EmailableReporter;
import org.testng.xml.XmlSuite;

public class AfterSuite extends EmailableReporter
{
	@Override
	public void generateReport(List<XmlSuite> xml, List<ISuite> suites, String outdir) {
		
		super.generateReport(xml, suites, outdir);
		
		Email e= new Email();

		try {

			e.Emailsend();

		}catch (Exception e1) {

			e1.printStackTrace();
		}

	}
}
