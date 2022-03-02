package java8concept.optionalexp;

import java.util.Optional;

public class CreateOptionalObjectDemo {
	public static void main(String[] args) {

		String genderDet = null;

		System.out.println("genderDet ...." + genderDet);

		if (genderDet != null) {
			System.out.println("genderDet ...." + genderDet);
		} else {
			System.out.println("gender not present");

		}

		Optional<String> gender = Optional.of("MALE");
		
		System.out.println(gender.get());
		
		
		
		gender.ifPresent(value -> System.out.println("value ...." + value));


		// create a Optional
		Optional<Integer> op = Optional.of(345);

		// print value
		System.out.println("Optional: " + op);

		// apply ifPresentOrElse
		op.ifPresentOrElse((value) -> {
			System.out.println("Value is present, its: " + value);
		}, () -> {
			System.out.println("Value is empty");
		});

	}
}