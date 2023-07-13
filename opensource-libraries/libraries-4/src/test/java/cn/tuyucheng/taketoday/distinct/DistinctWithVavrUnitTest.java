package cn.tuyucheng.taketoday.distinct;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class DistinctWithVavrUnitTest {
	List<Person> personList;

	@Before
	public void init() {
		personList = PersonDataGenerator.getPersonListWithFakeValues();
	}

	@Test
	public void whenFilterListByName_thenSizeShouldBe4() {
		List<Person> personListFiltered = io.vavr.collection.List.ofAll(personList).distinctBy(Person::getName).toJavaList();
		assertTrue(personListFiltered.size() == 4);
	}

	@Test
	public void whenFilterListByAge_thenSizeShouldBe2() {
		List<Person> personListFiltered = io.vavr.collection.List.ofAll(personList).distinctBy(Person::getAge).toJavaList();
		assertTrue(personListFiltered.size() == 2);
	}

}