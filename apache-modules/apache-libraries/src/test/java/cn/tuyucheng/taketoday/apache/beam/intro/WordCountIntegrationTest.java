package cn.tuyucheng.taketoday.apache.beam.intro;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WordCountIntegrationTest {

	@Test
	@Ignore
	public void givenInputFile_whenWordCountRuns_thenJobFinishWithoutError() {
		boolean jobDone = WordCount.wordCount("src/test/resources/wordcount.txt", "target/output");
		assertTrue(jobDone);
	}

}
