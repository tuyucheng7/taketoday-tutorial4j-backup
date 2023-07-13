package cn.tuyucheng.taketoday.test.dependencyinjection;

import cn.tuyucheng.taketoday.dependencyinjection.imagefileeditors.PngFileEditor;
import cn.tuyucheng.taketoday.dependencyinjection.qualifiers.PngFileEditorQualifier;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@PngFileEditorQualifier
public class PngFileEditorUnitTest {

	private static PngFileEditor pngFileEditor;


	@BeforeClass
	public static void setPngFileEditorInstance() {
		pngFileEditor = new PngFileEditor();
	}

	@Test
	public void givenPngFileEditorInstance_whenCalledopenFile_thenOneAssertion() {
		assertThat(pngFileEditor.openFile("file1.png")).isEqualTo("Opening PNG file file1.png");
	}

	@Test
	public void givenPngFileEditorInstance_whenCallededitFile_thenOneAssertion() {
		assertThat(pngFileEditor.editFile("file1.png")).isEqualTo("Editing PNG file file1.png");
	}

	@Test
	public void givenPngFileEditorInstance_whenCalledwriteFile_thenOneAssertion() {
		assertThat(pngFileEditor.writeFile("file1.png")).isEqualTo("Writing PNG file file1.png");
	}

	@Test
	public void givenPngFileEditorInstance_whenCalledsaveFile_thenOneAssertion() {
		assertThat(pngFileEditor.saveFile("file1.png")).isEqualTo("Saving PNG file file1.png");
	}
}
