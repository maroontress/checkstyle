////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.whitespace;

class myFoo
{
	@MapFeature.Require({ALLOWS_NULL_KEYS, ALLOWS_NULL_VALUES})
	private void foo()
	{
		int i = 0;
		String[][] x = {{"foo"}};
		for (first = 0; first < len && matches(sequence.charAt(first)); first++) {}
		while (i = 1) {}
		do {} while (i == 1);
	}
}

interface SupplierFunction<T> extends Function<Supplier<T>, T> {}

class EmptyFoo {}

enum EmptyFooEnum {}
