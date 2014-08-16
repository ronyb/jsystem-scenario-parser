package org.topq.scenarioparser;

import java.io.File;

import org.junit.Test;

public class ScenarioParserTest {

	@Test
	public void testScenarioParser() throws Exception {
		
		String currentDir = System.getProperty("user.dir");

		String scenarionsDir = currentDir + File.separator +
				"src" + File.separator +
				"test" + File.separator +
				"resources" + File.separator +
				"scenarios";
		
		String scenarioName = "root_scenario";
		
		ScenarioNode scenarioModel = ScenarioParser.getScenarioModel(scenarionsDir, scenarioName, null, null);
		
		System.out.println(scenarioModel);
		scenarioModel.printPropertiesRecursively();
		System.out.println(scenarioModel.getXmlFilePath());
		System.out.println(scenarioModel.getPropertiesObject());
	}
}
