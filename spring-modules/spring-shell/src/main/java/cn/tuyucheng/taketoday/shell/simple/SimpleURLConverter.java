package cn.tuyucheng.taketoday.shell.simple;

import org.springframework.shell.core.Completion;
import org.springframework.shell.core.Converter;
import org.springframework.shell.core.MethodTarget;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Component
public class SimpleURLConverter implements Converter<URL> {

	@Override
	public URL convertFromText(String value, Class<?> requiredType, String optionContext) {
		try {
			return new URL(value);
		} catch (MalformedURLException ex) {
			// Ignore
		}
		return null;
	}

	@Override
	public boolean getAllPossibleValues(List<Completion> completions, Class<?> requiredType, String existingData, String optionContext, MethodTarget target) {
		return false;
	}

	@Override
	public boolean supports(Class<?> requiredType, String optionContext) {
		return URL.class.isAssignableFrom(requiredType);
	}

}