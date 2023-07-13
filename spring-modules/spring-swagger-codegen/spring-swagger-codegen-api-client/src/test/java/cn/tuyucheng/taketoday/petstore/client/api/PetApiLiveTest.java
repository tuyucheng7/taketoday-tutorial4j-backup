/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cn.tuyucheng.taketoday.petstore.client.api;

import cn.tuyucheng.taketoday.petstore.client.model.ModelApiResponse;
import cn.tuyucheng.taketoday.petstore.client.model.Pet;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * API tests for PetApi
 */
@Ignore
public class PetApiLiveTest {

	private final PetApi api = new PetApi();


	/**
	 * Add a new pet to the store
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void addPetTest() {
		Pet body = null;
		api.addPet(body);

		// TODO: test validations
	}

	/**
	 * Deletes a pet
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void deletePetTest() {
		Long petId = null;
		String apiKey = null;
		api.deletePet(petId, apiKey);

		// TODO: test validations
	}

	/**
	 * Finds Pets by status
	 * <p>
	 * Multiple status values can be provided with comma separated strings
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void findPetsByStatusTest() {
		List<String> status = null;
		List<Pet> response = api.findPetsByStatus(status);

		// TODO: test validations
	}

	/**
	 * Finds Pets by tags
	 * <p>
	 * Muliple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void findPetsByTagsTest() {
		List<String> tags = null;
		List<Pet> response = api.findPetsByTags(tags);

		// TODO: test validations
	}

	/**
	 * Find pet by ID
	 * <p>
	 * Returns a single pet
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getPetByIdTest() {
		Long petId = null;
		Pet response = api.getPetById(petId);

		// TODO: test validations
	}

	/**
	 * Update an existing pet
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void updatePetTest() {
		Pet body = null;
		api.updatePet(body);

		// TODO: test validations
	}

	/**
	 * Updates a pet in the store with form data
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void updatePetWithFormTest() {
		Long petId = null;
		String name = null;
		String status = null;
		api.updatePetWithForm(petId, name, status);

		// TODO: test validations
	}

	/**
	 * uploads an image
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void uploadFileTest() {
		Long petId = null;
		String additionalMetadata = null;
		File file = null;
		ModelApiResponse response = api.uploadFile(petId, additionalMetadata, file);

		// TODO: test validations
	}
}